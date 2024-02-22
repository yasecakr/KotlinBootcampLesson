package com.example.bootcamplessons.object_oriented_programming

fun main(){
    val a = Aclass()
    //println(a.x)
    //a.metod()

    //Virtual Object - Sanal Nesne - Isimsiz nesne
    //println(Aclass().x)
    //Aclass().metod()

    println(Aclass.x) // parantez olmazsa statik olduğu anlamına geliyor. (companion object)
    Aclass.metod()

}