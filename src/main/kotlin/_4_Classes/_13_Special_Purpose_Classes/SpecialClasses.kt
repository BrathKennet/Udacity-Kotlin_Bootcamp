package _4_Classes._13_Special_Purpose_Classes

/*
* Special Classes
* */

internal object MobyDickWhale {

  val author = "Herman Melville"

  fun jump() {
    // ...
  }
}


internal enum class Color(val rgb: Int) {
  RED(0xFF0000),
  GREEN(0X00FF00),
  BLUE(0X0000FF),
}

sealed class Seal

class SeaLion: Seal()
class Watrus: Seal()

private fun matchSeal(seal: Seal): String {
  return when (seal) {
    is Watrus -> "walrus"
    is SeaLion -> "sea lion"
  }
}