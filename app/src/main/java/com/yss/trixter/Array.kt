package com.yss.trixter

fun main(args: Array<String>) {

    var age = arrayOf(24,14,8)

    println("first element of array = " + age[0])
    println("second element of array = " + age.get(1))
    println("third element of array = " + age[2])

    println("-------------------------------------------------------")

    var cars = arrayOf("mercedes","BMW","mazda")
    println("first element of array = " + cars[0])
    println("second element of array = " + cars.get(1))
    println("third element of array = " + cars[2])

    cars.set(2,"ford")
    println("-------------------------------------------------------")
    println("first element of array = " + cars[0])
    println("second element of array = " + cars.get(1))
    println("third element of array = " + cars[2])

    println("size of the cars is = " + cars.size)

    var carsandage  = arrayOf("BMW",10,"ford",20)
    println("-------------------------------------------------------")
    println("first element of array = " + carsandage[0])
    println("second element of array = " + carsandage.get(1))
    println("third element of array = " + carsandage[2])
    println("fourth element of array = " + carsandage[3])

}