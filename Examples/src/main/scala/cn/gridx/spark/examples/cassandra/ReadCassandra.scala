package cn.gridx.spark.examples.cassandra

import org.apache.spark.{SparkContext, SparkConf}
import com.datastax.spark.connector._

/**
  * Created by tao on 3/17/16.
  */
object ReadCassandra {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf(true)
      .set("spark.cassandra.connection.host", "ecs1")

    val sc = new SparkContext(conf)
    val rdd = sc.cassandraTable("xt_space", "cars")
    rdd.toArray.foreach(println)

    sc.stop
  }
}
