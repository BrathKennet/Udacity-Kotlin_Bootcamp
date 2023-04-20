package _5_Kotlin_Essentials_Beyond_The_Basics

/*
* Practice Time
* */

/*
* Create a top-level constant for the maximum number of books a person could borrow.
* Inside the Book class, create a method canBorrow() that returns true or false
* depending on whether a user has already borrowed the max number of books.
* Create a Constants object that provides constants to the book.
* For this example, provide the BASE_URL for all books in the library catalog.
* Inside Book, add a method printUrl that creates and
* prints a URL composed of BASE_URL, the book title, and “.html”.
* The base URL is really of interest to the Book class.
* As such, it makes sense to limit its scope to the Book class.
* Use a companion object to define the constant in Book.
* */

const val maxBook = 5

private class Book2 (var title: String, var totalBorrow: Int = 0) {

  fun updateBorrow () {
    totalBorrow += 1
  }

  fun canBorrow(): Boolean {
    return (totalBorrow <= maxBook)
  }

  fun printUrl() {
    println("${BASE_URL}${title}.html")
  }

  companion object {
    const val BASE_URL = "https:://books.org/"
  }
}

fun main(args: Array<String>){
  val myBook = Book2("Hamlet", 5)
  println(myBook.canBorrow())
  myBook.updateBorrow()
  println(myBook.canBorrow())
  myBook.printUrl()
}


