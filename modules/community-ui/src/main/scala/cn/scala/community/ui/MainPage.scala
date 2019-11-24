package cn.scala.community.ui

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._

import org.scalajs.dom.document

object MainPage extends App {

  val helloScalaCN = ScalaComponent
    .builder[Unit]("Hello-Scala-CN")
    .renderStatic(<.h1("Hello, Scala Community China!"))
    .build

  helloScalaCN().renderIntoDOM(document.getElementById("body"))
}
