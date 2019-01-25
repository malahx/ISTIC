1)
    text_file = spark_context.textFile(os.path.join(SPARK_HOME, 'README.md'))
    word_counts = text_file \
        .map(lambda t: t.split(' ')) \
        .flatMap(lambda t: t) \
        .map(lambda s: (s, 1)) \
        .reduceByKey(lambda a, b: a + b) \
        .map(lambda s: (s[1], s[0]))
    for val in word_counts.sortByKey().collect():
        print(val)
        
2)
    text_file = spark_context.textFile(os.path.join(SPARK_HOME, 'README.md'))
    word_counts = text_file \
        .map(lambda t: t.split(' ')) \
        .flatMap(lambda t: t) \
        .map(lambda s: (s, 1)) \
        .reduceByKey(lambda a, b: a + b) \
        .map(lambda s: (s[1], s[0])) \
        .sortByKey(ascending=False) \
        .filter(lambda s: s[1] != '')
    collect = word_counts.collect()
    for i in range(0, 50):
        print("{0}: {1} ({2})".format(i, collect[i][1], collect[i][0]))
        
        0: the (24)
        1: to (17)
        2: Spark (16)
        3: for (12)
        4: and (9)
        5: ## (9)
        6: a (8)
        7: run (7)
        8: can (7)
        9: on (7)
        10: is (6)
        11: in (6)
        12: of (5)
        13: using (5)
        14: an (4)
        15: Please (4)
        16: also (4)
        17: including (4)
        18: You (4)
        19: build (4)
        20: if (4)
        21: you (4)
        22: with (4)
        23: documentation (3)
        24: use (3)
        25: general (3)
        26: example (3)
        27: one (3)
        28: see (3)
        29: For (3)
        30: or (3)
        31: how (3)
        32: Hadoop (3)
        33: It (2)
        34: supports (2)
        35: set (2)
        36: SQL (2)
        37: do (2)
        38: at (2)
        39: Interactive (2)
        40: Shell (2)
        41: following (2)
        42: 1000: (2)
        43: Python (2)
        44: programs (2)
        45: ./bin/run-example (2)
        46: SparkPi (2)
        47: examples (2)
        48: locally (2)
        49: class (2)
        
3) 
    b) 3558412 lignes
    
            text_file = spark_context.textFile(os.path.join(SPARK_HOME, '/home/malah/Code/ISTIC/Cours/DD/TP-Spark/AOL-01.txt'))
            word_counts = text_file \
                .map(lambda t: t.split('\n'))
            print(word_counts.count())
            
        weather: 9768 lignes
        
            text_file = spark_context.textFile(os.path.join(SPARK_HOME, '/home/malah/Code/ISTIC/Cours/DD/TP-Spark/AOL-01.txt'))
            collect = text_file.filter(lambda s: "weather" in s)
            print(collect.count())
            
    c)
    
            text_file = spark_context.textFile(os.path.join(SPARK_HOME, '/home/malah/Code/ISTIC/Cours/DD/TP-Spark/AOL-01.txt'))
            word_counts = text_file \
                .map(lambda t: t.split('\n')) \
                .map(lambda t: t[0].split('\t')) \
                .map(lambda t: t[1])
            collect = word_counts.collect()
            for i in range(0,50):
                print(collect[i])
                
    d) 35911
            def convert(a):
                return [x for x in a if a.count(x) > 1]
                
             text_file = spark_context.textFile(os.path.join(SPARK_HOME, '/home/malah/Code/ISTIC/Cours/DD/TP-Spark/AOL-01.txt'))
                 word_counts = text_file \
                     .map(lambda t: t.split('\n')) \
                     .map(lambda t: t[0].split('\t')) \
                     .map(lambda t: t[1]) \
                     .map(lambda t: t.split(" ")) \
                     .map(lambda t: convert(t)) \
                     .filter(lambda t: len(t) > 0)
                 # .filter(lambda t: len(t) > 0)
                 # .map(lambda s: (s, 1)).reduceByKey(lambda a, b: a + b).filter(lambda s: s[1] > 1)
                 collect = word_counts.collect()
                 print(word_counts.count())
     
