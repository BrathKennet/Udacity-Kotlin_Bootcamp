package _5_Kotlin_Essentials_Beyond_The_Basics

/*
* Practice Time
* */

/*
* Create a generic function for type BaseBuildingMaterial and call it isSmallBuilding,
* which takes a Building with a building material T as an argument.
* If the materials needed are less than 500, print "small building", otherwise, print "large building".
* Note: For this function, IntelliJ recommends not to inline the function.
* Generally, when you create a generic function, follow the IDE's recommendation about inlining.
* */

private open class BaseBuildingMaterial2(val numberNeeded: Int = 1)

private class Wood2: BaseBuildingMaterial2(4)

private class Brick2: BaseBuildingMaterial2(8)

private class Building2<out T: BaseBuildingMaterial2>(val baseMaterialsNeeded: Int = 100, val actualMaterialsNeeded: T){
  fun build() {
    println("${baseMaterialsNeeded.times(actualMaterialsNeeded.numberNeeded)} ${actualMaterialsNeeded::class.simpleName} required")
  }
}

private inline fun <reified T: BaseBuildingMaterial2> Building2<*>.isSmallBuilding() =
  if (baseMaterialsNeeded.times(actualMaterialsNeeded.numberNeeded) < 500)  println("Small Building")
  else println("Large Building")

fun main (args: Array<String>) {
  val building = Building2(actualMaterialsNeeded = Wood2())

  building.build()
  building.isSmallBuilding<Wood2>()
}