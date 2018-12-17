name := """blogapp"""
organization := "amar.bratic"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  guice,
  javaJpa,
  javaJdbc,
  "org.hibernate" % "hibernate-entitymanager" % "5.1.10.Final",
  "mysql" % "mysql-connector-java" % "8.0.11",
  javaWs
)