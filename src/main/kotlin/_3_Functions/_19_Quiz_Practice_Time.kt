package _3_Functions
import java.lang.Math.random
import kotlin.random.Random

/*
* Practice Time
* */

/*
* Practice Time: Lambdas
* Create a lambda and assign it to rollDice, which returns a dice roll (number between 1 and 12).
* Extend the lambda to take an argument indicating the number of sides of the dice used for the roll.
* If you haven't done so, fix the lambda to return 0 if the number of sides passed in is 0.
* Create a new variable, rollDice2, for this same lambda using the function type notation.
* */

fun main(args: Array<String>) {
  val random1 = random()
  val random2 = { random() }
  println(random1)
  println(random2())

  println(rollDice(5))
  println(rollDice2(9))
  gamePlay(rollDice2(4))
}

val rollDice = { sides: Int ->
  if (sides == 0) 0
  else Random.nextInt(sides) + 1
}

val rollDice2: (Int) -> Int = { sides ->
  if (sides == 0) 0
  else Random.nextInt(sides) + 1
}

private fun gamePlay(diceRoll: Int){
  println(diceRoll)
}