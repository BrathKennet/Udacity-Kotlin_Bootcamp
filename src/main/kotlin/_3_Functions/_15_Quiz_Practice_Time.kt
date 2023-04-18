package _3_Functions

/*
* Practice Time
* */

/*
* Improve your whatShouldIDoToday() program with the new knowledge from this segment.
* Add 3 more situations and activities. For example:
* Create a single-expression function for each condition and then use it in your when expression.
* */

/*
* Challenge
* Instead of passing in the mood, get a mood string from the user.
* */

/*
* Loops
* This lesson introduced the while and repeat loops. To practice using them, do the following:
* Change your fortune cookie program to use repeat() instead of a for loop.
* What happens to the break instruction? Using the error message from the compiler, with what you've learned
* so far, can you think of why?
* Change your fortune cookie program to use a while loop,
* which is the better choice when you are looping until a condition is met.
* */

fun main(args: Array<String>) {
  print("\nEnter your mood: ")
  val mood = readlnOrNull() ?: "sad"
  println(whatShouldIDoToday(mood))
}

private fun whatShouldIDoToday(
  mood: String,
  weather: String = "Sunny",
  temperature: Int = 24
): String {
  return when {
    goWalk(mood, weather) -> "go for a walk"
    goStayBed(mood, weather, temperature) -> "stay in bed"
    goSwim(temperature) -> "go swimming"
    else -> "Stay home and read."
  }
}

private fun goWalk (mood: String, weather: String) = mood == "happy" && weather == "Sunny"
private fun goStayBed (mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
private fun goSwim (temperature: Int) = temperature > 35

//Changes in 9_Quiz_Practice_Time

/*var a = 0
while (a < 10) {
  val fortune = getFortuneCookie()
  println("Your fortune is: $fortune")
  if (fortune.contains("Take it easy")) break
  a++
}*/

/*repeat ( 10) {
  val fortune = getFortuneCookie()
  println("Your fortune is: $fortune")
  if (fortune.contains("Take it easy")) return
}*/