package cn.scala.community

import _root_.controllers.AssetsComponents
import cn.scala.community.controllers.MainController
import cn.scala.community.modules.MainModule
import cn.scala.community.views.html.MainTemplate
import com.softwaremill.macwire._
import play.api.ApplicationLoader.Context
import play.api.routing.Router
import play.api.{ Application, ApplicationLoader, BuiltInComponentsFromContext, LoggerConfigurator }
import play.filters.HttpFiltersComponents

class CommunityComponent(context: Context)
    extends BuiltInComponentsFromContext(context)
    with MainModule
    with HttpFiltersComponents
    with AssetsComponents {

  lazy val mainTemplate                   = wire[MainTemplate]
  lazy val mainController: MainController = wire[MainController]

  override def router: Router = mainRouter
}

class Loader extends ApplicationLoader {
  override def load(context: ApplicationLoader.Context): Application = {
    LoggerConfigurator(context.environment.classLoader).foreach {
      _.configure(context.environment, context.initialConfiguration, Map.empty)
    }
    new CommunityComponent(context).application
  }
}
