# org.apache.jackrabbit.cluster.ConcurrentOakClusterTest.twoCluster50Threads

## Sample output (2 Repositoriess, 50 Threads, each with 50 write attempts. Result: 15 Exceptions, 15 nodes missing.

```Logfile
[INFO] ..cluster.ConcurrentOakClusterTest.twoCluster50Threads:49 - Test Oak-Cluster with two repository-nodes and 50 concurrent writers (each with 50 write attempts)
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 50 -- child_two_0_=0, child_one_1_=0, child_two_2_=1, child_one_3_=0, child_two_4_=0, child_one_5_=0, child_two_6_=0, child_one_7_=0, child_two_8_=0, child_one_9_=0, child_two_10_=0, child_one_11_=0, child_two_12_=0, child_one_13_=0, child_two_14_=0, child_one_15_=0, child_two_16_=0, child_one_17_=0, child_two_18_=0, child_one_19_=0, child_two_20_=0, child_one_21_=0, child_two_22_=0, child_one_23_=0, child_two_24_=0, child_one_25_=0, child_two_26_=0, child_one_27_=0, child_two_28_=0, child_one_29_=0, child_two_30_=0, child_one_31_=0, child_two_32_=0, child_one_33_=0, child_two_34_=0, child_one_35_=0, child_two_36_=0, child_one_37_=0, child_two_38_=0, child_one_39_=0, child_two_40_=0, child_one_41_=0, child_two_42_=0, child_one_43_=0, child_two_44_=0, child_one_45_=0, child_two_46_=0, child_one_47_=0, child_two_48_=0, child_one_49_=0
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358916688-1-1 (not yet visible), which was applied after the base revision
r1535891667d-0-1,r153589158a9-0-2, before
r153589166cd-0-2] (retries 5, 890 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358916688-1-1 (not yet visible), which was applied after the base revision
r1535891667d-0-1,r153589158a9-0-2, before
r153589166da-0-2] (retries 5, 920 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589166eb-1-1, which was applied after the base revision
r1535891667d-0-1,r153589158a9-0-2, before
r15358916713-0-2] (retries 5, 968 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589166f4-0-1 (not yet visible), which was applied after the base revision
r153589166eb-1-1,r153589158a9-0-2, before
r1535891672e-0-2] (retries 5, 1016 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589166f4-0-1 (not yet visible), which was applied after the base revision
r153589166eb-1-1,r153589158a9-0-2, before
r15358916757-0-2] (retries 5, 1036 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589166f4-0-1 (not yet visible), which was applied after the base revision
r153589166eb-1-1,r153589158a9-0-2, before
r15358916760-0-2] (retries 5, 1039 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589166f4-0-1 (not yet visible), which was applied after the base revision
r153589166eb-1-1,r153589158a9-0-2, before
r15358916767-0-2] (retries 5, 1050 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589166f4-0-1 (not yet visible), which was applied after the base revision
r153589166eb-1-1,r153589158a9-0-2, before
r1535891676e-0-2] (retries 5, 1071 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589166f4-0-1 (not yet visible), which was applied after the base revision
r153589166eb-1-1,r153589158a9-0-2, before
r15358916775-0-2] (retries 5, 1164 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891675b-1-1, which was applied after the base revision
r153589166eb-1-1,r153589158a9-0-2, before
r1535891677e-0-2] (retries 5, 1065 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891676c-0-1 (not yet visible), which was applied after the base revision
r1535891675b-1-1,r153589158a9-0-2, before
r15358916788-0-2] (retries 5, 1111 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891676c-0-1 (not yet visible), which was applied after the base revision
r1535891675b-1-1,r153589158a9-0-2, before
r1535891678d-0-2] (retries 5, 1105 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891676c-0-1 (not yet visible), which was applied after the base revision
r1535891675b-1-1,r153589158a9-0-2, before
r15358916797-1-2] (retries 5, 1178 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891676c-0-1 (not yet visible), which was applied after the base revision
r1535891675b-1-1,r153589158a9-0-2, before
r1535891679f-0-2] (retries 5, 1123 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891676c-0-1 (not yet visible), which was applied after the base revision
r1535891675b-1-1,r153589158a9-0-2, before
r153589167a8-0-2] (retries 5, 1145 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891676c-0-1 (not yet visible), which was applied after the base revision
r1535891675b-1-1,r153589158a9-0-2, before
r153589167b7-0-2] (retries 5, 1123 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891676c-0-1 (not yet visible), which was applied after the base revision
r1535891675b-1-1,r153589158a9-0-2, before
r153589167c0-0-2] (retries 5, 1133 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589167d2-0-1, which was applied after the base revision
r1535891675b-1-1,r153589158a9-0-2, before
r153589167eb-0-2] (retries 5, 1196 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589167db-0-1 (not yet visible), which was applied after the base revision
r153589167d2-0-1,r153589158a9-0-2, before
r153589167f5-0-2] (retries 5, 1208 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589167db-0-1 (not yet visible), which was applied after the base revision
r153589167d2-0-1,r153589158a9-0-2, before
r153589167fb-0-2] (retries 5, 1212 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589167db-0-1 (not yet visible), which was applied after the base revision
r153589167d2-0-1,r153589158a9-0-2, before
r15358916804-0-2] (retries 5, 1206 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589167db-0-1 (not yet visible), which was applied after the base revision
r153589167d2-0-1,r153589158a9-0-2, before
r1535891680b-1-2] (retries 5, 1227 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589167db-0-1 (not yet visible), which was applied after the base revision
r153589167d2-0-1,r153589158a9-0-2, before
r15358916810-0-2] (retries 5, 1254 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589167db-0-1 (not yet visible), which was applied after the base revision
r153589167d2-0-1,r153589158a9-0-2, before
r1535891681f-0-2] (retries 5, 1244 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358916829-0-1, which was applied after the base revision
r153589167d2-0-1,r153589158a9-0-2, before
r153589168ca-0-2] (retries 5, 1406 ms)
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 47 -- child_two_0_=2, child_one_1_=2, child_two_2_=4, child_one_3_=2, child_two_4_=5, child_one_5_=4, child_two_6_=2, child_one_7_=3, child_two_8_=2, child_one_9_=2, child_two_10_=2, child_one_11_=2, child_two_12_=3, child_one_13_=3, child_two_14_=4, child_one_15_=2, child_two_16_=10, child_one_17_=2, child_two_18_=3, child_one_19_=2, child_two_20_=4, child_one_21_=2, child_two_22_=3, child_one_23_=2, child_two_24_=3, child_one_25_=2, child_two_26_=4, child_one_27_=2, child_two_28_=4, child_one_29_=2, child_two_30_=3, child_one_31_=2, child_one_33_=2, child_two_34_=4, child_one_35_=3, child_two_36_=3, child_one_37_=2, child_one_39_=2, child_two_40_=11, child_one_41_=2, child_one_43_=2, child_two_44_=3, child_one_45_=2, child_two_46_=2, child_one_47_=3, child_two_48_=4, child_one_49_=2
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589174ab-1-1 (not yet visible), which was applied after the base revision
r15358917486-0-1,r15358916ffc-0-2, before
r15358917539-0-2] (retries 5, 1213 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891751c-1-1 (not yet visible), which was applied after the base revision
r153589174fc-6-1,r15358916ffc-0-2, before
r1535891757d-0-2] (retries 5, 1286 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891751c-1-1 (not yet visible), which was applied after the base revision
r153589174fc-6-1,r15358916ffc-0-2, before
r15358917582-0-2] (retries 5, 1192 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891751c-1-1 (not yet visible), which was applied after the base revision
r153589174fc-6-1,r15358916ffc-0-2, before
r153589175a0-1-2] (retries 5, 1051 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891751c-1-1 (not yet visible), which was applied after the base revision
r153589174fc-6-1,r15358916ffc-0-2, before
r153589175ba-0-2] (retries 5, 1255 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891751c-1-1 (not yet visible), which was applied after the base revision
r153589174fc-6-1,r15358916ffc-0-2, before
r153589175ca-0-2] (retries 5, 1267 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358917583-0-1 (not yet visible), which was applied after the base revision
r1535891756c-0-1,r15358916ffc-0-2, before
r15358917603-0-2] (retries 5, 1390 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589175f1-0-1 (not yet visible), which was applied after the base revision
r153589175e1-0-1,r15358916ffc-0-2, before
r15358917665-0-2] (retries 5, 1236 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589175f1-0-1 (not yet visible), which was applied after the base revision
r153589175e1-0-1,r15358916ffc-0-2, before
r1535891767f-0-2] (retries 5, 1445 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589175f1-0-1 (not yet visible), which was applied after the base revision
r153589175e1-0-1,r15358916ffc-0-2, before
r1535891768b-0-2] (retries 5, 1463 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589175f1-0-1 (not yet visible), which was applied after the base revision
r153589175e1-0-1,r15358916ffc-0-2, before
r15358917695-0-2] (retries 5, 1292 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589175f1-0-1 (not yet visible), which was applied after the base revision
r153589175e1-0-1,r15358916ffc-0-2, before
r1535891769f-0-2] (retries 5, 1588 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358917662-0-1 (not yet visible), which was applied after the base revision
r15358917653-0-1,r15358916ffc-0-2, before
r153589176fd-0-2] (retries 5, 1611 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358917662-0-1 (not yet visible), which was applied after the base revision
r15358917653-0-1,r15358916ffc-0-2, before
r15358917705-0-2] (retries 5, 1410 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358917662-0-1 (not yet visible), which was applied after the base revision
r15358917653-0-1,r15358916ffc-0-2, before
r15358917713-0-2] (retries 5, 1665 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358917662-0-1 (not yet visible), which was applied after the base revision
r15358917653-0-1,r15358916ffc-0-2, before
r15358917720-0-2] (retries 5, 1410 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589176d4-0-1 (not yet visible), which was applied after the base revision
r153589176c8-0-1,r15358916ffc-0-2, before
r15358917743-0-2] (retries 5, 1468 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589176d4-0-1 (not yet visible), which was applied after the base revision
r153589176c8-0-1,r15358916ffc-0-2, before
r15358917751-1-2] (retries 5, 1446 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358917730-0-1, which was applied after the base revision
r153589176c8-0-1,r15358916ffc-0-2, before
r153589177a0-0-2] (retries 5, 1728 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358917745-0-1 (not yet visible), which was applied after the base revision
r15358917730-0-1,r15358916ffc-0-2, before
r153589177cc-1-2] (retries 5, 1776 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358917745-0-1 (not yet visible), which was applied after the base revision
r15358917730-0-1,r15358916ffc-0-2, before
r153589177e0-0-2] (retries 5, 1805 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589177b0-0-1 (not yet visible), which was applied after the base revision
r153589177a5-0-1,r15358916ffc-0-2, before
r1535891783b-1-2] (retries 5, 1714 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891782e-0-1 (not yet visible), which was applied after the base revision
r15358917817-0-1,r15358916ffc-0-2, before
r153589178cd-0-2] (retries 5, 1681 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358917997-0-1 (not yet visible), which was applied after the base revision
r1535891796c-0-1,r15358916ffc-0-2, before
r15358917a31-0-2] (retries 5, 1440 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358917bcd-0-1 (not yet visible), which was applied after the base revision
r15358917bae-0-1,r15358916ffc-0-2, before
r15358917c5f-0-2] (retries 5, 1662 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358918167-0-2 (not yet visible), which was applied after the base revision
r15358917bec-0-1,r153589180f2-0-2, before
r153589181eb-0-1] (retries 5, 1066 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589182c0-0-2, which was applied after the base revision
r15358917bec-0-1,r15358918228-2-2, before
r15358918310-0-1] (retries 5, 1339 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589182e9-0-2 (not yet visible), which was applied after the base revision
r15358917bec-0-1,r153589182c0-0-2, before
r15358918324-0-1] (retries 5, 1360 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589182e9-0-2 (not yet visible), which was applied after the base revision
r15358917bec-0-1,r153589182c0-0-2, before
r15358918362-0-1] (retries 5, 1194 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358918368-1-2 (not yet visible), which was applied after the base revision
r15358917bec-0-1,r15358918354-0-2, before
r1535891838b-0-1] (retries 5, 1224 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358918368-1-2 (not yet visible), which was applied after the base revision
r15358917bec-0-1,r15358918354-0-2, before
r15358918391-0-1] (retries 5, 1238 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589183ce-0-2 (not yet visible), which was applied after the base revision
r15358917bec-0-1,r153589183a7-0-2, before
r153589183fb-0-1] (retries 5, 1351 ms)
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 45 -- child_two_0_=3, child_one_1_=5, child_two_2_=6, child_one_3_=5, child_two_4_=8, child_one_5_=7, child_two_6_=4, child_one_7_=6, child_one_9_=5, child_two_10_=4, child_one_11_=5, child_one_13_=7, child_two_14_=6, child_one_15_=4, child_two_16_=12, child_one_17_=5, child_two_18_=4, child_one_19_=5, child_two_20_=4, child_one_21_=6, child_two_22_=6, child_one_23_=5, child_two_24_=3, child_one_25_=5, child_two_26_=4, child_one_27_=5, child_two_28_=9, child_one_29_=6, child_two_30_=4, child_one_31_=6, child_one_33_=5, child_two_34_=29, child_one_35_=6, child_two_36_=3, child_one_37_=8, child_one_39_=6, child_two_40_=26, child_one_41_=5, child_one_43_=6, child_two_44_=14, child_one_45_=6, child_two_46_=15, child_one_47_=5, child_two_48_=12, child_one_49_=4
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358918472-0-2 (not yet visible), which was applied after the base revision
r15358917bec-0-1,r153589183fd-0-2, before
r1535891852e-0-1] (retries 5, 1538 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358918b2d-1-1 (not yet visible), which was applied after the base revision
r15358918af9-2-1,r1535891848a-0-2, before
r15358918b9f-0-2] (retries 5, 1071 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358918ba9-0-1 (not yet visible), which was applied after the base revision
r15358918b88-2-1,r1535891848a-0-2, before
r15358918c74-0-2] (retries 5, 1553 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358918cc3-0-1, which was applied after the base revision
r15358918bb5-0-1,r1535891848a-0-2, before
r15358918d0c-0-2] (retries 5, 1423 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358918ccc-0-1 (not yet visible), which was applied after the base revision
r15358918cc3-0-1,r1535891848a-0-2, before
r15358918d2e-0-2] (retries 5, 1468 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358918d37-0-1, which was applied after the base revision
r15358918cc3-0-1,r1535891848a-0-2, before
r15358918d77-0-2] (retries 5, 1541 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358918d3d-0-1 (not yet visible), which was applied after the base revision
r15358918d37-0-1,r1535891848a-0-2, before
r15358918da7-0-2] (retries 5, 1576 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358918d3d-0-1 (not yet visible), which was applied after the base revision
r15358918d37-0-1,r1535891848a-0-2, before
r15358918dc9-0-2] (retries 5, 1158 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358918d3d-0-1 (not yet visible), which was applied after the base revision
r15358918d37-0-1,r1535891848a-0-2, before
r15358918dd5-0-2] (retries 5, 1178 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358918d86-0-1, which was applied after the base revision
r15358918d37-0-1,r1535891848a-0-2, before
r15358918dea-0-2] (retries 5, 1335 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891953d-0-2 (not yet visible), which was applied after the base revision
r15358918d86-0-1,r1535891952b-0-2, before
r153589195e0-0-1] (retries 5, 961 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589195dc-2-2 (not yet visible), which was applied after the base revision
r15358918d86-0-1,r1535891957c-0-2, before
r1535891966f-0-1] (retries 5, 1337 ms)
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 44 -- child_two_0_=5, child_one_1_=9, child_two_2_=7, child_one_3_=8, child_two_4_=9, child_one_5_=10, child_two_6_=7, child_one_7_=8, child_one_9_=12, child_two_10_=7, child_one_11_=7, child_one_13_=9, child_two_14_=9, child_one_15_=6, child_one_17_=13, child_two_18_=11, child_one_19_=9, child_two_20_=7, child_one_21_=8, child_two_22_=9, child_one_23_=9, child_two_24_=6, child_one_25_=7, child_two_26_=6, child_one_27_=8, child_two_28_=11, child_one_29_=8, child_two_30_=7, child_one_31_=8, child_one_33_=7, child_two_34_=32, child_one_35_=7, child_two_36_=5, child_one_37_=10, child_one_39_=8, child_two_40_=28, child_one_41_=14, child_one_43_=8, child_two_44_=18, child_one_45_=8, child_two_46_=16, child_one_47_=6, child_two_48_=13, child_one_49_=6
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891a0b2-0-2 (not yet visible), which was applied after the base revision
r15358919a05-a-1,r1535891a0ae-0-2, before
r1535891a141-0-1] (retries 5, 1047 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891a0b2-0-2 (not yet visible), which was applied after the base revision
r15358919a05-a-1,r1535891a0ae-0-2, before
r1535891a150-0-1] (retries 5, 1041 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891a0b2-0-2 (not yet visible), which was applied after the base revision
r15358919a05-a-1,r1535891a0ae-0-2, before
r1535891a16a-0-1] (retries 5, 1084 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891a0b2-0-2 (not yet visible), which was applied after the base revision
r15358919a05-a-1,r1535891a0ae-0-2, before
r1535891a176-0-1] (retries 5, 1088 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891a119-0-2, which was applied after the base revision
r15358919a05-a-1,r1535891a0ae-0-2, before
r1535891a186-0-1] (retries 5, 1108 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891a11e-0-2 (not yet visible), which was applied after the base revision
r15358919a05-a-1,r1535891a119-0-2, before
r1535891a1db-1-1] (retries 5, 1169 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891a11e-0-2 (not yet visible), which was applied after the base revision
r15358919a05-a-1,r1535891a119-0-2, before
r1535891a1e7-0-1] (retries 5, 1208 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891a190-0-2 (not yet visible), which was applied after the base revision
r15358919a05-a-1,r1535891a189-0-2, before
r1535891a235-0-1] (retries 5, 1290 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891a1f9-0-2 (not yet visible), which was applied after the base revision
r15358919a05-a-1,r1535891a1f2-0-2, before
r1535891a2b5-0-1] (retries 5, 1412 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891a254-0-2, which was applied after the base revision
r15358919a05-a-1,r1535891a1f2-0-2, before
r1535891a2de-0-1] (retries 5, 1156 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891a26a-0-2 (not yet visible), which was applied after the base revision
r15358919a05-a-1,r1535891a254-0-2, before
r1535891a32c-0-1] (retries 5, 1510 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891a2e9-0-2 (not yet visible), which was applied after the base revision
r15358919a05-a-1,r1535891a2c5-0-2, before
r1535891a37e-0-1] (retries 5, 1597 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891a2e9-0-2 (not yet visible), which was applied after the base revision
r15358919a05-a-1,r1535891a2c5-0-2, before
r1535891a38e-0-1] (retries 5, 1619 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891a34d-0-2 (not yet visible), which was applied after the base revision
r15358919a05-a-1,r1535891a33b-0-2, before
r1535891a3de-0-1] (retries 5, 1687 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891a3f2-1-2 (not yet visible), which was applied after the base revision
r15358919a05-a-1,r1535891a3aa-0-2, before
r1535891a451-0-1] (retries 5, 1811 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891a3f2-1-2 (not yet visible), which was applied after the base revision
r15358919a05-a-1,r1535891a3aa-0-2, before
r1535891a45f-0-1] (retries 5, 1814 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891a3f2-1-2 (not yet visible), which was applied after the base revision
r15358919a05-a-1,r1535891a3aa-0-2, before
r1535891a468-0-1] (retries 5, 1831 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891a42d-0-2 (not yet visible), which was applied after the base revision
r15358919a05-a-1,r1535891a421-0-2, before
r1535891a4d8-0-1] (retries 5, 1260 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891a47b-0-2, which was applied after the base revision
r15358919a05-a-1,r1535891a421-0-2, before
r1535891a549-0-1] (retries 5, 1781 ms)
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 40 -- child_two_0_=8, child_one_1_=10, child_two_2_=10, child_one_3_=9, child_two_4_=12, child_one_5_=11, child_two_6_=9, child_one_7_=9, child_one_9_=13, child_two_10_=10, child_one_11_=8, child_one_13_=10, child_two_14_=10, child_one_15_=7, child_one_17_=13, child_two_18_=20, child_one_19_=10, child_two_20_=9, child_one_21_=9, child_two_22_=11, child_one_23_=10, child_two_24_=8, child_one_25_=8, child_two_26_=8, child_two_28_=15, child_two_30_=10, child_one_31_=9, child_two_34_=35, child_one_35_=8, child_two_36_=8, child_one_39_=9, child_two_40_=30, child_one_41_=31, child_one_43_=9, child_two_44_=20, child_one_45_=9, child_two_46_=19, child_one_47_=7, child_two_48_=16, child_one_49_=7
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891ac8d-0-1 (not yet visible), which was applied after the base revision
r1535891ac67-0-1,r1535891a6c0-0-2, before
r1535891acb4-0-2] (retries 5, 1004 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891ac8d-0-1 (not yet visible), which was applied after the base revision
r1535891ac67-0-1,r1535891a6c0-0-2, before
r1535891acb7-0-2] (retries 5, 994 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891ac8d-0-1 (not yet visible), which was applied after the base revision
r1535891ac67-0-1,r1535891a6c0-0-2, before
r1535891acda-0-2] (retries 5, 1005 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891acee-0-1 (not yet visible), which was applied after the base revision
r1535891acc7-1-1,r1535891a6c0-0-2, before
r1535891ad18-0-2] (retries 5, 1086 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891adb3-1-1 (not yet visible), which was applied after the base revision
r1535891ad27-0-1,r1535891a6c0-0-2, before
r1535891ae55-0-2] (retries 5, 1422 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891adb3-1-1 (not yet visible), which was applied after the base revision
r1535891ad27-0-1,r1535891a6c0-0-2, before
r1535891ae5c-0-2] (retries 5, 1425 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891adb3-1-1 (not yet visible), which was applied after the base revision
r1535891ad27-0-1,r1535891a6c0-0-2, before
r1535891ae78-0-2] (retries 5, 1289 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891aef7-0-1 (not yet visible), which was applied after the base revision
r1535891aeba-0-1,r1535891a6c0-0-2, before
r1535891af6d-0-2] (retries 5, 1029 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891b1bf-0-1 (not yet visible), which was applied after the base revision
r1535891b1bb-0-1,r1535891a6c0-0-2, before
r1535891b26b-0-2] (retries 5, 1672 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891b1bf-0-1 (not yet visible), which was applied after the base revision
r1535891b1bb-0-1,r1535891a6c0-0-2, before
r1535891b280-0-2] (retries 5, 1813 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891b256-1-1 (not yet visible), which was applied after the base revision
r1535891b1ef-0-1,r1535891a6c0-0-2, before
r1535891b2f7-0-2] (retries 5, 1694 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891b30d-0-1 (not yet visible), which was applied after the base revision
r1535891b305-0-1,r1535891a6c0-0-2, before
r1535891b3c6-0-2] (retries 5, 1873 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891b30d-0-1 (not yet visible), which was applied after the base revision
r1535891b305-0-1,r1535891a6c0-0-2, before
r1535891b3cd-0-2] (retries 5, 2016 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891b341-0-1, which was applied after the base revision
r1535891b305-0-1,r1535891a6c0-0-2, before
r1535891b3f7-0-2] (retries 5, 1977 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891b3d7-0-1 (not yet visible), which was applied after the base revision
r1535891b341-0-1,r1535891a6c0-0-2, before
r1535891b453-0-2] (retries 5, 2150 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891b444-0-1, which was applied after the base revision
r1535891b341-0-1,r1535891a6c0-0-2, before
r1535891b460-0-2] (retries 5, 2165 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891b475-0-1 (not yet visible), which was applied after the base revision
r1535891b444-0-1,r1535891a6c0-0-2, before
r1535891b49c-0-2] (retries 5, 2086 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891b475-0-1 (not yet visible), which was applied after the base revision
r1535891b444-0-1,r1535891a6c0-0-2, before
r1535891b4ab-0-2] (retries 5, 2122 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891b4f5-0-1 (not yet visible), which was applied after the base revision
r1535891b4ac-0-1,r1535891a6c0-0-2, before
r1535891b570-0-2] (retries 5, 2324 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891b616-0-1 (not yet visible), which was applied after the base revision
r1535891b60c-0-1,r1535891a6c0-0-2, before
r1535891b6a1-0-2] (retries 5, 2424 ms)
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891b616-0-1 (not yet visible), which was applied after the base revision
r1535891b60c-0-1,r1535891a6c0-0-2, before
r1535891b6b9-0-2] (retries 5, 2676 ms)
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 35 -- child_two_0_=11, child_one_1_=11, child_two_2_=10, child_one_3_=10, child_one_5_=12, child_two_6_=26, child_one_7_=10, child_one_9_=14, child_two_10_=10, child_one_11_=9, child_one_13_=11, child_one_15_=8, child_one_17_=15, child_two_18_=21, child_one_19_=11, child_two_20_=9, child_one_21_=10, child_one_23_=11, child_two_24_=8, child_one_25_=9, child_two_26_=22, child_two_28_=15, child_one_31_=10, child_one_35_=10, child_two_36_=8, child_one_39_=10, child_two_40_=32, child_one_41_=33, child_one_43_=10, child_two_44_=21, child_one_45_=11, child_two_46_=32, child_one_47_=8, child_two_48_=16, child_one_49_=8
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 34 -- child_two_0_=13, child_one_1_=12, child_two_2_=11, child_one_3_=10, child_one_5_=13, child_two_6_=27, child_one_7_=10, child_one_9_=14, child_two_10_=11, child_one_11_=9, child_one_13_=11, child_one_15_=9, child_one_17_=15, child_two_18_=22, child_one_19_=12, child_two_20_=9, child_one_21_=11, child_one_23_=11, child_two_24_=9, child_one_25_=9, child_two_26_=22, child_two_28_=16, child_one_31_=11, child_one_35_=10, child_two_36_=9, child_two_40_=33, child_one_41_=33, child_one_43_=10, child_two_44_=22, child_one_45_=12, child_two_46_=34, child_one_47_=8, child_two_48_=16, child_one_49_=8
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535891dd7a-0-1, which was applied after the base revision
r1535891dbcc-0-1,r1535891c675-0-2, before
r1535891de90-0-2] (retries 5, 5791 ms)
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 31 -- child_two_0_=13, child_one_1_=13, child_two_2_=12, child_one_3_=11, child_one_5_=13, child_two_6_=28, child_one_7_=10, child_one_9_=14, child_two_10_=11, child_one_11_=10, child_one_13_=11, child_one_15_=9, child_one_17_=15, child_two_18_=22, child_one_19_=12, child_two_20_=11, child_one_21_=11, child_one_23_=11, child_two_24_=9, child_one_25_=9, child_two_28_=16, child_one_31_=11, child_one_35_=10, child_two_40_=33, child_one_41_=33, child_one_43_=10, child_one_45_=12, child_two_46_=34, child_one_47_=9, child_two_48_=17, child_one_49_=8
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 31 -- child_two_0_=13, child_one_1_=13, child_two_2_=12, child_one_3_=11, child_one_5_=13, child_two_6_=28, child_one_7_=10, child_one_9_=15, child_two_10_=11, child_one_11_=10, child_one_13_=12, child_one_15_=9, child_one_17_=16, child_two_18_=22, child_one_19_=13, child_two_20_=11, child_one_21_=12, child_one_23_=12, child_two_24_=9, child_one_25_=9, child_two_28_=16, child_one_31_=12, child_one_35_=11, child_two_40_=33, child_one_41_=33, child_one_43_=11, child_one_45_=12, child_two_46_=34, child_one_47_=9, child_two_48_=17, child_one_49_=9
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 31 -- child_two_0_=14, child_one_1_=13, child_two_2_=12, child_one_3_=11, child_one_5_=13, child_two_6_=28, child_one_7_=12, child_one_9_=15, child_two_10_=12, child_one_11_=10, child_one_13_=12, child_one_15_=9, child_one_17_=16, child_two_18_=22, child_one_19_=13, child_two_20_=11, child_one_21_=12, child_one_23_=12, child_two_24_=10, child_one_25_=10, child_two_28_=16, child_one_31_=12, child_one_35_=11, child_two_40_=34, child_one_41_=34, child_one_43_=11, child_one_45_=12, child_two_46_=34, child_one_47_=10, child_two_48_=18, child_one_49_=9
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 30 -- child_two_0_=14, child_one_1_=13, child_two_2_=13, child_one_3_=12, child_one_5_=14, child_two_6_=29, child_one_7_=12, child_one_9_=15, child_two_10_=12, child_one_11_=10, child_one_13_=12, child_one_15_=9, child_one_17_=16, child_two_18_=23, child_one_19_=13, child_two_20_=12, child_one_21_=12, child_one_23_=12, child_two_24_=10, child_one_25_=10, child_two_28_=17, child_one_31_=12, child_one_35_=11, child_two_40_=34, child_one_41_=34, child_one_43_=11, child_one_45_=13, child_one_47_=10, child_two_48_=18, child_one_49_=9
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 28 -- child_two_0_=14, child_one_1_=13, child_two_2_=14, child_one_3_=12, child_one_5_=14, child_two_6_=30, child_one_9_=15, child_two_10_=12, child_one_11_=10, child_one_13_=12, child_one_17_=16, child_two_18_=24, child_one_19_=13, child_two_20_=12, child_one_21_=12, child_one_23_=12, child_two_24_=10, child_one_25_=10, child_two_28_=17, child_one_31_=12, child_one_35_=11, child_two_40_=34, child_one_41_=34, child_one_43_=11, child_one_45_=13, child_one_47_=10, child_two_48_=18, child_one_49_=9
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r15358923a29-0-1, which was applied after the base revision
r15358923754-0-1,r153589227fc-0-2, before
r15358923b42-0-2] (retries 5, 3437 ms)
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 27 -- child_one_1_=13, child_two_2_=14, child_one_3_=12, child_one_5_=14, child_two_6_=30, child_one_9_=15, child_two_10_=13, child_one_11_=10, child_one_13_=12, child_one_17_=16, child_two_18_=24, child_one_19_=13, child_two_20_=13, child_one_21_=12, child_one_23_=13, child_two_24_=11, child_one_25_=10, child_two_28_=18, child_one_31_=12, child_one_35_=11, child_two_40_=35, child_one_41_=34, child_one_43_=11, child_one_45_=13, child_one_47_=10, child_two_48_=19, child_one_49_=9
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 27 -- child_one_1_=13, child_two_2_=14, child_one_3_=12, child_one_5_=14, child_two_6_=30, child_one_9_=16, child_two_10_=13, child_one_11_=11, child_one_13_=12, child_one_17_=17, child_two_18_=24, child_one_19_=14, child_two_20_=13, child_one_21_=13, child_one_23_=13, child_two_24_=11, child_one_25_=10, child_two_28_=18, child_one_31_=12, child_one_35_=11, child_two_40_=35, child_one_41_=34, child_one_43_=11, child_one_45_=13, child_one_47_=10, child_two_48_=19, child_one_49_=9
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 27 -- child_one_1_=13, child_two_2_=14, child_one_3_=12, child_one_5_=14, child_two_6_=30, child_one_9_=16, child_two_10_=13, child_one_11_=11, child_one_13_=12, child_one_17_=17, child_two_18_=24, child_one_19_=14, child_two_20_=13, child_one_21_=13, child_one_23_=13, child_two_24_=11, child_one_25_=11, child_two_28_=18, child_one_31_=13, child_one_35_=12, child_two_40_=35, child_one_41_=35, child_one_43_=12, child_one_45_=13, child_one_47_=11, child_two_48_=19, child_one_49_=9
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 26 -- child_one_1_=14, child_two_2_=14, child_one_3_=12, child_one_5_=14, child_two_6_=30, child_one_9_=16, child_two_10_=13, child_one_11_=11, child_one_13_=13, child_one_17_=17, child_two_18_=24, child_one_19_=14, child_two_20_=13, child_one_21_=13, child_one_23_=13, child_two_24_=11, child_one_25_=11, child_two_28_=18, child_one_31_=13, child_one_35_=12, child_two_40_=35, child_one_41_=35, child_one_43_=12, child_one_45_=13, child_one_47_=11, child_two_48_=19
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 26 -- child_one_1_=14, child_two_2_=15, child_one_3_=12, child_one_5_=14, child_two_6_=31, child_one_9_=16, child_two_10_=13, child_one_11_=11, child_one_13_=13, child_one_17_=17, child_two_18_=25, child_one_19_=14, child_two_20_=13, child_one_21_=13, child_one_23_=13, child_two_24_=12, child_one_25_=11, child_two_28_=19, child_one_31_=13, child_one_35_=12, child_two_40_=35, child_one_41_=35, child_one_43_=12, child_one_45_=13, child_one_47_=11, child_two_48_=19
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 25 -- child_one_1_=14, child_two_2_=15, child_one_3_=12, child_one_5_=14, child_two_6_=31, child_one_9_=16, child_one_11_=11, child_one_13_=13, child_one_17_=17, child_two_18_=25, child_one_19_=14, child_two_20_=14, child_one_21_=13, child_one_23_=13, child_two_24_=12, child_one_25_=11, child_two_28_=19, child_one_31_=13, child_one_35_=12, child_two_40_=36, child_one_41_=35, child_one_43_=12, child_one_45_=13, child_one_47_=11, child_two_48_=20
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 24 -- child_one_1_=14, child_two_2_=15, child_one_5_=15, child_two_6_=31, child_one_9_=17, child_one_11_=11, child_one_13_=13, child_one_17_=17, child_two_18_=25, child_one_19_=14, child_two_20_=14, child_one_21_=13, child_one_23_=14, child_two_24_=12, child_one_25_=11, child_two_28_=19, child_one_31_=13, child_one_35_=12, child_two_40_=36, child_one_41_=35, child_one_43_=12, child_one_45_=14, child_one_47_=11, child_two_48_=20
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 24 -- child_one_1_=14, child_two_2_=15, child_one_5_=15, child_two_6_=31, child_one_9_=17, child_one_11_=11, child_one_13_=13, child_one_17_=17, child_two_18_=26, child_one_19_=14, child_two_20_=14, child_one_21_=13, child_one_23_=14, child_two_24_=12, child_one_25_=11, child_two_28_=20, child_one_31_=13, child_one_35_=12, child_two_40_=36, child_one_41_=35, child_one_43_=12, child_one_45_=14, child_one_47_=11, child_two_48_=21
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r1535892de1b-0-1, which was applied after the base revision
r1535892d9d4-0-1,r1535892bd30-0-2, before
r1535892dfe1-0-2] (retries 5, 6598 ms)
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 23 -- child_one_1_=14, child_two_2_=16, child_one_5_=15, child_two_6_=32, child_one_9_=17, child_one_11_=11, child_one_13_=13, child_one_17_=17, child_two_18_=26, child_one_19_=14, child_two_20_=15, child_one_21_=13, child_one_23_=14, child_one_25_=11, child_two_28_=20, child_one_31_=14, child_one_35_=12, child_two_40_=37, child_one_41_=35, child_one_43_=12, child_one_45_=14, child_one_47_=11, child_two_48_=21
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 23 -- child_one_1_=15, child_two_2_=16, child_one_5_=15, child_two_6_=32, child_one_9_=17, child_one_11_=11, child_one_13_=13, child_one_17_=18, child_two_18_=26, child_one_19_=15, child_two_20_=15, child_one_21_=13, child_one_23_=14, child_one_25_=11, child_two_28_=20, child_one_31_=14, child_one_35_=12, child_two_40_=37, child_one_41_=35, child_one_43_=12, child_one_45_=15, child_one_47_=11, child_two_48_=21
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 22 -- child_one_1_=15, child_two_2_=16, child_one_5_=15, child_two_6_=32, child_one_9_=17, child_one_11_=11, child_one_13_=13, child_one_17_=18, child_two_18_=26, child_one_19_=15, child_two_20_=15, child_one_21_=13, child_one_23_=15, child_one_25_=12, child_two_28_=20, child_one_31_=14, child_one_35_=12, child_two_40_=37, child_one_41_=35, child_one_43_=12, child_one_45_=15, child_two_48_=21
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 22 -- child_one_1_=15, child_two_2_=16, child_one_5_=15, child_two_6_=32, child_one_9_=17, child_one_11_=11, child_one_13_=13, child_one_17_=18, child_two_18_=26, child_one_19_=15, child_two_20_=16, child_one_21_=13, child_one_23_=15, child_one_25_=12, child_two_28_=21, child_one_31_=14, child_one_35_=12, child_two_40_=38, child_one_41_=35, child_one_43_=12, child_one_45_=15, child_two_48_=21
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 22 -- child_one_1_=15, child_two_2_=17, child_one_5_=15, child_two_6_=32, child_one_9_=17, child_one_11_=11, child_one_13_=13, child_one_17_=18, child_two_18_=27, child_one_19_=15, child_two_20_=16, child_one_21_=13, child_one_23_=15, child_one_25_=12, child_two_28_=21, child_one_31_=14, child_one_35_=12, child_two_40_=38, child_one_41_=35, child_one_43_=12, child_one_45_=15, child_two_48_=21
[ERROR] ..cluster.ConcurrentOakClusterTest.run:138 - Exception during save operation OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589332fa-0-1, which was applied after the base revision
r15358932c22-0-1,r153589308a4-0-2, before
r153589335db-0-2] (retries 5, 10151 ms)
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 21 -- child_one_1_=15, child_two_2_=17, child_one_5_=15, child_one_9_=17, child_one_11_=11, child_one_13_=13, child_one_17_=18, child_two_18_=27, child_one_19_=15, child_two_20_=16, child_one_21_=13, child_one_23_=15, child_one_25_=12, child_two_28_=21, child_one_31_=14, child_one_35_=13, child_two_40_=38, child_one_41_=35, child_one_43_=12, child_one_45_=15, child_two_48_=22
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 21 -- child_one_1_=16, child_two_2_=17, child_one_5_=15, child_one_9_=17, child_one_11_=11, child_one_13_=13, child_one_17_=18, child_two_18_=27, child_one_19_=15, child_two_20_=16, child_one_21_=14, child_one_23_=15, child_one_25_=12, child_two_28_=21, child_one_31_=14, child_one_35_=13, child_two_40_=38, child_one_41_=35, child_one_43_=12, child_one_45_=15, child_two_48_=22
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 21 -- child_one_1_=16, child_two_2_=17, child_one_5_=15, child_one_9_=17, child_one_11_=12, child_one_13_=14, child_one_17_=18, child_two_18_=27, child_one_19_=15, child_two_20_=16, child_one_21_=14, child_one_23_=15, child_one_25_=12, child_two_28_=21, child_one_31_=15, child_one_35_=13, child_two_40_=38, child_one_41_=35, child_one_43_=12, child_one_45_=15, child_two_48_=22
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 21 -- child_one_1_=16, child_two_2_=17, child_one_5_=15, child_one_9_=18, child_one_11_=12, child_one_13_=14, child_one_17_=18, child_two_18_=27, child_one_19_=15, child_two_20_=16, child_one_21_=14, child_one_23_=15, child_one_25_=12, child_two_28_=21, child_one_31_=15, child_one_35_=13, child_two_40_=38, child_one_41_=35, child_one_43_=13, child_one_45_=15, child_two_48_=22
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 20 -- child_one_1_=16, child_two_2_=17, child_one_5_=15, child_one_9_=18, child_one_11_=12, child_one_13_=14, child_one_17_=18, child_two_18_=27, child_one_19_=15, child_two_20_=16, child_one_21_=14, child_one_23_=15, child_one_25_=12, child_two_28_=21, child_one_31_=15, child_one_35_=13, child_two_40_=38, child_one_43_=13, child_one_45_=15, child_two_48_=22
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 20 -- child_one_1_=16, child_two_2_=17, child_one_5_=15, child_one_9_=18, child_one_11_=12, child_one_13_=14, child_one_17_=18, child_two_18_=27, child_one_19_=15, child_two_20_=17, child_one_21_=14, child_one_23_=15, child_one_25_=12, child_two_28_=21, child_one_31_=15, child_one_35_=13, child_two_40_=39, child_one_43_=13, child_one_45_=15, child_two_48_=22
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 20 -- child_one_1_=16, child_two_2_=17, child_one_5_=15, child_one_9_=18, child_one_11_=12, child_one_13_=14, child_one_17_=18, child_two_18_=28, child_one_19_=15, child_two_20_=17, child_one_21_=14, child_one_23_=15, child_one_25_=12, child_two_28_=22, child_one_31_=15, child_one_35_=13, child_two_40_=39, child_one_43_=13, child_one_45_=15, child_two_48_=22
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 20 -- child_one_1_=16, child_two_2_=18, child_one_5_=15, child_one_9_=18, child_one_11_=12, child_one_13_=14, child_one_17_=18, child_two_18_=28, child_one_19_=15, child_two_20_=17, child_one_21_=14, child_one_23_=15, child_one_25_=12, child_two_28_=22, child_one_31_=15, child_one_35_=13, child_two_40_=39, child_one_43_=13, child_one_45_=15, child_two_48_=22
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 18 -- child_one_1_=16, child_two_2_=18, child_one_9_=18, child_one_11_=12, child_one_13_=14, child_one_17_=18, child_two_18_=28, child_one_19_=15, child_two_20_=17, child_one_21_=14, child_one_23_=15, child_one_25_=12, child_two_28_=22, child_one_31_=15, child_one_35_=13, child_two_40_=39, child_one_43_=13, child_one_45_=15
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 17 -- child_one_1_=16, child_two_2_=18, child_one_9_=18, child_one_11_=12, child_one_13_=14, child_one_17_=18, child_two_18_=28, child_one_19_=15, child_one_21_=14, child_one_23_=15, child_one_25_=12, child_two_28_=22, child_one_31_=15, child_one_35_=13, child_two_40_=39, child_one_43_=13, child_one_45_=15
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 17 -- child_one_1_=16, child_two_2_=18, child_one_9_=18, child_one_11_=12, child_one_13_=14, child_one_17_=18, child_two_18_=28, child_one_19_=15, child_one_21_=15, child_one_23_=15, child_one_25_=13, child_two_28_=22, child_one_31_=15, child_one_35_=13, child_two_40_=39, child_one_43_=13, child_one_45_=15
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 17 -- child_one_1_=16, child_two_2_=18, child_one_9_=18, child_one_11_=12, child_one_13_=14, child_one_17_=19, child_two_18_=28, child_one_19_=15, child_one_21_=15, child_one_23_=15, child_one_25_=13, child_two_28_=22, child_one_31_=15, child_one_35_=13, child_two_40_=39, child_one_43_=13, child_one_45_=15
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 17 -- child_one_1_=16, child_two_2_=18, child_one_9_=19, child_one_11_=12, child_one_13_=14, child_one_17_=19, child_two_18_=28, child_one_19_=15, child_one_21_=15, child_one_23_=15, child_one_25_=13, child_two_28_=22, child_one_31_=15, child_one_35_=13, child_two_40_=39, child_one_43_=13, child_one_45_=16
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 16 -- child_one_1_=17, child_two_2_=18, child_one_9_=19, child_one_11_=12, child_one_13_=14, child_one_17_=19, child_two_18_=28, child_one_19_=15, child_one_21_=15, child_one_25_=13, child_two_28_=22, child_one_31_=15, child_one_35_=13, child_two_40_=39, child_one_43_=13, child_one_45_=16
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 16 -- child_one_1_=17, child_two_2_=19, child_one_9_=19, child_one_11_=12, child_one_13_=14, child_one_17_=19, child_two_18_=28, child_one_19_=15, child_one_21_=15, child_one_25_=13, child_two_28_=22, child_one_31_=15, child_one_35_=13, child_two_40_=39, child_one_43_=13, child_one_45_=16
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 16 -- child_one_1_=17, child_two_2_=19, child_one_9_=19, child_one_11_=12, child_one_13_=14, child_one_17_=19, child_two_18_=28, child_one_19_=15, child_one_21_=15, child_one_25_=13, child_two_28_=23, child_one_31_=15, child_one_35_=13, child_two_40_=40, child_one_43_=13, child_one_45_=16
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 15 -- child_one_1_=17, child_two_2_=19, child_one_9_=19, child_one_11_=12, child_one_13_=14, child_one_17_=19, child_one_19_=15, child_one_21_=15, child_one_25_=13, child_two_28_=23, child_one_31_=15, child_one_35_=13, child_two_40_=40, child_one_43_=13, child_one_45_=16
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 15 -- child_one_1_=17, child_two_2_=19, child_one_9_=19, child_one_11_=12, child_one_13_=14, child_one_17_=19, child_one_19_=16, child_one_21_=15, child_one_25_=13, child_two_28_=23, child_one_31_=15, child_one_35_=13, child_two_40_=40, child_one_43_=13, child_one_45_=16
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 15 -- child_one_1_=17, child_two_2_=19, child_one_9_=19, child_one_11_=12, child_one_13_=14, child_one_17_=20, child_one_19_=16, child_one_21_=15, child_one_25_=13, child_two_28_=23, child_one_31_=15, child_one_35_=14, child_two_40_=40, child_one_43_=13, child_one_45_=16
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 15 -- child_one_1_=17, child_two_2_=19, child_one_9_=19, child_one_11_=13, child_one_13_=14, child_one_17_=20, child_one_19_=16, child_one_21_=15, child_one_25_=13, child_two_28_=23, child_one_31_=15, child_one_35_=14, child_two_40_=40, child_one_43_=13, child_one_45_=16
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 15 -- child_one_1_=17, child_two_2_=19, child_one_9_=19, child_one_11_=13, child_one_13_=15, child_one_17_=20, child_one_19_=16, child_one_21_=15, child_one_25_=14, child_two_28_=23, child_one_31_=15, child_one_35_=14, child_two_40_=40, child_one_43_=13, child_one_45_=16
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 15 -- child_one_1_=17, child_two_2_=19, child_one_9_=19, child_one_11_=13, child_one_13_=15, child_one_17_=20, child_one_19_=16, child_one_21_=15, child_one_25_=14, child_two_28_=23, child_one_31_=15, child_one_35_=14, child_two_40_=40, child_one_43_=13, child_one_45_=17
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 15 -- child_one_1_=17, child_two_2_=19, child_one_9_=19, child_one_11_=13, child_one_13_=15, child_one_17_=20, child_one_19_=16, child_one_21_=15, child_one_25_=14, child_two_28_=23, child_one_31_=15, child_one_35_=15, child_two_40_=40, child_one_43_=14, child_one_45_=17
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 14 -- child_one_1_=17, child_two_2_=19, child_one_9_=19, child_one_11_=13, child_one_13_=15, child_one_17_=20, child_one_19_=16, child_one_21_=15, child_one_25_=14, child_two_28_=23, child_one_35_=15, child_two_40_=40, child_one_43_=14, child_one_45_=17
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 14 -- child_one_1_=17, child_two_2_=19, child_one_9_=19, child_one_11_=13, child_one_13_=15, child_one_17_=20, child_one_19_=16, child_one_21_=15, child_one_25_=14, child_two_28_=23, child_one_35_=15, child_two_40_=41, child_one_43_=14, child_one_45_=17
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 13 -- child_one_1_=17, child_two_2_=20, child_one_9_=19, child_one_11_=13, child_one_13_=15, child_one_17_=20, child_one_19_=16, child_one_21_=15, child_one_25_=14, child_one_35_=15, child_two_40_=41, child_one_43_=14, child_one_45_=17
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 13 -- child_one_1_=17, child_two_2_=20, child_one_9_=19, child_one_11_=13, child_one_13_=15, child_one_17_=20, child_one_19_=16, child_one_21_=15, child_one_25_=14, child_one_35_=15, child_two_40_=41, child_one_43_=14, child_one_45_=17
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 13 -- child_one_1_=17, child_two_2_=20, child_one_9_=19, child_one_11_=13, child_one_13_=15, child_one_17_=20, child_one_19_=16, child_one_21_=16, child_one_25_=14, child_one_35_=15, child_two_40_=41, child_one_43_=14, child_one_45_=17
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 13 -- child_one_1_=18, child_two_2_=20, child_one_9_=19, child_one_11_=13, child_one_13_=15, child_one_17_=20, child_one_19_=16, child_one_21_=16, child_one_25_=14, child_one_35_=15, child_two_40_=41, child_one_43_=15, child_one_45_=17
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 13 -- child_one_1_=18, child_two_2_=20, child_one_9_=19, child_one_11_=13, child_one_13_=16, child_one_17_=20, child_one_19_=16, child_one_21_=16, child_one_25_=14, child_one_35_=15, child_two_40_=41, child_one_43_=15, child_one_45_=17
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 12 -- child_one_1_=18, child_two_2_=20, child_one_11_=13, child_one_13_=16, child_one_17_=20, child_one_19_=16, child_one_21_=16, child_one_25_=14, child_one_35_=15, child_two_40_=41, child_one_43_=15, child_one_45_=17
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 12 -- child_one_1_=18, child_two_2_=20, child_one_11_=13, child_one_13_=16, child_one_17_=20, child_one_19_=16, child_one_21_=16, child_one_25_=14, child_one_35_=15, child_two_40_=42, child_one_43_=15, child_one_45_=17
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 11 -- child_one_1_=18, child_one_11_=13, child_one_13_=16, child_one_17_=20, child_one_19_=16, child_one_21_=16, child_one_25_=14, child_one_35_=15, child_two_40_=42, child_one_43_=15, child_one_45_=17
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 11 -- child_one_1_=18, child_one_11_=13, child_one_13_=16, child_one_17_=20, child_one_19_=16, child_one_21_=16, child_one_25_=14, child_one_35_=15, child_two_40_=42, child_one_43_=15, child_one_45_=17
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 11 -- child_one_1_=18, child_one_11_=13, child_one_13_=16, child_one_17_=20, child_one_19_=17, child_one_21_=16, child_one_25_=14, child_one_35_=15, child_two_40_=42, child_one_43_=15, child_one_45_=18
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 11 -- child_one_1_=18, child_one_11_=14, child_one_13_=16, child_one_17_=20, child_one_19_=17, child_one_21_=16, child_one_25_=14, child_one_35_=15, child_two_40_=42, child_one_43_=15, child_one_45_=18
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 11 -- child_one_1_=18, child_one_11_=14, child_one_13_=16, child_one_17_=20, child_one_19_=17, child_one_21_=17, child_one_25_=14, child_one_35_=15, child_two_40_=42, child_one_43_=15, child_one_45_=18
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 11 -- child_one_1_=18, child_one_11_=14, child_one_13_=16, child_one_17_=21, child_one_19_=17, child_one_21_=17, child_one_25_=14, child_one_35_=15, child_two_40_=42, child_one_43_=15, child_one_45_=18
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 11 -- child_one_1_=18, child_one_11_=14, child_one_13_=16, child_one_17_=21, child_one_19_=17, child_one_21_=17, child_one_25_=14, child_one_35_=16, child_two_40_=42, child_one_43_=15, child_one_45_=18
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 11 -- child_one_1_=19, child_one_11_=14, child_one_13_=16, child_one_17_=21, child_one_19_=17, child_one_21_=17, child_one_25_=14, child_one_35_=16, child_two_40_=42, child_one_43_=15, child_one_45_=18
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 10 -- child_one_1_=19, child_one_11_=14, child_one_13_=16, child_one_17_=21, child_one_19_=17, child_one_21_=17, child_one_35_=16, child_two_40_=42, child_one_43_=15, child_one_45_=18
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 9 -- child_one_1_=19, child_one_11_=14, child_one_13_=16, child_one_17_=21, child_one_19_=17, child_one_21_=17, child_one_35_=16, child_one_43_=15, child_one_45_=18
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 9 -- child_one_1_=20, child_one_11_=14, child_one_13_=16, child_one_17_=21, child_one_19_=17, child_one_21_=17, child_one_35_=16, child_one_43_=15, child_one_45_=18
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 9 -- child_one_1_=20, child_one_11_=14, child_one_13_=17, child_one_17_=21, child_one_19_=17, child_one_21_=17, child_one_35_=16, child_one_43_=15, child_one_45_=18
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 8 -- child_one_1_=20, child_one_11_=14, child_one_13_=17, child_one_17_=21, child_one_19_=17, child_one_21_=17, child_one_35_=16, child_one_45_=18
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 8 -- child_one_1_=20, child_one_11_=14, child_one_13_=17, child_one_17_=21, child_one_19_=17, child_one_21_=17, child_one_35_=16, child_one_45_=18
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 8 -- child_one_1_=20, child_one_11_=15, child_one_13_=17, child_one_17_=21, child_one_19_=17, child_one_21_=18, child_one_35_=16, child_one_45_=18
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 8 -- child_one_1_=20, child_one_11_=15, child_one_13_=17, child_one_17_=21, child_one_19_=17, child_one_21_=18, child_one_35_=16, child_one_45_=19
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 7 -- child_one_1_=20, child_one_11_=15, child_one_13_=17, child_one_17_=21, child_one_21_=18, child_one_35_=16, child_one_45_=19
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 7 -- child_one_1_=20, child_one_11_=15, child_one_13_=17, child_one_17_=21, child_one_21_=18, child_one_35_=16, child_one_45_=19
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 7 -- child_one_1_=21, child_one_11_=15, child_one_13_=17, child_one_17_=22, child_one_21_=18, child_one_35_=16, child_one_45_=19
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 7 -- child_one_1_=21, child_one_11_=15, child_one_13_=17, child_one_17_=22, child_one_21_=19, child_one_35_=16, child_one_45_=19
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 6 -- child_one_1_=21, child_one_11_=15, child_one_13_=17, child_one_17_=22, child_one_21_=19, child_one_45_=19
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 6 -- child_one_1_=21, child_one_11_=15, child_one_13_=17, child_one_17_=22, child_one_21_=19, child_one_45_=19
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 5 -- child_one_11_=15, child_one_13_=17, child_one_17_=22, child_one_21_=19, child_one_45_=19
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 5 -- child_one_11_=15, child_one_13_=17, child_one_17_=22, child_one_21_=19, child_one_45_=19
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 5 -- child_one_11_=15, child_one_13_=17, child_one_17_=22, child_one_21_=20, child_one_45_=19
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 5 -- child_one_11_=16, child_one_13_=17, child_one_17_=22, child_one_21_=20, child_one_45_=19
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 5 -- child_one_11_=16, child_one_13_=18, child_one_17_=22, child_one_21_=20, child_one_45_=19
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 4 -- child_one_11_=16, child_one_13_=18, child_one_17_=22, child_one_21_=20
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 4 -- child_one_11_=17, child_one_13_=18, child_one_17_=22, child_one_21_=20
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 3 -- child_one_11_=17, child_one_13_=18, child_one_21_=20
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 3 -- child_one_11_=17, child_one_13_=18, child_one_21_=20
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 2 -- child_one_11_=17, child_one_13_=18
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 2 -- child_one_11_=17, child_one_13_=18
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 1 -- child_one_11_=17
[INFO] ..cluster.ConcurrentOakClusterTest.run:77 - wait for writers: 1 -- child_one_11_=17
[INFO] ..cluster.ConcurrentOakClusterTest.run:92 - Number of created nodes: 2387
```

