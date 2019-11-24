name := "community-ui"

val scalaCssVersion     = "0.5.6"
val scalaJsReactVersion = "1.4.2"
val materialUIVersion   = "^0.40.0"
val reactVersion        = "16.7.0"

libraryDependencies ++= Seq(
  "org.scala-js"                      %%% "scalajs-java-time" % "0.2.5",
  "com.github.japgolly.scalacss"      %%% "ext-react"         % scalaCssVersion,
  "com.github.japgolly.scalacss"      %%% "core"              % scalaCssVersion,
  "com.github.japgolly.scalajs-react" %%% "core"              % scalaJsReactVersion,
  "com.typesafe.play"                 %%% "play-json"         % "2.7.3",
  "com.github.japgolly.scalajs-react" %%% "extra"             % scalaJsReactVersion
)

scalaJSUseMainModuleInitializer := true
//    webpackBundlingMode := BundlingMode.LibraryOnly(),
//    emitSourceMaps := false,
//webpackConfigFile in fastOptJS := Some(baseDirectory.value / "dev.webpack.config.js")
// Use a different Webpack configuration file for production
//webpackConfigFile in fullOptJS := Some(baseDirectory.value / "prod.webpack.config.js")
// Use the shared Webpack configuration file for reload workflow and for running the tests
//webpackConfigFile in Test := Some(baseDirectory.value / "common.webpack.config.js")
npmDevDependencies in Compile ++= Seq(
  "webpack-merge" -> "4.2.1",
  "image-webpack-loader" -> "4.6.0",
  "css-loader" -> "^2.1.0",
  "less" -> "3.0.0",
  "less-loader" -> "^4.1.0",
  "url-loader" -> "^1.1.2",
  "file-loader" -> "^3.0.1",
  "style-loader" -> "^0.23.1"
)
npmDependencies in Compile ++= Seq(
  "react" -> reactVersion,
  "react-dom" -> reactVersion
)
