scalaVersion := "3.9.0"

name := "Joke App"

javacOptions ++= Seq("--release", "21")

libraryDependencies +=
  "org.scalatest" %% "scalatest" % "3.2.20" % Test
