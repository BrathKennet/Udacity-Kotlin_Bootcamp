package _5_Kotlin_Essentials_Beyond_The_Basics

import _4_Classes._07_Inheritance.Aquarium

/*
* Generic Function
* */

fun main (args: Array<String>) {
  genericExample()
}

private open class WaterSupply3(var needsProcessed: Boolean)

private class TapWater3 : WaterSupply3(true) {
  fun addChemicalCleaners() = apply { needsProcessed = false }
}

private class FishStoreWater3 : WaterSupply3(false)

private class LakeWater3 : WaterSupply3(true){
  fun filter() = apply { needsProcessed = false }
}

private class Aquarium3<out T: WaterSupply3>(val waterSupply: T) {
  fun addWater() {
    check (!waterSupply.needsProcessed) { "water supply needs processed" }
    println("adding water from $waterSupply")
  }
}

private inline fun <reified R: WaterSupply3> Aquarium3<*>.hasWaterSupplyOfType() = waterSupply is R

private fun <T: WaterSupply3> isWaterClean(aquarium: Aquarium3<T>) {
  println("aquarium water is clean: ${aquarium.waterSupply.needsProcessed}")
}

private inline fun <reified T: WaterSupply3> WaterSupply3.isOfType() = this is T

private fun genericExample() {
  val aquarium = Aquarium3(TapWater3())

  println(aquarium.hasWaterSupplyOfType<TapWater3>())
  println(aquarium.waterSupply.isOfType<LakeWater3>())
}