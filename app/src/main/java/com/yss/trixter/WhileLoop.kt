package com.yss.trixter

import kotlin.random.Random

fun main(args: Array<String>) {

  /*  var i = 5
    while (i > 0)
    {
        println(i)
        i--
    }

   */

    // code for factorial of number 3-> 3*2*1
   /* var k = 1
    var fact = 1
    while (k < 6)
    {
       fact *= k   // fact = fact * k
        println("$k! = $fact")
        k++
    }

    */

    // Infinite loop
    val number = Random.nextInt(0,100)
    println("Please enter the number : ")

    while (2 > 1)
    {
        val userguess:Int = readLine()!!.toInt()
        if (userguess == number)
        {
            println("congratulation you guessed it correct.")
            break
        }
        else if (userguess < number)
        {
            println("increase your guess.")
        }
        else
        {
            println("decrease your guess.")
        }
    }
}