package controllers

import javax.inject._

import play.api.mvc._

import scala.concurrent.Future

@Singleton
class Application @Inject() (cc: ControllerComponents) extends AbstractController(cc) {

  def index(path: String): Action[AnyContent] = Action.async { implicit req: Request[AnyContent] =>
    Future.successful(Ok(s"Hello Play 2.6 \uD83D\uDC4B. Path is ${req.toString}"))
  }

}
