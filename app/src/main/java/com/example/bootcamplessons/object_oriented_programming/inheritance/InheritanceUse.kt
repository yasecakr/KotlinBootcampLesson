package com.example.bootcamplessons.object_oriented_programming.inheritance

fun main(){
    val topkapiPalace = Palace(5,300)
    val bosporusVilla = Villa(true,10)

    println(topkapiPalace.towerNumber)
    println(topkapiPalace.windowsNumber)

    println(bosporusVilla.isThereGarage)
    println(bosporusVilla.windowsNumber)


    if (topkapiPalace is Palace){
        println("Saraydır")
    }else{
        println("Saray değildir")
    }

    //UpCastıng -alttan yukarıya subclassı süper class dönüştürmek
    val home:Home = bosporusVilla

    //DownCasting
    val home1 = Home(7)
    val place = home1 as Palace



}