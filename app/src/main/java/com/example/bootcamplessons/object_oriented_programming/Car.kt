package com.example.bootcamplessons.object_oriented_programming

class Car (var color:String, var speed:Int, var doesIsWork: Boolean) {

    init { //initialize function
        println("*********Primary Constructor**********")
    }

    fun run(){ //Side effect: Fonsiyon ile sinifin ozelliklerini değiştirebilme
        doesIsWork = true
        speed = 5
    }
    fun stop(){
        doesIsWork = false
        speed = 0
    }

    fun speedDown(howManyKm:Int){
        speed-=howManyKm
    }

    fun speedUp(howManyKm:Int){
        //speed = speed + howManyKm
        speed+=howManyKm
    }

    fun getInformation(){
        println("---------------------")
        println("Color : ${color}")
        println("Speed : ${speed}")
        println("Does It Work : ${doesIsWork}")

    }

    //this veya self(Swift) : bulunduğunuz sınıf
    //super: Kalıtım varsa üst sınıfı temsıl eder.



}