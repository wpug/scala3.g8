name := "$name$"
version := "0.0.1"

scalaVersion := "3.6.3"

scalacOptions := Seq(
  "-deprecation",
  "-explain",
  "-feature",
  "-print-lines",
  "-unchecked",
  "-Xfatal-warnings",
  "-source:3.3",
  "-encoding", "utf8"
)

libraryDependencies ++= Seq(
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
    "ch.qos.logback" % "logback-classic" % "1.5.16"
)

