package _5_Kotlin_Essentials_Beyond_The_Basics

/*
* Labeled Breaks
* */

fun main(args: Array<String>) {
  labels()
}

fun labels() {

  loop@ for (i in 1..100){
    for (j in 1..100){
      if (i > 10) break@loop
    }
  }

}