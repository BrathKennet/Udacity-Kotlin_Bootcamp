package _4_Classes._02_Defining_Classes

/*
* Defining Classes
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

  myAquarium.height = 80

  println("Height: ${myAquarium.height} cm")

  println("Volume: ${myAquarium.volume} liters")

}