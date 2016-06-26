import play.PlayImport.PlayKeys._

name := "reactivemongo-tailablecursors-demo"

val reactiveMongoVer = "0.11.14"

version := reactiveMongoVer

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.reactivemongo" %% "play2-reactivemongo" % s"$reactiveMongoVer-play24",
  "org.reactivemongo" %% "reactivemongo-iteratees" % reactiveMongoVer
)

libraryDependencies ++= Seq("specs2-core", "specs2-junit").
  map("org.specs2" %% _ % "3.8.3" % Test)

routesGenerator := InjectedRoutesGenerator

lazy val root = (project in file(".")).enablePlugins(PlayScala)
