name := "wanwansbt3"

version := "0.1"

scalaVersion := "2.12.12"


//libraryDependencies += "org.apache.spark" %% "spark-core" % "3.0.1"

libraryDependencies += "org.apache.spark" %% "spark-core" % "3.0.1"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.0.1"
libraryDependencies += "org.apache.spark" %% "spark-catalyst" % "3.0.1"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "3.0.1"
libraryDependencies += "io.delta" %% "delta-core" % "0.7.0"


libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.6.10"
libraryDependencies += "com.typesafe.akka" %% "akka-remote" % "2.6.10"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.6.10"
