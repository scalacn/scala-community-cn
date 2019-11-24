import Dependencies._

name := "scala-community-cn"

lazy val commonSettings = Seq(
  scalaVersion := "2.12.10",
  version := "0.1"
)

def subProject(name: String): Project =
  Project(name, file(s"modules/$name"))
    .settings(commonSettings: _*)

lazy val CommunityUI = subProject("community-ui")
  .enablePlugins(ScalaJSPlugin)
  .enablePlugins(ScalaJSBundlerPlugin)

lazy val CommunityService = subProject("community-service")
  .enablePlugins(PlayScala)

lazy val ScalaCommunityCN = project
  .in(file("."))
  .enablePlugins(PlayScala, WebScalaJSBundlerPlugin)
  .settings(commonSettings: _*)
  .dependsOn(CommunityUI, CommunityService)
  .aggregate(CommunityUI, CommunityService)
  .settings(
    scalaJSProjects := Seq(CommunityUI),
    pipelineStages in Assets := Seq(scalaJSPipeline),
    pipelineStages := Seq(digest, gzip),
    ivyLoggingLevel := UpdateLogging.Quiet,
    libraryDependencies ++= macwire
  )
