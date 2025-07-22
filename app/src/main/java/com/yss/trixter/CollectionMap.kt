package com.yss.trixter

fun main(args: Array<String>) {

    //Immutable type data, we cannot add new data late on

    println("--------------immutable map of-----------")
    var age = mapOf<String,Int>("david" to 22,"ronaldo" to 40)

    println("Age of David = " + age["david"])
    println("Age of Ronaldo = " + age["ronaldo"])

    // this is mutable by adding mutablemapof

    var mutableage = mutableMapOf<String,Int>("david" to 22,"ronaldo" to 40)

    mutableage.put("yash",20)

    println("------------------mutable map of------------------")
    println("Age of David = " + mutableage["david"])
    println("Age of Ronaldo = " + mutableage["ronaldo"])
    println("Age of Yash = " + mutableage["yash"])



}