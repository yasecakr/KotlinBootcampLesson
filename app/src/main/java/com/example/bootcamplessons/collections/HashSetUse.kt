package com.example.bootcamplessons.collections

fun main(){
    val fruits = HashSet<String>()

    fruits.add("Elma")
    fruits.add("Kiraz")
    fruits.add("Muz")
    println(fruits)

    fruits.add("Amasya Elması")
    println(fruits)

    println(fruits.elementAt(1))
    println(fruits.size)
    println(fruits.isEmpty())

    for (f in fruits){
        println("Sonuç : $f")
    }

    for ((i,f) in fruits.withIndex()){
        println("$i. -> $f")
    }

    fruits.remove("Elma")
    println(fruits)

    fruits.clear()


}