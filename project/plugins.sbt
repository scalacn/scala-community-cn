lazy val bundlerVersion = "0.15.0-0.6"

addSbtPlugin("com.typesafe.play" % "sbt-plugin"              % "2.7.3")
addSbtPlugin("org.scalameta"     % "sbt-scalafmt"            % "2.2.1")
addSbtPlugin("ch.epfl.scala"     % "sbt-scalajs-bundler"     % bundlerVersion)
addSbtPlugin("ch.epfl.scala"     % "sbt-web-scalajs-bundler" % bundlerVersion)
addSbtPlugin("org.scala-js"      % "sbt-scalajs"             % "0.6.31")
addSbtPlugin("com.typesafe.sbt"  % "sbt-gzip"                % "1.0.2")
addSbtPlugin("com.typesafe.sbt"  % "sbt-digest"              % "1.1.4")
