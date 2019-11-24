import sbt._

object Dependencies {
  lazy val macwire = {
    val macwireVersion = "2.3.3"
    Seq(
      "com.softwaremill.macwire" %% "macros"     % macwireVersion % "provided",
      "com.softwaremill.macwire" %% "macrosakka" % macwireVersion % "provided",
      "com.softwaremill.macwire" %% "util"       % macwireVersion,
      "com.softwaremill.macwire" %% "proxy"      % macwireVersion
    )
  }

}
