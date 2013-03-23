import com.typesafe.sbt.SbtStartScript

name := "spray-routing-on-spray-can"

scalaVersion := "2.10.1"

resolvers += "spray repo" at "http://repo.spray.io"

libraryDependencies ++= Seq(
  "io.spray" % "spray-routing" % "1.1-M7" % "compile",
  "io.spray" % "spray-caching" % "1.1-M7" % "compile",
  "io.spray" % "spray-can" % "1.1-M7" % "compile",
  "com.typesafe.akka" %% "akka-actor" % "2.1.1",
  "com.typesafe.akka" %% "akka-slf4j" % "2.1.1",
  "ch.qos.logback" % "logback-classic" % "1.0.9"
)

seq(SbtStartScript.startScriptForClassesSettings: _*)
