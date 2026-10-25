scalaVersion := "3.10.0"

name := "Joke App"

scalacOptions ++= Seq("--release", "21")

libraryDependencies +=
  "org.scalatest" %% "scalatest" % "3.2.20" % Test
