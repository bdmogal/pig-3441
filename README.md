pig-3441
========

This project demonstrates the issue mentioned in [PIG-3441](https://issues.apache.org/jira/browse/PIG-3441)


Build
-----
    mvn clean package

Run
---

* Sample Pig script to test - 
    src/main/bin/myfs.pig
** Replace the path to pig3441-1.0-SNAPSHOT.jar in this script before running

* Sample command to run
    bin/pig -Dfs.defaultFS=hdfs://localhost:9000 -Dfs.myfs.impl=pig.pig3441.MyFileSystem  ./src/main/bin/myfs.pig
