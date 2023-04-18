package _3_Functions

/*
* Practice Time
* */

/*
* Create a program that suggests an activity based on various parameters.
* Start in a new file with a main function.
* From main(), create a function, whatShouldIDoToday().
* Let the function have three parameters.
* mood: a required string parameter
* weather: a string parameter that defaults to "sunny"
* temperature: an Integer parameter that defaults to 24 (Celsius).
* Use a when construct to return some activities based on combinations of conditions.
* */

fun main(args: Array<String>) {
  println(whatShouldIDoToday("sad"))
}

private fun whatShouldIDoToday(
  mood: String,
  weather: String = "Sunny",
  temperature: Int = 24
): String {
  return when {
    (mood == "happy" && weather == "Sunny") -> "go for a walk"
    else -> "Stay home and read."
  }
}