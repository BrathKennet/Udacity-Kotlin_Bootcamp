package _4_Classes._09_Interfaces

internal abstract class AquariumFish {
  abstract val color: String
}

internal class Shark: AquariumFish(), FishAction{
  override val color = "gray"

  override fun eat() {
    println("hunt and eat fish")
  }
}

internal class Plecostomus: AquariumFish(), FishAction{
  override val color = "gold"

  override fun eat() {
    println("munch on algae")
  }
}

internal interface FishAction {
   fun eat()
}
