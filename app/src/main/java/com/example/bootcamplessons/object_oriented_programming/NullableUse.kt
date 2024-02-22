package com.example.bootcamplessons.object_oriented_programming

fun main(){
    //Nullable - Null Safety - Optional (Swift)
    var x = "Merhaba"

    //Tanımlama
    var str :String? = null

    //str = "Merhaba"

    //Yöntem 1
    println("Yöntem 1 : ${str?.trim()} ")

    //Yöntem 2
   // println("Yöntem 1 : ${str!!.trim()} ") //ünlem burası null olmayacak diyoruz

    //Yöntem 3
    if (str !=null){
        println("Yöntem 3 : ${str.trim()} ")
    }else{
        println("Sonuç nulldur")
    }

    //Yöntem 4
    str?.let{
        println("Yöntem 4 : ${str.trim()} ")
    }


}