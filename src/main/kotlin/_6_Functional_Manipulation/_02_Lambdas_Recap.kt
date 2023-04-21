package _6_Functional_Manipulation

/*
* Generic Classes
* */

fun main (args: Array<String>) {

  println("\nLambda")
  //{ println("Hello Fish: ")}()
  val waterFilter = {dirty: Int -> dirty/2}
  println(waterFilter(30))

  println("\nData Class")
  data class Fish (val name: String)
  val myFish = listOf(Fish("Flipper"), Fish("Moby Dick"), Fish("Dory"))
  println(myFish.filter { it.name.contains("i") }.joinToString(" ") { it.name })

}

