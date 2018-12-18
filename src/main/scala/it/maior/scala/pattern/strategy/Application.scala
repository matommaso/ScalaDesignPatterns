package it.maior.scala.pattern.strategy

object Application {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    def duck00 = new MallardDuck
    duck00.performQuack()
  }
}
