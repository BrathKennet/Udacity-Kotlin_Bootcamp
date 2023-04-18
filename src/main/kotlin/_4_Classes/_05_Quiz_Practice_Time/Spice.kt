package _4_Classes._05_Quiz_Practice_Time

internal class Spice (var name: String, var spiciness: String = "mild") {

  val heat: Int
    get() {return when(spiciness) {
      "mild" -> 5
      "supreme" -> 10
      else -> 0
    }}

  init {
    println("$name -> spicy $heat")
  }

}