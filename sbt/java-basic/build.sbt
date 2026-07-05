scalaVersion := "3.8.4"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Joke App",
    javacOptions ++= Seq("-source", "21"),
    libraryDependencies ++= Seq(
      "commons-io" % "commons-io" % "2.22.0",
      "com.github.sbt.junit" % "jupiter-interface" % JupiterKeys.jupiterVersion.value % Test,
    )
  )
