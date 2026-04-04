lazy val root = project
  .in(file("."))
  .settings(
    name := "Joke App",
    javacOptions ++= Seq("-source", "21"),
    libraryDependencies ++= Seq(
      "commons-io" % "commons-io" % "2.21.0",
      "com.github.sbt" % "junit-interface" % "0.13.3" % Test,
      "junit" % "junit" % "4.13.2" % Test
    )
  )
