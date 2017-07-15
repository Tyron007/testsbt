name := "sbt test"

scalaVersion := "2.11.8"

version := "0.1"

libraryDependencies += "org.specs2" %% "specs2-core" % "3.9.1" % "test"

scalacOptions in Test ++= Seq("-Yrangepos")

val g = taskKey[String]("Determine the current commit")

g := Process("git rev-parse HEAD").lines.head

