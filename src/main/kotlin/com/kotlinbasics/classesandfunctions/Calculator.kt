package com.kotlinbasics.classesandfunctions

class Calculator {
    fun minus(numberOne: Int, numberTwo: Int): Int {
        return numberOne - numberTwo
    }

    //static objetcs of a class
    companion object A {
        fun staticFunction(nameOfOperator: String) {
            println("You called a static function, $nameOfOperator")
        }
    }

}