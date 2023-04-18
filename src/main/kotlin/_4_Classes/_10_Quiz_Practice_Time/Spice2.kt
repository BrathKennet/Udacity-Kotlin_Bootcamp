package _4_Classes._10_Quiz_Practice_Time

/*
* Practice Time
* */

/*
* Delegation
* Using the provided code from the lesson for guidance, add a yellow color to Curry
* Create an interface, SpiceColor, that has a color property. You can use a String for the color.
* Create a singleton subclass, YellowSpiceColor, using the object keyword,
* because all instances of Curry and other spices can use the same YellowSpiceColor instance.
* Add a color property to Curry of type SpiceColor, and set the default value to YellowSpiceColor.
* Add SpiceColor as an interface, and let it be by color.
* Create an instance of Curry, and print its color.
* However, color is actually a property common to all spices, so you can move it to the parent class.
* Change your code so that the SpiceColor interface is added to the Spice class and inherited by Curry.
* */

fun main () {
  delegate()
}

private fun delegate() {
  val curry = NewCurry("curry", "supreme")
  println(curry.heat)
  curry.prepareSpice()
}

private abstract class NewSpice (var name: String, var spiciness: String = "mild", color: SpiceColor) {

  val heat: Int
    get() {return when(spiciness) {
      "mild" -> 5
      "supreme" -> 10
      else -> 0
    }}

  abstract fun prepareSpice()

}

private interface SpiceColor {
  val color: String
}

private interface NewGrinder {
  fun grind()
}

private object YellowSpiceColor: SpiceColor {
  override val color = "yellow"
}

private class NewCurry (name: String, spiciness: String, color: SpiceColor = YellowSpiceColor): NewSpice(name, spiciness, color), NewGrinder {
  override fun grind() {
    println("grind")
  }
  override fun prepareSpice() {
    grind()
    println("finish")
  }
}