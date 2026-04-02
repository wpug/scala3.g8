name := "$name$"
version := "0.0.1"

scalaVersion := "3.8.3"

Compile / scalacOptions ++= Seq(
  "-deprecation",
  "-explain",
  "-feature",
  "-unchecked",
  "-Werror",
  "-source:3.8",
  "-encoding", "utf8"
)

