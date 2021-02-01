package controllers

import javax.inject.Inject
import play.api.i18n.{I18nSupport, Messages, MessagesApi}
import play.api.mvc.{Action, AnyContent, Controller, Request}

class HelloController @Inject()(val messagesApi: MessagesApi) extends Controller with I18nSupport {

  val logger = play.api.Logger("hello")

  def get(name: Option[String]) =
    Action { implicit request: Request[AnyContent] =>
      logger.info(s"name parameter: $name")

      Ok {
        name
          .map(s => Messages("hello", s))
          .getOrElse(Messages("noQuery"))
      }
    }
}
