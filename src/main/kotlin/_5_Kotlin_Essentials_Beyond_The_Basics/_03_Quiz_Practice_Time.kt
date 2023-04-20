package _5_Kotlin_Essentials_Beyond_The_Basics

/*
* Practice Time
* */

/*
* Let's go through an example of getting information about a book in the format of a Pair.
* Generally, you want information about both the title and the author, and perhaps also the year.
* Let’s create a basic book class, with a title, author, and year.
* Of course, you could get each of the properties separately.
* Create a method that returns both the title and the author as a Pair.
* Create a method that returns the title, author and year as a Triple.
* Use the documentation to find out how to use Triple.
* Create a book instance.
* Print out the information about the book in a sentence, such as: “Here is your book X written by Y in Z.”
* */

fun main(args: Array<String>) {
  val myBook = Book("None", "Unknown", "2019")
  val (title, author, year) = myBook.getTitleAuthorYear()

  println("Here is your book $title written by $author in $year")
}

private class Book(val title: String, val author: String, val year: String) {

   fun getTitleAuthor() : Pair<String, String> {
    return Pair(title, author)
  }

  fun getTitleAuthorYear() : Triple<String, String, String> {
    return Triple(title, author, year)
  }
}