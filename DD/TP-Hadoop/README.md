cd src
javac *.java
java AuthorsJob hdfs:///author-large.txt hdfs:///resultat12
hadoop fs -get hdfs:///resultat12 ./directory
cat directory/part-r-00000 | sort -n -k 2

3.2) David -> 11 
3.3) (2) -> 86024
