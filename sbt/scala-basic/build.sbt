scalaVersion := "3.10.1"

name := "Joke App"

scalacOptions ++= Seq("--release", "21")

Compile / mainClass := Some("com.example.main")

libraryDependencies +=
  "org.scalatest" %% "scalatest" % "3.2.20" % Test
