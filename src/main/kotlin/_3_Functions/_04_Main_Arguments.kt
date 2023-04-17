package _3_Functions

/*
* Main Arguments
* */

fun main(args: Array<String>) {
  println("Hello ${args[0]}")

  val isUnit = println("This is an expression")
  println(isUnit)

  val temperature = 10
  val isHot = (temperature > 50)
  println(isHot)

  val message = "You are ${if (temperature > 50) "fried" else "safe"}"
  println(message)
}