scalaVersion := "3.9.0"

name := "Joke App"

javacOptions ++= Seq("--release", "21")

libraryDependencies ++= Seq(
  "commons-io" % "commons-io" % "2.22.0",
  "com.github.sbt.junit" % "jupiter-interface" % JupiterKeys.jupiterVersion.value % Test,
)
