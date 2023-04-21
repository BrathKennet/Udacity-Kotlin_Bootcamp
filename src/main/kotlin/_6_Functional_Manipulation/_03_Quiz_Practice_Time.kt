package _6_Functional_Manipulation

/*
* Practice Time
* */

/*
* In this practice, you are going to write the first part of a higher-order functions game.
* You will implement everything, except the higher-order functions. Let’s get started.
* Create a new file.
* Create an enum class, Directions, that has the directions NORTH, SOUTH, EAST and WEST, as well as START, and END.}
* Create a class Game.
* Inside Game, declare a var, path, that is a mutable list of Direction. Initialize it with one element, START.
* Create 4 lambdas, north, south, east, and west, that add the respective direction to the path.
* Add another lambda, end, that:
* Adds END to path
* Prints “Game Over”
* Prints the path
* Clears the path
* Returns false
* Create a main function.
* Inside main(), create an instance of Game.
* To test your code so far, in main() print the path,
* then invoke north, east, south, west, and end. Finally, print the path again.
* */

fun main(args: Array<String>){
  val game = Game()
  println(game.path)
  game.north()
  game.south()
  game.east()
  game.west()
  game.end()
}


private enum class Directions {
  NORTH, SOUTH, EAST, WEST, START, END
}

private class Game () {
  var path: MutableList<Directions> = mutableListOf(Directions.START)

  val north = { path.add(Directions.NORTH) }

  val south = { path.add(Directions.SOUTH) }

  val east = { path.add(Directions.EAST) }

  val west = { path.add(Directions.WEST) }

  val end = {
    path.add(Directions.END)
    print("Game Over: ")
    println(path)
    path.clear()
    println(path)
    false
  }
}