package com.example.bootcamplessons.object_oriented_programming

class Functions {
    //Void -geri dönüş değeri olmayan
    fun greetings1(){
        val result = " Hi Ahmet"
        println(result)
    }

    //return - geri dönüş değeri olan
    fun greetings2() : String{
        val result = "Merhaba Ahmet"
        return result
    }

    //parametre
    fun greetings3 (name:String) {
        val result = "Merhaba $name"
        println(result)
    }

    fun addition1(number1:Int, number2:Int): Int {
        val ad =  number1 + number2
        return ad
    }

    //Overloading
    fun multiplication(number1:Int,number2:Int){
        println("Çarpma : ${number1*number2}")
    }

    fun multiplication(number1:Double,number2:Int){
        println("Çarpma : ${number1*number2}")
    }

    fun multiplication(number1:Double,number2:Int,name:String){
        println("Çarpma : ${number1*number2} - İşlem yaoan : $name " )
    }

}