package _2_Kotlin_Basics

import kotlin.math.pow

/*
* Practice Time
* */

/*
* Quiz Question
* Which of these options are good reasons to explicitly make a list immutable?
* There may be more than 1 correct answer.
* - It reduces errors in general. ✔
* - Prevents accidental changing of objects that were meant to be unchangeable. ✔
* - You cannot create mutable lists in Kotlin. ✕
* - Immutable lists can hold more items than mutable lists. ✕
* - In a multithreaded environment, makes the variable thread safe,
*   because once it has been assigned by the initial thread, no thread can change it. ✔
* */

/*
* Looping over arrays and lists is a fundamental technique that has a lot of flexibility in Kotlin. Let's practice.
* Basic example
* Create an integer array of numbers called numbers, from 11 to 15.
* Create an empty mutable list for Strings.
* Write a for loop that loops over the array and adds the string representation of each number to the list.
* Challenge example
* How can you use a for loop to create (a list of) the numbers between 0 and 100 that are divisible by 7?
* */

fun main(args: Array<String>) {
  println("\nBasic Example")
  val number = arrayOf(11, 12, 13, 14, 15)
  val strings = mutableListOf<String>()
  for (element in number) strings.add(element.toString())
  println(strings)

  println("\nChallenge Example")
  val divisible = mutableListOf<String>()
  for (i in 0..100 step 7) divisible.add(i.toString())
  println(divisible)

}