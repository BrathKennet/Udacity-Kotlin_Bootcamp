package _6_Functional_Manipulation

/*
* Inlines
* */

fun main (args: Array<String>) {
  fishExample()
}

private data class Fish2 (var name: String)

private fun fishExample() {
  val fish = Fish2("splashy")

  // without inline an object is created every call to myWith
  /*myWith(fish.name) {
    println(capitalize())
  }*/
  myWith(fish.name, object : Function1<String, Unit>{
    override fun invoke(name: String) {
      name.capitalize()
    }
  })

  // with inline no object is created, and lambda body is inlined here
  fish.name.capitalize()

}

private inline fun myWith (name: String, block: String.() -> Unit) {
  name.block()
}