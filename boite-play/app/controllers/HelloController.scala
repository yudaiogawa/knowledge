package controllers

import javax.inject.Inject
import play.api.i18n.{I18nSupport, Messages, MessagesApi}
import play.api.mvc.{Action, AnyContent, Controller, Request}

class HelloController @Inject()(val messagesApi: MessagesApi) extends Controller with I18nSupport {

  def get(name: Option[String]) =
    Action { implicit request: Request[AnyContent] =>
      Ok {
        name
          .map(s => Messages("hello", s))
          .getOrElse(Messages("noQuery"))
      }
    }
}
