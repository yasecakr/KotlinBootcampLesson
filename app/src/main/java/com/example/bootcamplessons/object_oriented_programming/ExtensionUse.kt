package com.example.bootcamplessons.object_oriented_programming

fun main(){
    val result = 6.multiplication(3)
    println("Incoming Result : $result ")

    val result1 = 6 multiplication 2 //infix dediğimizde
    println("Incoming Result : $result1 ")

}

infix fun Int.multiplication(number:Int) : Int {
    return this * number //this = Int sınıfı
}