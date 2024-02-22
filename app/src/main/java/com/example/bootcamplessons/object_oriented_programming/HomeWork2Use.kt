package com.example.bootcamplessons.object_oriented_programming

fun main(){

    val h2 = Homework2 ()
    val result1 = h2.question1(27.0)
    println("KM : $result1")


    val result2  = h2.question2(20,10)
    println("Area Of Rectangle : $result2")

    val result3 = h2.question3(5)
    println("$result3 : Faktöriyeldir")

    val result4 = h2.question4("Elephant")
    println("Kelimenin içinde $result4 adet 'e' harfi bulunur.")

    val result5 = h2.question5(5)
    println("Çokgenin iç açıları : $result5 ")

    val result6 = h2.question6(30)
    println("Maaşınız : $result6")

    val result7 = h2.question7(0)
    println("Otopark ücreti : $result7")



}



