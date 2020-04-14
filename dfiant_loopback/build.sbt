name := "dfiant-loopback"

val dfiantVersion = "0.0.20"

/////////////////////////////////////////////////////////
// These lines should be placed in every DFiant project
/////////////////////////////////////////////////////////
version := "0.1"
scalaVersion := "2.13.1"
resolvers += "pr" at "https://scala-ci.typesafe.com/artifactory/scala-pr-validation-snapshots/"
scalacOptions += "-deprecation"
scalacOptions ++= Seq("-feature")
scalacOptions ++= Seq("-language:reflectiveCalls")
scalacOptions ++= Seq("-language:existentials")
scalacOptions ++= Seq("-language:implicitConversions")
scalacOptions ++= Seq("-language:higherKinds")
libraryDependencies ++= Seq(
  "io.github.dfianthdl" %% "dfiant" % dfiantVersion
)
/////////////////////////////////////////////////////////
