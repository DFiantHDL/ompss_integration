name := "matmul"

val dfiantVersion = "0.1.0"

/////////////////////////////////////////////////////////
// These lines should be placed in every DFiant project
/////////////////////////////////////////////////////////
version := "0.1"
scalaVersion := "2.13.4"
scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-language:reflectiveCalls",
  "-language:existentials",
  "-language:implicitConversions",
  "-language:higherKinds",
  "-Ymacro-annotations"
)
libraryDependencies ++= Seq(
  "io.github.dfianthdl" %% "dfiant" % dfiantVersion
)
/////////////////////////////////////////////////////////
