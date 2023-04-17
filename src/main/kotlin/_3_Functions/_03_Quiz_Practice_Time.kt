package _3_Functions

import java.util.*

/*
* Practice Time
* */

/*
* Basic Task
* Create a new Kotlin file.
* Copy and paste the main() function from Hello World into the file.
* Create a new function, dayOfWeek().
* In the body of the function, print "What day is it today?"
* Call dayOfWeek() from main().
* Run your program.
* */

/*
* Extended Task
* In the body of the dayOfWeek() function, answer the question by printing the current day of the week.
* Hints
* You can use Java libraries (java.util) from Kotlin. For example, to get the day of the week:
* Calendar.getInstance().get(Calendar.DAY_OF_WEE)
* Use a when statement to print a string depending on the day. Sunday is the first day of the week.
* */

fun main(args: Array<String>) {
  dayOfWeek()
}

private fun dayOfWeek() {
  println("What day is it today?")
  val day = when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
    1 -> "Sunday"
    2 -> "Monday"
    3 -> "Tuesday"
    4 -> "Wednesday"
    5 -> "Thursday"
    6 -> "Friday"
    7 -> "Saturday"
    else -> "Time has stopped"
  }
  println(day)
}