package com.kotlinbasics.extensionfunctions

fun main() {
    println("Matheus".sayHello())
    println(300.sum100())
}

fun String.sayHello(): String {
    return "Hello $this"
}

fun Int.sum100() : Int {
    return this + 100
}