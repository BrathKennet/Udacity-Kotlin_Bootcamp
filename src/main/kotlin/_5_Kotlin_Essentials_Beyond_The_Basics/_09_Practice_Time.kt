package _5_Kotlin_Essentials_Beyond_The_Basics

/*
* Practice Time
* */

/*
* Practice Time
* It can be useful to know the weight of a book, for example, for shipping.
* The weight of a book can change because sometimes pages get torn, and the page count changes.
* While calculating the weight could be defined as a method, it’s more like a helper function.
* Besides, it would hurt a book's feelings to have a method that tears up its pages.
* Add a mutable property pages to Book.
* Create an extension function on Book that returns the weight of a book as the page count multiplied by 1.5 grams.
* Create another extension, tornPages(), that takes the number of torn pages as an argument
* and changes the page count of the book.
* Write a class Puppy with a method playWithBook() that takes a book as an argument,
* and removes a random number of pages from the book.
* Create a puppy and give it a book to play with, until there are no more pages.
* Note: If you don’t want to give your puppy a book, then create a puzzle toy class and fill it with treats.
* */

open class Book3 (val title: String, val author: String, val year: String, var pages: Int)

fun Book3.height() = pages * 1.5

fun Book3.tornPages(torn: Int) = if (pages >= torn) pages -= torn else pages = 0

class Puppy() {
  fun playWithBook(book: Book3) {
    book.tornPages((1..20).random())
  }
}

fun main(args: Array<String>) {
  val myPuppy = Puppy()
  val book = Book3("Oliver Twist", "Charles Dickens", "1837", 540)

  println(book.pages)
  println(book.height())

  myPuppy.playWithBook(book)

  println(book.pages)
  println(book.height())
}