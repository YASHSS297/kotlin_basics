package com.yss.trixter

fun main(args: Array<String>) {

    var age = ArrayList<Int>()
    age.add(10)
    age.add(1,15)
    age.add(20)

  /*  println("the first element of ArrayList is = " + age[0])
    println("the second element of ArrayList is = " + age[1])
    println("the third element of ArrayList is =  ${age[2]}")

   */

    age.remove(15)
    println(age.size)
    //println("the first element of ArrayList is = " + age[0])
    //println("the second element of ArrayList is = " + age[1])

    var cars  = arrayListOf<String>("BMW","Mazda")

    cars.add("Ford")
    println("the first element of ArrayList is = " + cars[0])
    println("the second element of ArrayList is = " + cars[1])
    println("the third element of ArrayList is =  ${cars[2]}")

    var MyMixArrayList = ArrayList<Any>()
    MyMixArrayList.add("ford")
    MyMixArrayList.add(5)
    MyMixArrayList.add(3.2)
    MyMixArrayList.add(false)
    MyMixArrayList.add('Y')

    println(MyMixArrayList[0])
    println(MyMixArrayList[1])
    println(MyMixArrayList[2])
    println(MyMixArrayList[3])
    println(MyMixArrayList[4])
}