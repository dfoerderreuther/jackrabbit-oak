# Oak Cluster Test

This project is a playground for reconstructing clustering problems with oak. It uses an embedded mongodb and brings a junit rule for creating oak cluster nodes.

## Usage of JUnit-Rule OakClusterRepository: 

```Java

    @Rule
    public OakClusterRepository oakClusterRepository = new OakClusterRepository();

    @Test
    public void shouldCreateClusterOfThree() throws Exception {
        javax.jcr.Repository one = oakClusterRepository.repository();
        javax.jcr.Repository two = oakClusterRepository.repository();  
```

## Reports

### Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision ...

This exceptions happens a lot while writing with several sessions across a cluster. 
See [detailed report page](reports/2REPOS_50THREADS.md)
