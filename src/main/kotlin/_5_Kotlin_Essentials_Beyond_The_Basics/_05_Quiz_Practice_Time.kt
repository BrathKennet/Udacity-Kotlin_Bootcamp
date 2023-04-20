package _5_Kotlin_Essentials_Beyond_The_Basics

/*
* Practice Time
* */

/*
* One book is rarely alone, and one author rarely writes just one book.
* Create a Set of book titles called allBooks, for example, by William Shakespeare.
* Create a Map called library that associates the set of books, allBooks, to the author.
* Use the collections function any() on library to see if any of the books are “Hamlet’
* Create a MutableMap called moreBooks, and add one title/author to it.
* Use getOrPut() to see whether a title is in the map, and if the title is not in the map, add it.
* */

fun main(args: Array<String>){
  val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
  val library = mapOf("Shakespeare" to allBooks)
  println(library)
  println(library.any { it.value.contains("Hamlet") })
}