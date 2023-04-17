package _2_Kotlin_Basics

import kotlin.math.pow

/*
* Quiz Arrays and Loops
* */

/*
* Read the code below, and then select the correct array
* initialization that will display the corresponding output.
* */

fun main(args: Array<String>) {
  val array = Array(7) { 1000.0.pow(it) }
  val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
    "terabyte", "petabyte", "exabyte")
  for ((i, value) in array.withIndex()) {
    println("1 ${sizes[i]} = ${value.toLong()} bytes")
  }
}