package _5_Kotlin_Essentials_Beyond_The_Basics

/*
* Collections
* */

fun main(args: Array<String>) {
  testList()
  println("===========================")
  symptoms()
  println("===========================")
  cures()
}

private fun testList() {
  val testList = listOf(11,12,13,14,15,16,17,18,19,20)
  println(reverseList(testList))
  println(reverseListAgain(testList))
  println(testList.reversed())
}

private fun reverseList (list: List<Int>): List<Int> {
  val result = mutableListOf<Int>()
  for (i in 0..list.size-1) {
    result.add(list[list.size-i-1])
  }
  return result
}

private fun reverseListAgain (list: List<Int>): List<Int> {
  val result = mutableListOf<Int>()
  for (i in list.size - 1 downTo 0) {
    result.add(list[i])
  }
  return result
}

private fun symptoms () {
  val symptoms = mutableListOf("white spots", "red spots", "not spots", "not eating", "bloated", "belly up")
  symptoms.add("white fungus")
  symptoms.remove("white fungus")

  println(symptoms.contains("red"))
  println(symptoms.contains("red spots"))

  println(symptoms.subList(4, symptoms.size))

  println(listOf(1, 5, 3).sum())

  println(listOf("a", "b", "cc").sumOf { it.length })
}

private fun cures() {
  val cures = mapOf("white spots" to "Ich", "red sores" to "hole disease")
  println(cures.get("white spots"))
  println(cures["white spots"])

  println(cures.getOrDefault("bloating", "sorry I don't know"))

  println(cures.getOrElse("bloating") {"No cure for this"})

  val inventory = mutableMapOf("fish net" to 1)
  inventory.put("tank scrubber", 3)
  inventory.remove("fish net")

  println(inventory)
}

