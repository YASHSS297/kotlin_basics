package com.yss.trixter

fun main(args: Array<String>) {

    print(" whata is your name? ")
    var name:String? = readLine()

    print(" what is your age? ")
    var age:Int = readLine()!!.toInt()

    println("My name is $name and my age is " + age)

}