package _4_Classes._08_Quiz_Practice_Time

/*
* Practice Time
* */

/*
* Let's talk about books for a moment, those heavy tomes of paper with printed letters.
* Create a class, Book, with a title and an author.
* Add a method, readPage(), that increases the value of a private variable, currentPage, by 1.
* Create a subclass of Book; name it eBook.
* eBook also takes in a format, which defaults to "text".
* In eBooks, counting words makes more sense than pages. Override the readPage() method to increase
* the word count by 250, the average number of words per page from typewriter days.
* */

fun main (args: Array<String>) {
  val book = Book("none2", "none")
  book.readPage()
  book.readPage()
  println(book.getPage)

  val ebook = eBook("none2", "none")
  ebook.readPage()
  println(ebook.getPage)

}