package org.apache.spark.sql

/**
  * Created by zhoujiamu on 2019/8/5.
  */
object ActiveSession {

  def get: Option[SparkSession] = SparkSession.getActiveSession

}
