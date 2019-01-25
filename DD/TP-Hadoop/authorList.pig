publs = load '/home/malah/Code/ISTIC/Cours/DD/author-large.txt' as (author: chararray, title: chararray, year: int);
B = foreach publs generate TOKENIZE(title) as Words;
C = foreach B generate flatten(Words) as words;
D = group C by words;
E = foreach D generate group, COUNT(C);
F = order E by $1;
dump F;