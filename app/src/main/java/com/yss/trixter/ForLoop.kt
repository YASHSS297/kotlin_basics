package com.yss.trixter

fun main(args: Array<String>) {

   /* for (number in 1..10)
    {
        println(number)
    }

    */
  /*  var sum:Int = 0
    for (x in 1..5)
    {
        println(x)
        sum +=x  // sum = sum + x
    }
    println("the sum of the numbers = $sum")

   */
  /*  var sum:Int = 0
    for (x in 1..10)
    {
        if (x % 2 == 0)
        {
            println(x)
            sum +=x
        }

    }
    println("the sum of the numbers = $sum")

   */

   /* var numarray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)

    for (y in numarray)
    {
        println(y)
    }

    */

   /* var numarray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)

    for (y in 0..numarray.size-1)
    {
        println("numarray[$y] = ${numarray[y]}")
    }

    */

 /*   var numarray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)

    for (y in numarray.indices)
    {
        println("numarray[$y] = ${numarray[y]}")
    }

  */

    //for each loop
    var numarray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    numarray.forEach { println(it) }


}