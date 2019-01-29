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


acc = spark_context.accumulator(0)
scoreVar = spark_context.broadcast([1, 42, 100, 9999])


def score(assist, dmg, kill, position):
    if kill == 0 or assist / kill >= 5:
        acc.add(1)
    s = assist * scoreVar.value[1] + dmg * scoreVar.value[0] + kill * scoreVar.value[2]
    if position == 1:
        s += scoreVar.value[3]
    return s


try:
    # date	game_size	match_id	match_mode	party_size	player_assists	player_dbno	player_dist_ride	player_dist_walk	player_dmg	player_kills	player_name	player_survive_time	team_id	team_placement

    start = time.time()
    text_file = spark_context.textFile(os.path.join(SPARK_HOME, '/home/malah/Code/ISTIC/Cours/DD/Sparl avancé/agg_match_stats_0.csv/ech.csv'))
    word_counts = text_file \
        .map(lambda t: t.split(',')) \
        .filter(lambda t: t[10] != "player_kills") \
        .filter(lambda t: t[11] != '') \
        .map(lambda t: (t[11],  score((float) (t[5]), (float) (t[9]), (float) (t[10]), (float) (t[14])))) \
        .reduceByKey(lambda a, b: a + b) \
        .map(lambda t: (t[1], t[0])) \
        .sortByKey(ascending=False) \
        .take(10)

    for i in range(0,9):
        print(word_counts[i])

    finish = time.time()
    elapse = finish - start
    print("MEMORY_ONLY Duration: {}".format(elapse))
    print("Nb de joueurs 5 fois plus d'assist que de kill {}".format(acc.value))

# Except an exception, the only thing that it will do is to throw it again
except Exception as e:
    raise e

# NEVER forget to close your current context
finally:
    spark_context.stop()
