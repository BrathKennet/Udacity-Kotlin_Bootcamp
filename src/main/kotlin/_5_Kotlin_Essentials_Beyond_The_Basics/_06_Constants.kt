package _5_Kotlin_Essentials_Beyond_The_Basics

/*
* Constants
* */

private const val rocks = 3

private val number = 5

private const val num = 5

private fun complexFunctionCall() {}

private val result = complexFunctionCall()

private const val CONSTANT = "top-level constant"

private object Constants {
  const val CONSTANT2 = "object constant"
}

private val foo = Constants.CONSTANT2

private class MyClass {
  companion object {
    const val CONSTANT3 = "constant inside companion"
  }
}