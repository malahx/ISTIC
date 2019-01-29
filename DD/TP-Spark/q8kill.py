#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Template for Spark job scripts for M2 DD tutorials."""

import os
import sys

# Define paths
import time

SPARK_HOME = '/home/malah/Code/ISTIC/Cours/DD/Sparl avancé/spark-2.4.0-bin-hadoop2.7/'
os.environ['SPARK_HOME'] = SPARK_HOME
os.environ['PYSPARK_PYTHON'] = 'python3.7'
os.environ['PYSPARK_DRIVER_PYTHON'] = 'python3.7'
sys.path.append(SPARK_HOME + '/python')
sys.path.append(SPARK_HOME + '/python/lib/py4j-0.10.6-src.zip')
from functools import reduce

# Import pyspark modules
from pyspark import SparkConf, SparkContext, StorageLevel  # noqa

# Create a Spark configuration object, to create a context into which we create
# a session => The only object to be manipulated here is the spark_context
spark_conf = SparkConf().setMaster('local[*]')
spark_context = SparkContext(conf=spark_conf)


def convert(a):
    return [x for x in a if a.count(x) > 1]


# Define here your proceses
try:

    start = time.time()
    text_file = spark_context.textFile(os.path.join(SPARK_HOME, '/home/malah/Code/ISTIC/Cours/DD/Sparl avancé/agg_match_stats_0.csv/ech.csv'))
    word_counts = text_file \
        .map(lambda t: t.split(',')) \
        .filter(lambda t: t[10] != "player_kills") \
        .filter(lambda t: t[11] != '') \
        .map(lambda t: (t[11], ((float) (t[10]), 1))) \
        .reduceByKey(lambda a, b: (a[0] + b[0], a[1] + b[1])) \
        .persist(storageLevel=StorageLevel.MEMORY_ONLY)

    print(word_counts.count())

    players = word_counts \
        .filter(lambda t: t[1][1] >= 4) \
        .map(lambda t: (t[0], t[1][0] / t[1][1])) \
        .map(lambda t: (t[1], t[0])) \
        .sortByKey(ascending=False) \
        .take(10)

    for i in range(0,9):
        print(players[i])

    finish = time.time()
    elapse = finish - start
    print("MEMORY_ONLY Duration: {}".format(elapse))


    start = time.time()
    text_file = spark_context.textFile(os.path.join(SPARK_HOME, '/home/malah/Code/ISTIC/Cours/DD/Sparl avancé/agg_match_stats_0.csv/ech.csv'))
    word_counts = text_file \
        .map(lambda t: t.split(',')) \
        .filter(lambda t: t[10] != "player_kills") \
        .filter(lambda t: t[11] != '') \
        .map(lambda t: (t[11], ((float) (t[10]), 1))) \
        .reduceByKey(lambda a, b: (a[0] + b[0], a[1] + b[1])) \
        .persist(storageLevel=StorageLevel.DISK_ONLY)

    print(word_counts.count())

    players = word_counts \
        .filter(lambda t: t[1][1] >= 4) \
        .map(lambda t: (t[0], t[1][0] / t[1][1])) \
        .map(lambda t: (t[1], t[0])) \
        .sortByKey(ascending=False) \
        .take(10)

    for i in range(0,9):
        print(players[i])

    finish = time.time()
    elapse = finish - start
    print("DISK_ONLY Duration: {}".format(elapse))

# Except an exception, the only thing that it will do is to throw it again
except Exception as e:
    raise e

# NEVER forget to close your current context
finally:
    spark_context.stop()
