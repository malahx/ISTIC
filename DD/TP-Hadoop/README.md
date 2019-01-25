cd src
javac *.java
java AuthorsJob hdfs:///author-large.txt hdfs:///resultat12
hadoop fs -get hdfs:///resultat12 ./directory
cat directory/part-r-00000 | sort -n -k 2

3.2) David -> 11 
3.3) (2) -> 86024

PigLatin
3.2) (David Gross-Amblard,11L)
publs = load '/home/malah/Code/ISTIC/Cours/DD/author-large.txt' as (author: chararray, title: chararray, year: int);
david = filter publs by author == 'David Gross-Amblard';
group_author = group david by author;
count = foreach group_author generate group, COUNT(david.author);
dump count;

3.3) (2,87848L)
publs = load '/home/malah/Code/ISTIC/Cours/DD/author-large.txt' as (author: chararray, title: chararray, year: int);
B = foreach publs generate TOKENIZE(title) as Words;
C = foreach B generate flatten(Words) as words;
D = group C by words;
E = foreach D generate group, COUNT(C);
F = order E by $1;
dump F;
