import scala.collection.immutable.Seq

scalaVersion in ThisBuild := "2.11.8"

lazy val `wrong-warn-example` = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "wrong-warn-example",
    organization := "com.example",
    version := "1.0",
    scalaVersion := "2.11.8",
    resolvers ++= Seq(
      "Typesafe Releases" at "http://repo.typesafe.com/typesafe/maven-releases/"
    ),
    scalacOptions := Seq(
      "-deprecation",
      "-explaintypes",
      "-feature",
      "-language:postfixOps",
      "-language:implicitConversions",
      "-target:jvm-1.8",
      "-unchecked",
      "-Xcheckinit",
      "-Xfuture",
      "-Xlint",
      "-Xfatal-warnings", // Doesn't work on the routes file because of unused imports...
      "-Xverify",
      "-Ywarn-adapted-args",
      "-Ywarn-dead-code",
      "-Ywarn-inaccessible",
      "-Ywarn-infer-any",
      "-Ywarn-nullary-override",
      "-Ywarn-nullary-unit",
      "-Ywarn-unused",
      "-Ywarn-unused-import"
    ))
