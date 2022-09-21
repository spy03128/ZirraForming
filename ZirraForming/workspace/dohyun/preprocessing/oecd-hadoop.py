import findspark
import pyspark
from pyspark.sql import SparkSession


def make_spark_connection() -> SparkSession:
    return SparkSession.builder.getOrCreate()


def read_text_file(spark: SparkSession, filepath: str) -> pyspark.RDD:
    rdd = spark.sparkContext.textFile(f'hdfs://cluster:8020/user/j7d107/{filepath}')
    return rdd


def map_phaze(rdd):
    return rdd.flatMap(lambda x: x.split())


# def reduce_phaze(rdd):
#     return rdd.map(lambda x: (x, 1)).groupByKey().mapValues(sum).sortByKey(True)


findspark.init()
spark = make_spark_connection()
rdd = read_text_file(spark, "oecd-preprocessing-result.csv")
print(rdd)
# map_result = map_phaze(rdd)
#
# print(map_result)