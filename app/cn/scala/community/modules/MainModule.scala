package cn.scala.community.modules

import cn.scala.community.controllers.MainController
import controllers.Assets
import play.api.routing.Router
import play.api.routing.sird._

trait MainModule {
  def mainController: MainController
  def assets: Assets

  lazy val mainRouter: Router = Router.from {
    case GET(p"/") =>
      mainController.mainPage
    case GET(p"/assets/$file*") =>
      assets.versioned(path = "/public", file = file)
  }
}
