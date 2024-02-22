package com.example.bootcamplessons.object_oriented_programming.inheritance.override_use

fun main(){
    val animal = Animal()
    val mammal = Mammal()
    val dog = Dog()
    val cat = Cat()

    animal.makeNoise() //Kalıtım yok. Kendi classına erişti.
    mammal.makeNoise() // Kalıtım var, üst classın medonun kullandı.
    dog.makeNoise()//Kalıtım var, kendi metodunu kullandı.
    cat.makeNoise() //Kalıtım var, kendi metodunu kullandı.
}
