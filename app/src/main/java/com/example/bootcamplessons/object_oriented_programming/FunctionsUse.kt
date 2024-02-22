package com.example.bootcamplessons.object_oriented_programming

fun main(){
    val f = Functions()
    f.greetings1()

    val incomingResult = f.greetings2()
    println("Incoming Result : $incomingResult")

    f.greetings3("Zeynep")

    val incomingAdition = f.addition1(20,30)
    println("Incoming Addition : $incomingAdition")

    f.multiplication(4.0,6,"Yasemin")

}