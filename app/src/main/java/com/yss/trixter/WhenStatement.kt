package com.yss.trixter

fun main(args: Array<String>) {

    print("Enter the number of week day :")

    var daynumber:Int = readLine()!!.toInt()
    var day:String

    when(daynumber)
    {
        1 -> day =  "Monday"
        2 -> day =  "tuesday"
        3 -> day =  "wednesday"
        4 -> day =  "thrusday"
        5 -> day =  "friday"
        6 -> day =  "saturday"
        7 -> day =  "sunday"
        else -> day =  "Invalid day choice."
    }
    println("this day is " + day)
}