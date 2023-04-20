package _5_Kotlin_Essentials_Beyond_The_Basics

/*
* Pairs
* */

fun main(args: Array<String>) {
  pairs()
  pairs2()
  pairs3()
  pairs4()
}

private fun pairs() {
  val equipment = "fishnet" to "catching fish"
  println(equipment.first)
  println(equipment.second)
}

private fun pairs2() {
  val equipment = "fishnet" to "catching fish" to "of big size" to "and strong"
  println(equipment)
  println(equipment.first)
  println(equipment.first.first)
  println(equipment.first.first.first)

  val equip = ("fishnet" to "catching fish") to ("of big size" to "and strong")
  println(equip.first)
  println(equip.first.first)
}

private fun pairs3() {
  val fishnet = "fishnet" to "catching fish"
  val (tool, use) = fishnet
  println("The $tool is a tool for $use.")

  val fishnetString = fishnet.toString()
  println(fishnetString)

  println(fishnet.toList())
}

private fun pairs4 () {

  fun giveMeATool() : Pair<String, String> {
    return ("fishnet" to "catching")
  }

  val (tool, use) = giveMeATool()
  println(tool)
  println(use)
}
