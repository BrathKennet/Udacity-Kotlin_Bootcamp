package _2_Kotlin_Basics

import java.util.*

/*
* Arrays and Loops
* */

fun main(args: Array<String>) {
  aboutVal()
  loops()
  initialize()
}

private fun aboutVal(){
  println("\nAbout val")

  val myList = mutableListOf("tuna", "salmon", "shark")

  // Can't assign it a difference reference later
  // myList = mutableListOf("koi", "goldfish")

  // Val only applies to the reference
  myList.remove("shark")
  println(myList)
}


private fun loops() {
  println("\nLoops")

  // Example of collections
  val fish = 12
  val plants = 5
  val swarm = listOf(fish, plants)
  println(swarm)

  // ArrayOf
  val school = arrayOf("tuna", "salmon", "shark")
  val numbers = intArrayOf(1, 2, 3)

  //println(Arrays.toString(intArrayOf(2,"foo")))

  val mix = arrayOf("fish", 2)
  println(Arrays.toString(mix))

  // Nest Arrays
  val bigSwarm = arrayOf(swarm, arrayOf("dolphin", "whale", "orca"))
  println(Arrays.toString(bigSwarm))

  // Loops
  for (element in swarm) println(element)

  for ((index, element) in swarm.withIndex()) {
    println("Fish at $index is $element")
  }

  for (i in 'b'..'g') print("$i,")
  println()

  for (i in 1..5) print("$i,")
  println()

  for (i in 5 downTo 1) print("$i,")
  println()

  for (i in 3..6 step 2) print("$i,")
  println()

}

private fun initialize(){
  println("\nInitialize")

  val array = Array(5) { it * 2 }
  println(array.asList())
}
