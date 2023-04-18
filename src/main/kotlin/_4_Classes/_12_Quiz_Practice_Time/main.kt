package _4_Classes._12_Quiz_Practice_Time

/*
* Practice Time
* */

/*
* Create a simple data class, SpiceContainer, that holds one spice.
* Give SpiceContainer a property, label, that is derived from the name of the spice.
* Create some containers with spices and print out their labels.
* */

fun main(args: Array<String>) {
  val listSpice = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
    SpiceContainer(Curry("Red Curry", "medium")),
    SpiceContainer(Curry("Green Curry", "spicy")))
  println(listSpice)
}

private data class SpiceContainer(val spice: Spice) {
  val label = spice.name
}

private abstract class Spice (var name: String, var spiciness: String = "mild") {

  val heat: Int
    get() {return when(spiciness) {
      "mild" -> 5
      "supreme" -> 10
      else -> 0
    }}

  abstract fun prepareSpice()

}

private class Curry(nameCurry: String, spicinessCurry: String): Spice(nameCurry,spicinessCurry), Grinder{
  override fun grind() {
    println("grind")
  }
  override fun prepareSpice() {
    grind()
    println("finish")
  }
}

private interface Grinder {
  fun grind()
}