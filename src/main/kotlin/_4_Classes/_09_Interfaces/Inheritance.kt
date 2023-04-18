package _4_Classes._09_Interfaces

/*interface AquariumAction {
  fun eat()
  fun jump()
  fun clean()
  fun catchFish()
  fun swim() {
    println("swim")
  }
}

private interface FishAction {
  fun eat()
}

abstract class AquariumFish: FishAction {
  abstract val color: String
  override fun eat() {
    println("yum")
  }
}*/

//=================================================================================

/*
fun main (args: Array<String>) {
  delegate()
}

private fun delegate() {
  val pleco = Plecostomus()
  println("Fish has color ${pleco.color}")
  pleco.eat()
}

private interface FishAction {
  fun eat()
}

private interface FishColor {
  val color: String
}

private class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("a lot of algae"),
    FishColor by RedColor

private object GoldColor: FishColor {
  override val color = "gold"
}

private object RedColor: FishColor {
  override val color = "red"
}

private class PrintingFishAction(val food: String): FishAction {
  override fun eat() {
    println(food)
  }
}*/
