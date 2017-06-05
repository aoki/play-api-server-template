package com.ringohub.filters

import javax.inject.{Inject, Singleton}

import akka.stream.Materializer
import play.api.mvc.{Filter, RequestHeader, Result}

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class HelloPlayFilter  @Inject()(
  implicit override val mat: Materializer,
  exec: ExecutionContext
) extends Filter {
  override def apply(nextFilter: RequestHeader => Future[Result])(requestHeader: RequestHeader): Future[Result] = {
    nextFilter(requestHeader).map { result =>
      result.withHeaders("X-HelloPlayFilter" -> "Hello Play Framework")
    }
  }
}
