package com.example.bootcamplessons.standard_programming

fun main(){
    val age = 19
    val name = "Ahmet"
    if ( age >= 18){ //Swift : if yas<=18 { }
        println("Reşitsiniz.")
    }else{
        println("Reşit değilsiniz.")
    }

    if (name == "Ahmet") {
        println("Merhaba Ahmet")
    }else if ( name == "Mehmet"){
      println("Merhaba Mehmet")
    }else{
        println("Tanınmayan kişi")
    }

    val username = "admin"
    val p = 123456

    if (username == "admin" && p == 123456){
        println("Hoşgeldiniz")
    }else{
        println("Hatalı Giriş")
    }

    val number = 11
    if (number == 10 || number == 20 ){
        println("Sayı 10 veya 20 dir.")
    }else{
        println("Sayı 10 veya 20 değildir.")
    }

    //When : Switch

    val day = 3
    when(day){
        1 -> println("Pazartesi")
        2 -> println("Salı")
        3 -> println("Çarşamba")
        4 -> println("Perşembe")
        5 -> println("Cuma")
        6 -> println("Cumartesi")
        7 -> println("Pazar")
        else -> println("Böyle bir gün yok")
    }
}