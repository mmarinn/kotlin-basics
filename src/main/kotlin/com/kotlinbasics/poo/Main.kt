package com.kotlinbasics.poo

import com.kotlinbasics.poo.BirdSize.big
import com.kotlinbasics.poo.BirdSize.small

fun main() {
    val mediumSizeBird = Bird("rex", 1, small)
    val giantCockatiel = Cockatiel("maluco", 2, big, "white")
    val list = mutableListOf<Bird>(mediumSizeBird) //we can create mutable and imutable list's in kotlin
    list.add(mediumSizeBird)
    list.add(giantCockatiel)

    println("first loop!")
    for (bird in list) {
        if(bird is Cockatiel) {
            break
        }
        makeBirdSing(bird)
    }
    println("second loop!")
    list.forEach {
        makeBirdSing(it)
    }
    println("the size of the list is ${list.size} ")

}

fun makeBirdSing(bird: Bird) {
    bird.sing()
}