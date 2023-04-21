package _6_Functional_Manipulation

/*
* Higher-Order Functions
* */

fun main (args: Array<String>) {
  fishExample()
}

private data class Fish (var name: String)

private fun fishExample() {
  val fish = Fish("splashy")

  myWith(fish.name) {
    println(capitalize())
  }

  println(fish.run { name })

  println(fish.apply {  })

  val fish2 = Fish(name = "splashy").apply { name = "Sharky" }
  println(fish2)

  println(fish.let { it.name.capitalize() }
    .let { it + "fish" }
    .let { it.length }
    .let { it + 31 })

}

private fun myWith (name: String, block: String.() -> Unit) {
  name.block()
}