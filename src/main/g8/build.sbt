name := "$name$"
version := "0.0.1"

scalaVersion := "3.9.0"

Compile / scalacOptions ++= Seq(
  "-deprecation",
  "-explain",
  "-feature",
  "-unchecked",
  "-Werror",
  "-source:3.9",
  "-encoding", "utf8"
)

