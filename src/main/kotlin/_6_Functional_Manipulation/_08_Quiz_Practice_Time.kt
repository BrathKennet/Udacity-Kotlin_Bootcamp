package _6_Functional_Manipulation

/*
* Practice Time
* */

/*
* In this practice, you will finish your simple game using higher-order functions, that is,
* a function that takes functions as an argument.
* In the game class, create a function move() that takes an argument called where,
* which is a lambda with no arguments that returns Unit.
* Hint: Declaring a function that takes a lambda as its argument:
* fun move(where: () -> Boolean )
* Inside move(), invoke the passed-in lambda.
* In the Game class, create a function makeMove() that takes a nullable String argument and returns nothing.
* Inside makeMove, test whether the String is any of the 4 directions and invoke move() with the corresponding lambda.
*  Otherwise, invoke move() with end.
* Hint: You can call the function like this:
* move(north)
* In main() add a while loop that is always true.
* Inside the loop, print instructions to the player:
* print("Enter a direction: n/s/e/w:")
* Call makeMove() with the contents of the input from the user via readLine()
* Remove the code for testing the first version of your game.
* Run your program.
*
* Challenge:
* Create a simple “map” for your game, and when the user moves, show a description of their location.
* Consider the following:
* Use a Location class that takes a default width and height to track location. 4x4 is pretty manageable.
* You can create a matrix like this:
* val map = Array(width) { arrayOfNulls<String>(height) }
* Use an init block to initialize your map with descriptions for each location.
* When you move() also updateLocation(). There is some math involved to prevent null-pointer exceptions
* and keep the user from walking off the map. rem() and absoluteValue come handy.
* When you are done, zip up the code and send it to a friend to try your first Kotlin game.
* */

fun main(args: Array<String>){
  val game = GameN()

  while (true) {
    print("Enter a direction: n/s/e/w: ")
    val direction = readLine()
    if (direction == "close") break
    game.makeMove(direction)
    println(game.map.getLocation())
    println(game.map.currentLocation.asList())
  }

}

private enum class DirectionsN {
  NORTH, SOUTH, EAST, WEST, START, END
}

private class GameN () {

  var path: MutableList<DirectionsN> = mutableListOf(DirectionsN.START)
  val map = Location()

  val north = { path.add(DirectionsN.NORTH) }

  val south = { path.add(DirectionsN.SOUTH) }

  val east = { path.add(DirectionsN.EAST) }

  val west = { path.add(DirectionsN.WEST) }

  val end = {
    path.add(DirectionsN.END)
    print("Game Over: ")
    println(path)
    path.clear()
    false
  }

  fun move(where: () -> Boolean) {
    where.invoke()
  }

  fun makeMove( string: String? ) {
    when (string) {
      "n" -> {
        move(north)
        map.updateLocation(DirectionsN.NORTH)
      }
      "s" -> {
        move(south)
        map.updateLocation(DirectionsN.SOUTH)
      }
      "e" -> {
        move(east)
        map.updateLocation(DirectionsN.EAST)
      }
      "w" -> {
        move(west)
        map.updateLocation(DirectionsN.WEST)
      }
      else -> {
        move(end)
        map.updateLocation(DirectionsN.END)
      }
    }
  }
}

private class Location (val width: Int = 4, val height: Int = 4) {
  val map = Array(width) { arrayOfNulls<String>(height) }

  init {
    map[0][0] = "Start Point. [n / e]"
    map[0][1] = "Gateway to Level 1. [ n / s / e ]"
    map[0][2] = "Path to Treasure. [ n / s / e ]"
    map[0][3] = "Level 1 Boss Fight. [ s / e ]"

    map[1][0] = "Forest Entrance. [ n / e /w ]"
    map[1][1] = "Path through the Forest. [ n / s / e / w ]"
    map[1][2] = "Mysterious Lake. [ n / s / e /w ]"
    map[1][3] = "Cave Entrance. [ w / s / e ]"

    map[2][0] = "Mountain Base Camp. [ n / e / w ]"
    map[2][1] = "Steep Climb. [ n / s / e  /w ]"
    map[2][2] = "Rocky Terrain. [ n / s / e / w ]"
    map[2][3] = "Abandoned Mine. [ s / e / w ]"

    map[3][0] = "Desert Oasis.[ n / e ]"
    map[3][1] = "Sandstorm Warning. [ n / s / w ]"
    map[3][2] = "Mirage. [ n / s / w ]"
    map[3][3] = "Final Battle Arena.[ s / w ] "
  }

  var currentLocation = arrayOf(0,0)

  fun updateLocation(direction: DirectionsN) {
    when (direction) {
      DirectionsN.NORTH -> if (currentLocation[1] < 3) currentLocation[1] += 1
      DirectionsN.SOUTH -> if (currentLocation[1] > 0) currentLocation[1] -= 1
      DirectionsN.EAST -> if (currentLocation[0] < 3) currentLocation[0] += 1
      DirectionsN.WEST -> if (currentLocation[0] > 0) currentLocation[0] -= 1
      DirectionsN.END -> currentLocation = arrayOf(0,0)
      else -> { }
    }
  }

  fun getLocation (): String? {
    return map[currentLocation[0]][currentLocation[1]]
  }

}

