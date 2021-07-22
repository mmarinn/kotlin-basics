package com.kotlinbasics.nullable

/**
 *  Transform NPE into an error in compile time
 *  Inspired by java - optional lib
*/

fun main() {
    val nullValue : String? = null
    // no NPE
    print(nullValue?.length)

    // not-null assertion operator (!!) converts any value
    // to a non-null type and throws an exception if the value is null
    print(nullValue!!.length)

}

fun nullableVariable() {
    var notNull: String = "Hi!"

    var nullableAttempt: String = null  // compile time error

    var nullable: String? = null        // optional type must be used

    var inferredType = "Inferred type here is String, non null"
}

// test 1
fun testGetLength(): Boolean {
    val expectedResult = 6
    val length = retrieveLengthPlusThree(null)              // compile time error
    return expectedResult == length
}

// test 2
fun testGetLength2(anotherString: String?): Boolean {
    val expectedLength = 4
    val length = retrieveLengthPlusThree(anotherString)     // compile time error
    return expectedLength == length
}

// test 3
fun testGetLength3(testString: String?): Boolean {
    val expectedLength = 4

    return if (testString != null) {
        expectedLength == retrieveLengthPlusThree(testString)
    } else {
        false
    }
}

// example function
fun retrieveLengthPlusThree(string: String): Int {
    return string.length + 3
}