package _3_Functions

import java.util.*

/*
* Random Days
* */

fun main(args: Array<String>) {
  println(args[0])
  feedTheFish()
}

private fun feedTheFish() {
  val day = randomDay()
  val food = "pellets"
  println("Today is $day and the fish eat $food")
}

private fun randomDay(): String {
  val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
  return week[Random().nextInt(7)]
}