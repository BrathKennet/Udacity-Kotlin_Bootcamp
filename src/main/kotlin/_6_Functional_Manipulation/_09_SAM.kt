package _6_Functional_Manipulation

/*
* SAM - Single Abstract Method / Kotlin
* */

// Interfaces
/*interface Runnable {
  fun run()
}

interface Callable<T> {
  fun call(): T
}*/


// Java
/*public class JavaRun {
  public static void runNow(Runnable runnable) {
    runnable.run()
  }
}*/


// Kotlin
fun example() {
  val runnable = object: Runnable {
    override fun run() {
      println("I'm a runnable")
    }
  }
  JavaRun.runNow(runnable)
}

// Lambda
fun example2() {
  JavaRun.runNow {
    println("Passing a lambda as a runnable")
  }
}