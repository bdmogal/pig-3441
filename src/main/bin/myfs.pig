REGISTER '<Path to pig-3441>/pig-3441/target/pig3441-1.0-SNAPSHOT.jar';

A = LOAD 'myfs:///path/to/data.txt' USING PigStorage(':') AS (name:chararray, age:int); -- loading data
-- DUMP A;
