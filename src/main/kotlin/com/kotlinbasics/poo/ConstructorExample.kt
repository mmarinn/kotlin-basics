package com.kotlinbasics.poo

fun main() {
    val user = User("Matheus", isAdmin = false)
    println("user name is ${user.name}")

    val userWithAge = User("Matheus", 40)
    println("user name is ${userWithAge.age}")

}

/**
 * The primary constructor is defined in the class header
 */
class User(var name: String, val isAdmin: Boolean) {
    var age: Int = 20

    constructor(name: String, age: Int) : this(name, isAdmin = false) {
        this.age = age
    }

    init {
        name = name + " @gmail.com"
        println("Author Name is $name. Is Admin? $isAdmin")
    }
}