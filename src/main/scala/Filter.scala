object Filter extends App {

  def filter[A](f: A => Boolean, list: Seq[A]): Seq[A] = {
    for {
      x <- list
      if f(x)
    } yield x
  }

  val list = Seq(1, 2, 3, 4, 5)

  def lessThanFour(x: Int): Boolean = x < 4

  val f = {x: Int => x < 3}
  val result = filter(lessThanFour, list)
  val result2 = filter(f, list)
  val result3 = filter({x: Int => x < 5}, list)

  println(result)
  println(result2)
  println(result3)


  private def passByNameTest(codeBlock: => Unit): Unit = {
    println("first")
    codeBlock
    println("last")
  }

  passByNameTest(println("codeBlock"))
}
