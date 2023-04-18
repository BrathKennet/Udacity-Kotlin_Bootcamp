package _3_Functions

/*
* Fit More Fish
* */

fun main(args: Array<String>) {
  //println("Hello ${args[0]}")
  fitMoreFish(10.0, listOf(3,3,3))
  fitMoreFish(8.0, listOf(2,2,2), hasDecorations = false)
  fitMoreFish(9.0, listOf(1,1,3), 3)
  fitMoreFish(10.0, listOf(), 7, true)
}

fun fitMoreFish (
  tankSize: Double,
  currentFish: List<Int>,
  fishSize: Int = 2,
  hasDecorations: Boolean = true
) {
  if (hasDecorations) {
    val longTotalAccepted = 0.8 * tankSize
    val longTotalFish = currentFish.sum() + fishSize
    println(longTotalFish <= longTotalAccepted)
  } else {
    val longTotalFish = currentFish.sum() + fishSize
    println(longTotalFish <= tankSize)
  }

  //println((tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize))
}