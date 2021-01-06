package com.kotlinbasics

class Calculator {
    fun minus(numberOne: Int, numberTwo: Int): Int {
        return numberOne - numberTwo
    }

    companion object {
        fun staticFunction(nameOfOperator: String) {
            println("You called a static function, $nameOfOperator")
        }
    }

}