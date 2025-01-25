import scala.concurrent.Future
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object Order extends App {
  firstQuarter()
  secondQuarter()
  thirdQuarter()
  fourthQuarter()
  Thread.sleep(10000)

  def firstQuarter(): Unit = {
    Future {
      List("a", "b", "c", "d", "e", "f").foreach(letter => println(letter))
    }
  }

  def secondQuarter(): Unit = {
    Future {
      List("g", "h", "i", "j", "k", "l", "m").foreach(letter => println(letter))
    }
  }

  def thirdQuarter(): Unit = {
    Future {
      List("n", "o", "p", "q", "r", "s").foreach(letter => println(letter))
    }
  }

  def fourthQuarter(): Unit = {
    Future {
      List("t", "u", "v", "w", "x", "y", "z").foreach(letter => println(letter))
    }
  }
}
