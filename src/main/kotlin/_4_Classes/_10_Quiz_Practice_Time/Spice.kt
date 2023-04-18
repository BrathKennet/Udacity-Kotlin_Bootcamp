package _4_Classes._10_Quiz_Practice_Time

/*
* Practice Time
* */

/*
* Abstract and Interface
* Let's go back to your spices. Make Spice an abstract class,
* and then create some subclasses that are actual spices.
* It's easiest (organizationally) if you make a new package, Spices,
* with a file, Spice, that has a main() function.
* Copy/paste your Spice class code into that new file.
* Make Spice abstract.
* Create a subclass, Curry. Curry can have varying levels of spiciness, so we don't want to use the default value,
* but rather pass in the spiciness value.
* Spices are processed in different ways before they can be used.
* Add an abstract method prepareSpice to Spice, and implement it in Curry.
* Curry is ground into a powder, so let's call a method grind().
* However, grinding is something that's not unique to curry, or even to spices, and it's always done in a grinder.
* So we can create an Interface, Grinder, that implements the grind() method. Do that now.
* Then add the Grinder interface to the Curry class.
* */

private abstract class Spice (var name: String, var spiciness: String = "mild") {

  val heat: Int
    get() {return when(spiciness) {
      "mild" -> 5
      "supreme" -> 10
      else -> 0
    }}

  abstract fun prepareSpice()

}

private class Curry(var spicinessCurry: String): Spice("curry",spicinessCurry), Grinder{
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

fun main () {
  val curry = Curry("supreme")
  println(curry.heat)
  curry.prepareSpice()
}