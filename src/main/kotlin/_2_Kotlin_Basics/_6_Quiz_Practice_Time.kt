package _2_Kotlin_Basics

import kotlin.math.roundToInt

/*
* Practice Time
* */

fun main() {
  basicOperations()
  variables()
  nullability()
  nullabilityLists()
  nullChecks()
}


/*
* Practice Time: Basic Operations
* Solve the following using the operator methods in one line of code.
* If you start with 2 fish, and they breed twice, producing 71 offspring the first time,
* and 233 offspring the second time, and then 13 fish are swallowed by a hungry moray eel,
* how many fish do you have left? How many aquariums do you need if you can put 30 fish per aquarium?
* */

private fun basicOperations() {
  println("\nBasicOperations")

  val fish = 2
  val fishTotal = fish.plus(71).plus(233).minus(13)
  val aquariumTotal = (fishTotal / 30.0).roundToInt()
  println("Total Fish: $fishTotal, Total Aquarium: $aquariumTotal")
}


/*
* Practice Time: Variables
* Create a String variable rainbowColor, set its color value, then change it.
* Create a variable blackColor whose value cannot be changed once assigned. Try changing it anyway.
* */

private fun variables() {
  println("\nVariables")

  var rainbowColor = "Red"
  println("Color: $rainbowColor")
  rainbowColor = "Blue"
  println("New color: $rainbowColor")

  val blackColor = "Black"
  println("Static color: $blackColor")
}


/*
* Practice Time: Nullability
* Try to set rainbowColor to null. Declare two variables, greenColor and blueColor.
* Use two different ways of setting them to null.
* */

private fun nullability() {
  println("\nNullability")

  val greenColor: Int? = null
  println("Green Color: $greenColor")
  val blueColor = null
  println("Blue Color: $blueColor")
}


/*
* Practice Time: Nullability/Lists
* Create a list with two elements that are null; do it in two different ways.
* Next, create a list where the list is null.
* */

private fun nullabilityLists() {
  println("\nNullability/Lists")

  val listTypeA: List<String?> = listOf(null,null)
  val listTypeB = listOf(null,null)
  println("List Type A: $listTypeA")
  println("List Type B: $listTypeB")

  val listNull: List<String>? = null
  println("List Null: $listNull")
}


/*
* Practice Time: Null Checks
* Create a nullable integer variable called nullTest, and set it to null.
* Use a null-check that increases the value by one if it's not null, otherwise returns 0, and prints the result.
* */

private fun nullChecks() {
  println("\nNull Checks")

  var nullTest: Int? = 10
  println("Test: ${nullTest?.plus(1) ?: 0}")
  nullTest = null
  println("Test: ${nullTest?.plus(1) ?: 0}")
}

