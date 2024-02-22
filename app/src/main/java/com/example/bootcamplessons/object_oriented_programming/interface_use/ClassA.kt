package com.example.bootcamplessons.object_oriented_programming.interface_use

class ClassA : MyInterface {//İnterface tanımladığımız tüm özellikleri eklemek zorundayız
    override val variable: Int = 10

    override fun metod1() {
        println("Metod 1 çalıştı")
    }

    override fun metod2(): String {
       return "Metod 2 çalıştı"
    }
}