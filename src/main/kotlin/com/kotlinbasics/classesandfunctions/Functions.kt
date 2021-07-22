package com.kotlinbasics.classesandfunctions

import com.kotlinbasics.classesandfunctions.ProjectOwners.*

fun main() {
    println("Hello, I can execute functions without a class!!!")
    val numberOne : Int = 20  //imutable
    var numberTwo = 15 //val can assume other values
    numberTwo = 10
    val sum = sum(numberOne, numberTwo)
    println(
        """The sum is $numberOne + $numberTwo = $sum
        thats great!
        """
    )
    val calculator = Calculator()   //instantiate object
    val minus = calculator.minus(numberTwo = 5, numberOne = 1)
    println("I can execute minus operation too $numberOne - $numberTwo = $minus")

    //Calling a static function
    Calculator.A.staticFunction(nameOfOperator = "Marin")

    //Using Enums and throwing an exception
    val projectCredits = ProjectCredits()
    projectCredits.giveCreditsToAnOwner(PUTZEYS)
    try {
        projectCredits.giveCreditsToADev(PUTZEYS)
    } catch (e: Exception) {
        println("ooops, i catch an exception and this is the message ${e.message}")
    }

    //Lets try a data class
    val order = Order("Minecraft", value = 110, 1)
    println("""
        This is the order
            Product = ${order.objectName}
            Value = ${order.value}
            Quantity = ${order.quantity}
            Thanks!!
    """)
}

fun sum(numberOne: Int, numberTwo: Int): Int {
    return numberOne + numberTwo

}

const val CONSTANT = "HELLOWORLD"