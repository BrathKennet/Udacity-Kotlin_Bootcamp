package _4_Classes._14_Quiz_Practice_Time

/*
* Practice Time
* */

/*
* You used object in the previous lesson and quiz.
* And now that you know about enums, here's the code for Color as an enum:
* In SpiceColor, change the type of color from String to the Color class,
* and set the appropriate color in YellowSpiceColor.
* Hint: The color code for yellow is YELLOW(0xFFFF00)
* Make Spice a sealed class.
* What is the effect of doing this?
* Why is this useful?
* */

fun main() {
  delegate()
}

private fun delegate() {
  val curry = NewCurry("curry", "supreme")
  println(curry.heat)
  curry.prepareSpice()
  curry.printColor()
}

private sealed class NewSpice(var name: String, var spiciness: String = "mild", color: SpiceColor) {

  val heat: Int
    get() {
      return when (spiciness) {
        "mild" -> 5
        "supreme" -> 10
        else -> 0
      }
    }

  abstract fun prepareSpice()

}

enum class Color(val rgb: Int) {
  RED(0xFF0000),
  GREEN(0x00FF00),
  BLUE(0x0000FF),
  YELLOW(0xFFFF00);
}

private interface SpiceColor {
  val color: Color
}

private interface NewGrinder {
  fun grind()
}

private object YellowSpiceColor : SpiceColor {
  override val color = Color.YELLOW
}

private class NewCurry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) :
  NewSpice(name, spiciness, color), NewGrinder {

  val color2 = color

  fun printColor(){
    println(color2)
  }

  override fun grind() {
    println("grind")
  }

  override fun prepareSpice() {
    grind()
    println("finish")
  }
}