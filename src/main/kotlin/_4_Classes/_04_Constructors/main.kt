package _4_Classes._04_Constructors

/*
* Constructors
* */

fun main (args: Array<String>) {
  buildAquarium()
}

private fun buildAquarium() {
  val myAquarium = Aquarium()

  println("Length: ${myAquarium.length} " +
          "Width: ${myAquarium.width} " +
          "Height: ${myAquarium.height} ")
  println("Volume: ${myAquarium.volume} liters")
  println("====================================")

  myAquarium.height = 80

  println("Height: ${myAquarium.height} cm")
  println("Volume: ${myAquarium.volume} liters")
  println("====================================")

  //val smallAquarium = Aquarium(20, 15, 30)
  val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
  println("Small Aquarium: ${smallAquarium.volume} liters")
  println("====================================")

  val myAquarium2 = Aquarium(numberOfFish = 9)
  println("Length: ${myAquarium2.length} " +
    "Width: ${myAquarium2.width} " +
    "Height: ${myAquarium2.height} ")
  println("Small Aquarium 2: ${myAquarium2.volume} liters")
  println("====================================")

}