package com.example.bootcamplessons.object_oriented_programming

fun main(){
    //Nesne Oluşturma
    val bmv = Car("red",0,false)

    //Okuma
    bmv.getInformation()

    //Veri Atama
    bmv.color = "mavi"
    bmv.speed = 10
    bmv.doesIsWork = true

    bmv.getInformation()
    bmv.stop()
    bmv.getInformation()
    bmv.run()
    bmv.getInformation()
    bmv.speedUp(50)
    bmv.getInformation()
    bmv.speedDown(20)
    bmv.getInformation()

    val sahin = Car("Beyaz",100,true)

   sahin.getInformation()
    sahin.speedUp(40)
    sahin.getInformation()



}