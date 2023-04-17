package _2_Kotlin_Basics

/*
* Practice TIme
* */

fun main(args: Array<String>) {
  practice1()
  practice2()
}

/*
* Create three String variables for trout, haddock, and snapper.
* Use a String template to print whether you do or don't like to eat these kinds of fish.
* */

private fun practice1() {
  println("\nPractice 1")

  val trout = "trout"
  val haddock = "haddock"
  val snapper = "snapper"
  println("I like to eat $trout and $snapper, but I don't like to eat $haddock.")
}

/*
* when statements in Kotlin are like case or switch statements in other languages.
* Create a when statement with three comparisons:
* If the length of the fishName is 0, print an error message.
* If the length is in the range of 3...12, print "Good fish name".
* If it's anything else, print "OK fish name".
* */

private fun practice2() {
  println("\nPractice 2")

  val fishName = "Dori"
  when (fishName.length) {
    0 -> println("Error: Name doesn't exit")
    in 3..12 -> println("Good fish name")
    else -> println("OK fish name")
  }
}