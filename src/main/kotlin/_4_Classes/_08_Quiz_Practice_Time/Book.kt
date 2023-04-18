package _4_Classes._08_Quiz_Practice_Time

internal open class Book (val title: String, val author: String) {
  internal var currentPage: Int = 0
  open fun readPage() {
    currentPage++
  }

  val getPage: Int
    get() {return currentPage}

}

internal class eBook (private val titleEBook: String, private val authorEBook: String, var format: String = "text") : Book(titleEBook, authorEBook) {

  override fun readPage() {
    currentPage += 250
  }

}
