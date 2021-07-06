package com.kotlinbasics.poo

class Cockatiel(name : String, weight : Int, size: BirdSize, val color : String) : Bird(name, weight, size), Animalia {

    override fun sing() {
        println("the cockatiel is singing")
    }

    fun describe() {
        print("""
            name is $name,
            weight is $weight,
            bitd size is $size,
            and the color is $color
        """.trimIndent())
    }

    override fun bar() {
        print("bar implemented!")
    }

}