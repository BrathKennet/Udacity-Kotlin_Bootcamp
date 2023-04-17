package _2_Kotlin_Basics

/*
* Strings
* */

fun main(args: Array<String>) {
  strings()
  operators()
}

private fun strings() {
  println("\nStrings")

  println("Hello Fish")
  println("Hello" + "fish")

  // String templates
  val numberOfFish = 5
  val numberOfPlants = 12
  println("I have $numberOfFish fish and $numberOfPlants plants")
  println("I have ${numberOfFish + numberOfPlants} fish and plants")
}

private fun operators(){
  println("\nOperators")

  // Boolean
  val fish = "fish"
  val plant = "plant"
  println(fish == plant)
  println(fish == fish)
  println(fish != plant)

  // Conditions
  val numberOfFish = 50
  val numberOfPlants = 23

  if (numberOfFish > numberOfPlants) println("Good ratio!")
  else println("Unhealthy ratio")

  // Range
  val plants = 50
  if (plants in 1..100) println(plants)

  // When
  when (numberOfFish) {
    0 -> println("Empty tank")
    50 -> println("Full tank")
    else -> println("Perfect!")
  }
}