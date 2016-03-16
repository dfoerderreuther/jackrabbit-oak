package org.apache.jackrabbit.cluster;

import org.apache.jackrabbit.oak.plugins.document.DocumentMK;
import org.apache.jackrabbit.oak.plugins.document.DocumentNodeStore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Dominik Foerderreuther <df@adobe.com> on 15/03/16.
 */
public class DocumentNodeStoreInitializationTest {

    @Test
    public void testDefaultInitialization() throws Exception {
        DocumentNodeStore nodeStore = new DocumentMK.Builder()
                .getNodeStore();

        assertThat(nodeStore.getAsyncDelay(), is(1000));
        assertThat(nodeStore.getMaxBackOffMillis(), is(2000));
    }

    @Test
    public void testCustomInitialization() throws Exception {
        DocumentNodeStore nodeStore = new DocumentMK.Builder()
                .setAsyncDelay(4000)
                .getNodeStore();

        assertThat(nodeStore.getAsyncDelay(), is(4000));
        assertThat(nodeStore.getMaxBackOffMillis(), is(2000));
    }

}
