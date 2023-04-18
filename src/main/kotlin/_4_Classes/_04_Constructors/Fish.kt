package _4_Classes._04_Constructors

internal class Fish (val friendly: Boolean = true, volumeNeeded: Int) {
  val size: Int

  init {
    println("first init block")
  }

  constructor() : this(true, 9) {
    println("running secondary constructor")
  }

  init {
    size = if (friendly) {
      volumeNeeded
    } else {
      volumeNeeded * 2
    }
  }

  init {
    println("Construct fish of size $volumeNeeded final size ${this.size}")
  }

  init {
    println("last init block")
  }
}

internal fun makeDefault() = Fish(true, 50)

internal fun fishExample() {
  val fish = Fish(true, 20)
  println("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
  makeDefault()
  //val fishDefault = makeDefault()
}

fun main () {
  fishExample()
}