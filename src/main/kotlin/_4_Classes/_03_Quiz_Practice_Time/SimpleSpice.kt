package _4_Classes._03_Quiz_Practice_Time

internal class SimpleSpice {
  var name: String = "curry"
  var spiciness: String = "mild"

  val heat: Int
    get() {return when(spiciness) {
      "mild" -> 5
      "supreme" -> 10
      else -> 0
    }}


}