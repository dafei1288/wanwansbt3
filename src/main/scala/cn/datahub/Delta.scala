package cn.datahub

import io.delta.tables.DeltaTable
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.expr

object Delta {
  def main(args: Array[String]): Unit = {

    System.setProperty("hadoop.home.dir", "E:\\devlop\\workspace\\wanwansbt3")

    val spark = SparkSession.builder.appName("MyApp").master("local")
      //      .config("spark.jars.packages", "io.delta:delta-core_2.12:0.7.0")
      .config("spark.sql.extensions", "io.delta.sql.DeltaSparkSessionExtension")
      .config("spark.sql.catalog.spark_catalog", "org.apache.spark.sql.delta.catalog.DeltaCatalog")
      .getOrCreate()

    val deltaTable = DeltaTable.forPath(spark, "./data/delta-table")
    deltaTable.toDF.show();

    deltaTable.update(
      condition = expr("id % 2 == 0"),
      set = Map("id" -> expr("id + 100"))
    )

    deltaTable.toDF.show()

  }
}
