package _5_Kotlin_Essentials_Beyond_The_Basics

/*
* Generic In and Out
* */

fun main (args: Array<String>) {
  genericExample()
}

private open class WaterSupply2(var needsProcessed: Boolean)

private class TapWater2 : WaterSupply2(true) {
  fun addChemicalCleaners() {
    needsProcessed = false
  }
}

private class FishStoreWater2 : WaterSupply2(false)

private class LakeWater2 : WaterSupply2(true){
  fun filter() = apply { needsProcessed = false }
}

private class Aquarium2<out T: WaterSupply2>(val waterSupply: T) {
  fun addWater(cleaner: Cleaner<T>) {
    if (waterSupply.needsProcessed) {
      cleaner.clean(waterSupply)
    }
    println("adding water from $waterSupply")
  }
}

private interface Cleaner<in T: WaterSupply2> {
  fun clean(waterSupply2: T)
}

private class TapWaterCleaner: Cleaner<TapWater2> {
  override fun clean(waterSupply2: TapWater2) {
    waterSupply2.addChemicalCleaners()
  }
}


private fun genericExample() {
  val cleaner = TapWaterCleaner()
  val aquarium = Aquarium2(TapWater2())
  aquarium.addWater(cleaner)
}