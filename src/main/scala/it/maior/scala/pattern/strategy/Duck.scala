package it.maior.scala.pattern.strategy

trait Duck {

  val quackBehavior = new Quack()


  def performQuack(): Unit ={
    quackBehavior.quack()
  }

  def swim (): Unit ={
    println("I am swimming")
  }
  def display()
  def fly()
}
