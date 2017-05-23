name := """speech_transcripter"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.11"

libraryDependencies += "com.google.cloud" % "google-cloud-speech" % "0.17.1-alpha"
libraryDependencies += filters