## Sample root-cause of catched exception

```Logfile
javax.jcr.InvalidItemStateException: OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589c508b-0-2 (not yet visible), which was applied after the base revision
r153589c49b7-0-1,r153589c5082-0-2, before
r153589c512d-0-1] (retries 5, 1288 ms)
	at org.apache.jackrabbit.oak.api.CommitFailedException.asRepositoryException(CommitFailedException.java:239)
	at org.apache.jackrabbit.oak.api.CommitFailedException.asRepositoryException(CommitFailedException.java:212)
	at org.apache.jackrabbit.oak.jcr.delegate.SessionDelegate.newRepositoryException(SessionDelegate.java:670)
	at org.apache.jackrabbit.oak.jcr.delegate.SessionDelegate.save(SessionDelegate.java:496)
	at org.apache.jackrabbit.oak.jcr.session.SessionImpl$8.performVoid(SessionImpl.java:419)
	at org.apache.jackrabbit.oak.jcr.delegate.SessionDelegate.performVoid(SessionDelegate.java:274)
	at org.apache.jackrabbit.oak.jcr.session.SessionImpl.save(SessionImpl.java:416)
	at org.apache.jackrabbit.cluster.ConcurrentOakClusterTest$ChildWriter.run(ConcurrentOakClusterTest.java:135)
Caused by: org.apache.jackrabbit.oak.api.CommitFailedException: OakMerge0004: OakMerge0004: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589c508b-0-2 (not yet visible), which was applied after the base revision
r153589c49b7-0-1,r153589c5082-0-2, before
r153589c512d-0-1] (retries 5, 1288 ms)
	at org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreBranch.merge0(DocumentNodeStoreBranch.java:203)
	at org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreBranch.merge(DocumentNodeStoreBranch.java:126)
	at org.apache.jackrabbit.oak.plugins.document.DocumentRootBuilder.merge(DocumentRootBuilder.java:158)
	at org.apache.jackrabbit.oak.plugins.document.DocumentNodeStore.merge(DocumentNodeStore.java:1508)
	at org.apache.jackrabbit.oak.core.MutableRoot.commit(MutableRoot.java:247)
	at org.apache.jackrabbit.oak.jcr.delegate.SessionDelegate.commit(SessionDelegate.java:347)
	at org.apache.jackrabbit.oak.jcr.delegate.SessionDelegate.save(SessionDelegate.java:494)
	... 4 more
Caused by: org.apache.jackrabbit.oak.plugins.document.ConflictException: Following exceptions occurred during the bulk update operations: [org.apache.jackrabbit.oak.plugins.document.ConflictException: The node 1:/existing was changed in revision
r153589c508b-0-2 (not yet visible), which was applied after the base revision
r153589c49b7-0-1,r153589c5082-0-2, before
r153589c512d-0-1]
	at org.apache.jackrabbit.oak.plugins.document.Commit.checkConflicts(Commit.java:561)
	at org.apache.jackrabbit.oak.plugins.document.Commit.applyToDocumentStore(Commit.java:326)
	at org.apache.jackrabbit.oak.plugins.document.Commit.applyToDocumentStore(Commit.java:262)
	at org.apache.jackrabbit.oak.plugins.document.Commit.applyInternal(Commit.java:231)
	at org.apache.jackrabbit.oak.plugins.document.Commit.apply(Commit.java:220)
	at org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreBranch.persist(DocumentNodeStoreBranch.java:292)
	at org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreBranch.persist(DocumentNodeStoreBranch.java:262)
	at org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreBranch.access$300(DocumentNodeStoreBranch.java:57)
	at org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreBranch$InMemory.merge(DocumentNodeStoreBranch.java:499)
	at org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreBranch.merge0(DocumentNodeStoreBranch.java:182)
	... 10 more


```