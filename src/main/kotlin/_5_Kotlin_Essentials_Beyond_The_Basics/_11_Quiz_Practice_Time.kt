package _5_Kotlin_Essentials_Beyond_The_Basics

/*
* Practice Time
* */

/*
* Using type hierarchies with generic classes follows a pretty basic pattern that we introduced in the
* previous segment. There was a lot of material introducing generics, but basically,
* when you are building them, it boils down to the following steps:
* Create a type/class hierarchy. The parent is non-specific and the subtypes/subclasses are specializations.
* There is at least one shared property between the classes/types, and it has a different value depending on
* the subtype (otherwise, having the subtypes is pointless).
* We then have a class that uses all the subtypes, and performs different actions depending on
* what the values of the subtype’s properties are.
*
* Let’s put this into practice using building materials and a building that needs certain
* amounts of those materials.
* Create a new package and file and call them Buildings.
* Create a class BaseBuildingMaterial with a property numberNeeded that is set to 1.
* You always need 1 of the base material.
* Create two subclasses, Wood and Brick. For BaseBuildingMaterial you need 4 units of wood or 8 units of brick.
* Now you have a type hierarchy.
* Create a generic class Building that can take any building material as its argument,
* and only building materials.
A building always requires 100 base materials. Add a property baseMaterialsNeeded and set it to 100.
* Add another property, actualMaterialsNeeded and use a one-line function to calculate this
* from numberNeeded of the passed-in material.
* Add a method build() that prints the type and number of materials needed.
* Hint: Use reflection to get the class and simple name: instance::class.simpleName
* Create a main function and make a building using Wood.
* If you did this correctly, running main() will print something like “400 Wood required”.
* */

private open class BaseBuildingMaterial(val numberNeeded: Int = 1)

private class Wood: BaseBuildingMaterial(4)

private class Brick: BaseBuildingMaterial(8)

private class Building<T: BaseBuildingMaterial>(val baseMaterialsNeeded: Int = 100, val actualMaterialsNeeded: T){
  fun build() {
    println("${baseMaterialsNeeded.times(actualMaterialsNeeded.numberNeeded)} ${actualMaterialsNeeded::class.simpleName} required")
  }
}

fun main (args: Array<String>) {
  val building = Building(actualMaterialsNeeded = Wood())
  building.build()
}