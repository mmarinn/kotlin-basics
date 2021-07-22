package com.kotlinbasics.extensionfunctions

fun main() {
    print("Matheus")
}

fun String.sayHello(): String {
    return "Hello $this"
}