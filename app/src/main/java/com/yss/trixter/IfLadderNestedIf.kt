package com.yss.trixter

fun main(args: Array<String>) {


    print("please enter 3 numbers : ")
    var number1:Int = readLine()!!.toInt()
    var number2:Int = readLine()!!.toInt()
    var number3:Int = readLine()!!.toInt()

    var largestNumber:Int

    if (number1 >= number2)
    {
        if (number1 >= number3)
        {
            largestNumber = number1
        }
        else
        {
            largestNumber = number3
        }
    }
    else
    {
        if (number2 >= number3)
        {
            largestNumber = number2
        }
        else
        {
            largestNumber = number3
        }

    }
    println("$largestNumber is the largest number.")


    /*  print("Please enter your age :")

    var YourAge:Int = readLine()!!.toInt()

    if (YourAge <13)
    {
        print("you are a child.")
    }
    else if (YourAge <19)
    {
        print("you are a teenager.")
    }
    else
    {
        if (YourAge < 65)
        {
            print("You are an adult.")
        }
        else
        {
            print("You are senior.")
        }
    }

   */

}