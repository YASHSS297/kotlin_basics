package com.yss.trixter

fun main(args: Array<String>) {

    println("Please enter the first number: ")
    var number1:Int = readLine()!!.toInt()

    println("Please enter the second number: ")
    var number2:Int = readLine()!!.toInt()

    show(number1,number2)
    var a = add(number1,number2)
    println("sum of the two numbers are = $a")
    var b = findMinimumNumber(number1,number2)
    println("minimum number is $b")

}

fun show(num1:Int,num2:Int)
{
    println(" you entered $num1 and $num2")
}

fun add(num1:Int,num2: Int) : Int
{
    var sum:Int = 0
    sum = num1 + num2
    return sum
}

fun findMinimumNumber(num1: Int,num2: Int) : Int
{
    var minimum:Int
    if (num1 > num2)
    {
        minimum = num2
    }
    else
    {
        minimum = num1
    }
    return minimum
}