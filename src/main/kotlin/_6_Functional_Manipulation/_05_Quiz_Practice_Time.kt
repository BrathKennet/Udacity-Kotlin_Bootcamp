package _6_Functional_Manipulation

/*
* Practice Time
* */

/*
* Create an extension on List using a higher order function that returns all the numbers
* in the list that are divisible by 3. Start by creating an extension function on List that
* takes a lambda on Int and applies it to each item in the list. When the lambda returns zero, include the item in the output. For example, this list:
* */

fun main (args: Array<String>) {

  val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
  val listDivisible = numbers.divisibleBy3 { it.rem(3) }

  println(listDivisible)
}

private fun List<Int>.divisibleBy3(lambda: (Int) -> Int): List<Int> {
  val result = mutableListOf<Int>()

  for (item in this) {
    if (lambda(item) == 0) result.add(item)
  }

  return result
}


