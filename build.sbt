lazy val root = (project in file(".")).
  settings(
    name := "scala-99-problems",
    version := "1.0",
    scalaVersion := "2.11.4"
  )
libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"
