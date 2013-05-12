import sbt._
import Keys._

object ProjectBuild extends Build with Resolvers with Dependencies{

  private val buildSettings = Project.defaultSettings ++ Seq(
    name := "scala-seda",
    scalaVersion := "2.10.1",
    version := "1.0",
    resolvers := Seq(typesafe),
    libraryDependencies := Seq(akkaActors),
    scalacOptions := Seq("-deprecation", "-unchecked"))
 
  lazy val main = Project("scala-seda", file("."), settings = buildSettings)
}


trait Resolvers {
  val typesafe = "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases"
}

trait Dependencies {
  val akkaVersion = "2.1-M1"
  val akkaActors = "com.typesafe.akka" % "akka-actor"  % akkaVersion
}

