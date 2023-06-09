package _4_Classes._04_Constructors

internal class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40) {

  var volume: Int
    get() {return width * height * length / 1000}
    set(value) {height = (value * 1000) / (width * length)}

  var water = volume * 0.9

  constructor(numberOfFish: Int): this() {
    val water: Int = numberOfFish * 2000
    val tank: Double = water * water * 0.1
    height = (tank / (length * width)).toInt()
  }

}