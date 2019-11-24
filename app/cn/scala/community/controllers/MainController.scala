package cn.scala.community.controllers

import cn.scala.community.views.html.MainTemplate
import controllers.AssetsFinder
import play.api.mvc.{ AbstractController, Action, AnyContent, ControllerComponents }

class MainController(cc: ControllerComponents, assetsFinder: AssetsFinder, mainTemplate: MainTemplate) extends AbstractController(cc) {

  def mainPage: Action[AnyContent] = Action {
    val projectName = "community-ui"
    Ok(mainTemplate("Scala 中国社区", projectName))
  }
}
