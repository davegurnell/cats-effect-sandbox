name := "cats-effect-sandbox"

scalaVersion := "2.13.8"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.4.2",
  "org.typelevel" %% "cats-effect" % "3.3.5"
)

scalacOptions ~= Common.linterConfig
