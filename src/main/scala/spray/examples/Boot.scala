package spray.examples

import scala.util.Properties
import akka.actor.Props
import spray.can.server.SprayCanHttpServerApp

object Boot extends App with SprayCanHttpServerApp {

  // create and start our service actor
  val service = system.actorOf(Props[DemoServiceActor], "demo-service")

  // make compatible with foreman for deployment to Heroku
  val port = Properties.envOrElse("PORT", "8080").toInt

  // create a new HttpServer using our handler and tell it where to bind to
  newHttpServer(service) ! Bind(interface = "0.0.0.0", port = port)
}