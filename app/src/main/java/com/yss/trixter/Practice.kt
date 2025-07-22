package com.yss.trixter

import java.sql.SQLOutput
import kotlin.random.Random

fun main(args: Array<String>) {
/*
    var sum:Int = 0
    for (x in 1..20)
    {
        if (x % 2 != 0)
        {
            println("odd numbers are : " + x)
            sum +=x
        }

    }
    println("sum of the numbers are : $sum")

 */

    var number = Random.nextInt(0,50)
    println("please enter the number :")

    while (2 > 1)
    {
       var userguess:Int = readLine()!!.toInt()
       if (userguess == number)
       {
           println("Congratulations you guessed it correct.")
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