package com.yss.trixter

fun main(args: Array<String>) {

    var x:Int = 5
    var y:Int = 8
    var z:Int = 12

    var result:Boolean = false

    // Conditional Operator(&&) it works like  AND operator.
    result = (x > y) && (y < z)
    println("result : " + result)

    // Conditional Operator(||) it works like OR operator.
    result = (x > y) || (y < z)
    println("result : " + result)
}