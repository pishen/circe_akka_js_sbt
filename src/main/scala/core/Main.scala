package core

import akka.actor.ActorSystem
import java.time._
import io.circe._
import io.circe.generic.auto._
import io.circe.syntax._
import io.circe.java8.time._

object Main {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem("AudExt")

    println(LocalDate.now.asJson.noSpaces)
  }
}
