package _2_Kotlin_Basics

/*
* Quiz Strings
* */

/*
* Read the code below, try to follow what it does, and then choose the correct answer:
* */

fun main(args: Array<String>) {
  var welcomeMessage = "Hello and welcome to Kotlin"
  when (welcomeMessage.length) {
    0 -> println("Nothing to say?")
    in 1..50 -> println("Perfect")
    else -> println("Too long!")
  }
  // 27 -> Perfect
}
