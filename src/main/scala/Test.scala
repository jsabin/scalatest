import java.lang.System.console
import scala.io.StdIn.readChar

object Test extends App {
  while(true) {
    val c = console().reader().read()
    println(c)
  }

}
