# Objectives

- Standalone version of spray-routing/on-spray-can example
- Based on build.sbt
- Based on latest versions of Scala and Akka
- Ready for deployment to Heroku

# Dependencies

- Requires sbt 0.12.1 to build.

# How to run

Clone this repository, then run the application in one of the following ways.

- Locally using sbt

        $ sbt clean compile run
        ...
        [success] Total time: 15 s, completed Mar 23, 2013 12:16:35 AM
        [info] Running spray.examples.Boot
        03/23 00:16:36 INFO [spray-examples-Boot-akka.actor.default-dispatcher-4] a.e.s.Slf4jEventHandler - Slf4jEventHandler started
        03/23 00:16:37 INFO [spray-examples-Boot-akka.actor.default-dispatcher-4] akka://spray-examples-Boot/user/io-bridge - akka://spray-examples-Boot/user/io-bridge started
        03/23 00:16:38 INFO [spray-examples-Boot-akka.actor.default-dispatcher-4] akka://spray-examples-Boot/user/http-server - akka://spray-examples-Boot/user/http-server started on /0.0.0.0:8080

- Locally using foreman (simulates Heroku)

        $ sbt clean compile stage
        ...
        [info] Wrote start script for mainClass := Some(spray.examples.Boot) to /Users/laufer/Work/Eclipse/workspace-cs313/spray-routing-on-spray-can/target/start
        [success] Total time: 0 s, completed Mar 23, 2013 12:18:11 AM

        $ foreman start
        00:18:51 web.1     | started with pid 18374
        00:18:52 web.1     | 03/23 00:18:52 INFO [spray-examples-Boot-akka.actor.default-dispatcher-3] a.e.s.Slf4jEventHandler - Slf4jEventHandler started
        00:18:53 web.1     | 03/23 00:18:53 INFO [spray-examples-Boot-akka.actor.default-dispatcher-4] akka://spray-examples-Boot/user/io-bridge - akka://spray-examples-Boot/user/io-bridge started
        00:18:53 web.1     | 03/23 00:18:53 INFO [spray-examples-Boot-akka.actor.default-dispatcher-4] akka://spray-examples-Boot/user/http-server - akka://spray-examples-Boot/user/http-server started on /0.0.0.0:5000

- On Heroku

    [These instructions](http://devcenter.heroku.com/articles/scala#deploy_to_herokucedar) should
    work out of the box. The last few lines of the output should look like this.

               [success] Total time: 5 s, completed Dec 1, 2012 6:13:21 AM
               [info] Wrote start script for mainClass := Some(spray.examples.Boot) to /tmp/build_326t41ltqpc34/target/start
               [success] Total time: 0 s, completed Dec 1, 2012 6:13:21 AM
        -----> Discovering process types
               Procfile declares types -> web
        -----> Compiled slug size: 83.1MB
        -----> Launching... done, v9
               http://quiet-samurai-5737.herokuapp.com deployed to Heroku

        To git@heroku.com:quiet-samurai-5737.git
           2023f74..c0c4824  master -> master

    Now you can connect to the app URL `http://quiet-samurai-5737.herokuapp.com` *on port 80*.
    There is an internal port that varies across invocations of the app, but the app
    is always exposed on port 80.
