name := "$name$"
version := "0.0.1"

scalaVersion := "3.8.2"

Compile / scalacOptions ++= Seq(
  "-deprecation",
  "-explain",
  "-feature",
  "-print-lines",
  "-unchecked",
  "-Werror",
  "-source:3.8",
  "-encoding", "utf8"
)

