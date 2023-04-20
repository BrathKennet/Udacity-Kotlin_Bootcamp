package _5_Kotlin_Essentials_Beyond_The_Basics

/*
* Generic Classes
* */

fun main (args: Array<String>) {
  genericExample()
}

private open class WaterSupply(var needsProcessed: Boolean)

private class TapWater : WaterSupply(true) {
  fun addChemicalCleaners() {
    needsProcessed = false
  }
}

private class FishStoreWater : WaterSupply(false)

private class LakeWater : WaterSupply(true){
  fun filter() {
    needsProcessed = false
  }
}

private class Aquarium<T: WaterSupply>(val waterSupply: T) {
  fun addWater() {
    check(!waterSupply.needsProcessed) {"water supply needs processed"}

    println("adding water from $waterSupply")
  }
}

private fun genericExample() {
  val aquarium = Aquarium(TapWater())
  aquarium.waterSupply.addChemicalCleaners()

  val aquarium2 = Aquarium(LakeWater())
  aquarium2.waterSupply.filter()
  aquarium2.addWater()

}