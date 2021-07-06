package com.kotlinbasics.poo

import com.kotlinbasics.poo.BirdSize.*

open class Bird(val name: String, val weight: Int, val size: BirdSize) {

    open fun sing() {
        println("the bird $name is singing!!")
    }

    fun fly() {
        when(size) {
            small -> println("the bird is flywing too high!")
            normal -> println("the bird is flywing normal!")
            big -> println("the bird is too big to fly!")
        }
    }

}