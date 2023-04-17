package _2_Kotlin_Basics

/*
* Operators
* */

fun main(args: Array<String>) {
  basicOperators()
  overrideBasicOperators()
  numberAsObject()
  typeVariable()
  nullability()
}

private fun basicOperators() {
  println("\nBasic Operators")

  println(1+1)
  println(53-3)
  println(50/10)
  println(1/2)
  println(1.0/2.0)
  println(6*50)
}

private fun overrideBasicOperators() {
  println("\nOverride Operators")

  val fish = 4
  // a*b
  println(fish.times(4))

  // a/b
  println(fish.div(2))

  // a+b
  println(fish.plus(3))

  // a-b
  println(fish.minus(3))
}

private fun numberAsObject() {
  println("\nNumber as Object")

  // use primitive 'int' as an object
  println(1.toLong())

  // or, put int in a box
  val boxed: Number = 1
  println(boxed.toLong())
}

private fun typeVariable() {
  println("\nType Variable")

  // Assign a value once
  val aquarium = 1
  println(aquarium)

  // Assign a value, you can't change the type of variable once it has been determined
  var fish = 2
  println(fish)
  fish = 50
  println(fish)

  // Use variables in operators
  val plants = 5
  val algae = 2
  println(plants + algae)

  // Number types won't implicitly convert to other types
  val b: Byte = 1
  //val i: Int = b
  val i: Int = b.toInt()
  println(i)

  // Kotlin supports underscores in number
  val oneMillion = 1_000_000
  val socialSecurityNumber = 999_99_9999L
  val hexBytes = 0xFF_EC_DE_5E
  val bytes = 0b11010010_01101001_10010100_10010010
  println("$oneMillion, $socialSecurityNumber, $hexBytes, $bytes")
}

private fun nullability() {
  println("\nNullability")

  //var rocks: Int = null
  var rocks: Int? = null
  println(rocks)

  var lotsOfFish: List<String?> = listOf(null,null)
  println(lotsOfFish)

  var everMoreFish: List<String>? = null
  println(everMoreFish)

  var definitelyFish: List<String?>? = null
  println(definitelyFish)

  // Pointer Exceptions
  // goldfish = null
  // goldfish!!.eat()

  // Elvis Operator ?:
  var fishFoodTreats: Int? = 5
  println(fishFoodTreats?.dec() ?: 0)
  fishFoodTreats = null
  println(fishFoodTreats?.dec() ?: 0)
}
