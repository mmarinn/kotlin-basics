package com.kotlinbasics.classesandfunctions

fun main() {
    val i = 4

    if (i in 1..4) {
        print(i)
    }
    println()
    println("first loop")
    for (j in 4 downTo 1) {
        print(j)
    }
    println()

    println("second loop")
    for (j in 1..8 step 2) print(j)
    println()

    println("third loop")
    for (j in 1 until 10) {       // i in [1, 10), 10 is excluded
        print(j)
    }

}