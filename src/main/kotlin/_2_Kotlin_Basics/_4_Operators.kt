package _2_Kotlin_Basics

/*
* Operators - Quiz Question
* */

/*
* Quiz Question
* Select all of the statements below written with correct syntax.
* There may be more than one correct answer. Try them in REPL.
* val address: String = null
* val amount : Double? = 10.0
* var list: List<String?>? = listOf(null, null)
* list?.size
* */

fun main(args: Array<String>) {

  //val address: String = null
  val address: String? = null
  val amount : Double? = 10.0
  var list: List<String?>? = listOf(null, null)
  list?.size

}