#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Template for Spark job scripts for M2 DD tutorials."""

import os
import sys

# Define paths
SPARK_HOME = '/home/malah/Code/ISTIC/Cours/DD/Sparl avancé/spark-2.4.0-bin-hadoop2.7/'
os.environ['SPARK_HOME'] = SPARK_HOME
os.environ['PYSPARK_PYTHON'] = 'python3.7'
os.environ['PYSPARK_DRIVER_PYTHON'] = 'python3.7'
sys.path.append(SPARK_HOME + '/python')
sys.path.append(SPARK_HOME + '/python/lib/py4j-0.10.6-src.zip')
from functools import reduce

# Import pyspark modules
from pyspark import SparkConf, SparkContext  # noqa

# Create a Spark configuration object, to create a context into which we create
# a session => The only object to be manipulated here is the spark_context
spark_conf = SparkConf().setMaster('local[*]')
spark_context = SparkContext(conf=spark_conf)


def convert(a):
    return [x for x in a if a.count(x) > 1]


# Define here your proceses
try:
    text_file = spark_context.textFile(os.path.join(SPARK_HOME, '/home/malah/Code/ISTIC/Cours/DD/Sparl avancé/agg_match_stats_0.csv/ech.csv'))
    word_counts = text_file \
        .map(lambda t: t.split(',')) \
        .filter(lambda t: t[10] != "player_kills") \
        .map(lambda t: (t[11], (float) (t[10]))) \
        .reduceByKey(lambda a, b: a + b) \
        .map(lambda t: (t[1], t[0])) \
        .sortByKey(ascending=False) \
        .take(10)

    # .filter(lambda t: len(t) > 0)
    # .map(lambda s: (s, 1)).reduceByKey(lambda a, b: a + b).filter(lambda s: s[1] > 1)
    for i in range(0,9):
        print(word_counts[i])

# Except an exception, the only thing that it will do is to throw it again
except Exception as e:
    raise e

# NEVER forget to close your current context
finally:
    spark_context.stop()
