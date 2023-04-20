package _5_Kotlin_Essentials_Beyond_The_Basics

/*
* Extension Functions
* */

/*fun String.hasSpaces() : Boolean {
  val found = this.find { it == ' ' }
  return found != null
}*/

fun String.hasSpaces() = find { it == ' ' } != null

fun extensionsExample() {
  "Does it have spaces?".hasSpaces()
}

open class AquariumPlant(val color: String, private val size: Int)
class GreenLeafyPlant(size: Int): AquariumPlant("Green",size)

fun AquariumPlant.isRed() = color == "Red"
//fun AquariumPlant.isBig() = size > 50

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

fun staticExample() {
  val plant = GreenLeafyPlant(50)
  plant.print()

  val aquariumPlant: AquariumPlant = plant
  aquariumPlant.print()
}

val AquariumPlant.isGreen: Boolean
  get() = color == "Green"

fun propertyExample() {
  val plant = AquariumPlant("Green", 50)
  println(plant.isGreen)
}

fun AquariumPlant?.pull() {
  this?.apply {
    println("removing $this")
  }
}

fun nullableExample() {
  val plant: AquariumPlant? = null
  plant.pull()
}

fun main(args: Array<String>) {
  println("Does it have spaces?".hasSpaces())
  val aquarium = AquariumPlant("Red",13)
  aquarium.print()
  println("========================")
  staticExample()
  println("========================")
  propertyExample()
  println("========================")
  nullableExample()
}