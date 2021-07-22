package com.kotlinbasics.extensionfunctions

fun main() {
    print("Matheus".sayHello())
}

fun String.sayHello(): String {
    return "Hello $this"
}