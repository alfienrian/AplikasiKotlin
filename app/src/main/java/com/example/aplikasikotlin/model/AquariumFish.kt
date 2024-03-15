package com.example.aplikasikotlin.model

// Codelab 3 (step 6): Membuat abstract class dan interface
interface FishAction  {
    fun eat()
}

abstract class AquariumFish : FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}

class Shark: AquariumFish(), FishAction {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}



