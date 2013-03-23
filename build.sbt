import com.typesafe.sbt.SbtStartScript

name := "spray-routing-on-spray-can"

scalaVersion := "2.10.1"

resolvers += "spray repo" at "http://repo.spray.io"

libraryDependencies ++= {
  object V {
    val spray = "1.1-M7"
    val akka  = "2.1.1"
  }
  Seq(
    "io.spray"          %  "spray-routing"   % V.spray % "compile",
    "io.spray"          %  "spray-caching"   % V.spray % "compile",
    "io.spray"          %  "spray-can"       % V.spray % "compile",
    "com.typesafe.akka" %% "akka-actor"      % V.akka,
    "com.typesafe.akka" %% "akka-slf4j"      % V.akka,
    "ch.qos.logback"    %  "logback-classic" % "1.0.9"
  )
}

seq(SbtStartScript.startScriptForClassesSettings: _*)
