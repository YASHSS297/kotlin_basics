package com.yss.trixter

fun main(args: Array<String>) {

    print("Enter the number : ")
    var number: Int = readLine()!!.toInt()

    if (number % 2 == 0)
    {
        println("$number is an even")
    }
    else
    {
        println("$number is an odd")
    }


}