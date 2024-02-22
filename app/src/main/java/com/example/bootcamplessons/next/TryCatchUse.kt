package com.example.bootcamplessons.next

fun main(){
    //Compile eror - işlem başlamadan olan hata
    val x = 10
    //x = 30

    //2.Exception : Runtime Error
    val a = 20
    val b = 2


    try{
        println("Sonuç : ${a/b}")
        println("Işlem Tamam")
    }catch (e: Exception){
        println("İkinci sayı sıfır olamaz.")
    }
}