/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jackrabbit.oak.plugins.document.persistentCache;

import static com.google.common.cache.RemovalCause.COLLECTED;
import static com.google.common.cache.RemovalCause.EXPIRED;
import static com.google.common.cache.RemovalCause.SIZE;
import static java.util.Collections.singleton;

import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

import javax.annotation.Nullable;

import org.apache.jackrabbit.oak.plugins.document.DocumentNodeStore;
import org.apache.jackrabbit.oak.plugins.document.DocumentStore;
import org.apache.jackrabbit.oak.plugins.document.persistentCache.PersistentCache.GenerationCache;
import org.apache.jackrabbit.oak.plugins.document.persistentCache.async.CacheActionDispatcher;
import org.apache.jackrabbit.oak.plugins.document.persistentCache.async.CacheWriteQueue;
import org.apache.jackrabbit.oak.stats.StatisticsProvider;
import org.apache.jackrabbit.oak.stats.TimerStats;
import org.h2.mvstore.MVMap;
import org.h2.mvstore.WriteBuffer;
import org.h2.mvstore.type.DataType;

import com.google.common.base.Function;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheStats;
import com.google.common.cache.RemovalCause;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

class NodeCache<K, V> implements Cache<K, V>, GenerationCache, EvictionListener<K, V> {

    private static final Set<RemovalCause> EVICTION_CAUSES = ImmutableSet.of(COLLECTED, EXPIRED, SIZE);

    private final PersistentCache cache;
    private final PersistentCacheStats stats;
    private final Cache<K, V> memCache;
    private final MultiGenerationMap<K, V> map;
    private final CacheType type;
    private final DataType keyType;
    private final DataType valueType;
    private final CacheWriteQueue<K, V> writerQueue;

    NodeCache(
            PersistentCache cache,
            Cache<K, V> memCache,
            DocumentNodeStore docNodeStore, 
            DocumentStore docStore,
            CacheType type,
            CacheActionDispatcher dispatcher,
            StatisticsProvider statisticsProvider) {
        this.cache = cache;
        this.memCache = memCache;
        this.type = type;
        PersistentCache.LOG.info("wrapping map " + this.type);
        map = new MultiGenerationMap<K, V>();
        keyType = new KeyDataType(type);
        valueType = new ValueDataType(docNodeStore, docStore, type);
        this.writerQueue = new CacheWriteQueue<K, V>(dispatcher, cache, map);
        this.stats = new PersistentCacheStats(type, statisticsProvider);
    }
    
    @Override
    public CacheType getType() {
        return type;
    }
    
    @Override
    public void addGeneration(int generation, boolean readOnly) {
        MVMap.Builder<K, V> b = new MVMap.Builder<K, V>().
                keyType(keyType).valueType(valueType);
        String mapName = type.name();
        CacheMap<K, V> m = cache.openMap(generation, mapName, b);
        map.addReadMap(generation, m);
        if (!readOnly) {
            map.setWriteMap(m);
            stats.addWriteGeneration(generation);
        }
    }
    
    @Override
    public void removeGeneration(int generation) {
        map.removeReadMap(generation);
        stats.removeReadGeneration(generation);
    }
    
    private V readIfPresent(K key) {
        if (writerQueue.waitsForInvalidation(key)) {
            return null;
        }
        cache.switchGenerationIfNeeded();
        TimerStats.Context ctx = stats.startReadTimer();
        V v = map.get(key);
        ctx.stop();
        return v;
    }

    private void broadcast(final K key, final V value) {
        cache.broadcast(type, new Function<WriteBuffer, Void>() {
            @Override
            @Nullable
            public Void apply(@Nullable WriteBuffer buffer) {
                keyType.write(buffer, key);
                if (value == null) {
                    buffer.put((byte) 0);
                } else {
                    buffer.put((byte) 1);
                    valueType.write(buffer, value);
                }
                return null;
            }
        });
    }

    @SuppressWarnings("unchecked")
    @Override
    @Nullable
    public V getIfPresent(Object key) {
        V value = memCache.getIfPresent(key);
        if (value != null) {
            return value;
        }
        stats.markRequest();

        value = readIfPresent((K) key);
        if (value != null) {
            memCache.put((K) key, value);
            stats.markHit();
        }
        return value;
    }

    @Override
    public V get(K key,
            Callable<? extends V> valueLoader)
            throws ExecutionException {
            
        // Get stats covered in getIfPresent
        V value = getIfPresent(key);
        if (value != null) {
            return value;
        }
        
        // Track entry load time
        TimerStats.Context ctx = stats.startLoaderTimer();
        try {
            value = memCache.get(key, valueLoader);
            ctx.stop();
            broadcast(key, value);
            return value;
        } catch (ExecutionException e) {
            stats.markException();
            throw e;
         }        
    }

    @Override
    public ImmutableMap<K, V> getAllPresent(
            Iterable<?> keys) {
        return memCache.getAllPresent(keys);
    }

    @Override
    public void put(K key, V value) {
        memCache.put(key, value);
        broadcast(key, value);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void invalidate(Object key) {
        memCache.invalidate(key);
        writerQueue.addInvalidate(singleton((K) key));
        broadcast((K) key, null);
        stats.markInvalidateOne();
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        memCache.putAll(m);
    }

    @Override
    public void invalidateAll(Iterable<?> keys) {
        memCache.invalidateAll(keys);
    }

    @Override
    public void invalidateAll() {
        memCache.invalidateAll();
        map.clear();
        stats.markInvalidateAll();
    }

    @Override
    public long size() {
        return memCache.size();
    }

    @Override
    public CacheStats stats() {
        return memCache.stats();
    }

    @Override
    public ConcurrentMap<K, V> asMap() {
        return memCache.asMap();
    }

    @Override
    public void cleanUp() {
        memCache.cleanUp();
    }

    @Override
    @SuppressWarnings("unchecked")
    public void receive(ByteBuffer buff) {
        K key = (K) keyType.read(buff);
        V value;
        if (buff.get() == 0) {
            value = null;
            memCache.invalidate(key);
        } else {
            value = (V) valueType.read(buff);
            memCache.put(key, value);
        }
        stats.markRecvBroadcast();
    }

    /**
     * Invoked on the eviction from the {@link #memCache}
     */
    @Override
    public void evicted(K key, V value, RemovalCause cause) {
        if (EVICTION_CAUSES.contains(cause) && value != null) { 
            // invalidations are handled separately
            writerQueue.addPut(key, value);

            long memory = 0L;
            memory += (key == null ? 0L: keyType.getMemory(key));
            memory += (value == null ? 0L: valueType.getMemory(value));
            stats.markBytesWritten(memory);
            stats.markPut();
        }
    }

    public PersistentCacheStats getPersistentCacheStats() {
        return stats;
    }

}