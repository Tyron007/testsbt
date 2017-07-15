name := "sbt test"

scalaVersion := "2.11.8"

version := "0.1"

libraryDependencies += "org.specs2" %% "specs2-core" % "3.9.1" % "test"

scalacOptions in Test ++= Seq("-Yrangepos")

val g = taskKey[String]("Determine the current commit")

g := Process("git rev-parse HEAD").lines.head

val makeversionProperties = taskKey[Seq[File]]("Makes a version properties files")

resourceGenerators in Compile += makeversionProperties

lazy val common = {
Project("common", file("common"))
.settings(
makeversionProperties := {
val files = new File((resourceManaged in Compile).value, "version.properties")
val content = "version=%s" format (g.value)
IO.write(files, content)
Seq(files)
}
)}