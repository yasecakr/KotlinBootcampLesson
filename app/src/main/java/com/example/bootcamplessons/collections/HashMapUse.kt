package com.example.bootcamplessons.collections

fun main(){
    //HAshMap - Dictionary
    val country = HashMap<Int,String>()
    country.put(16,"Bursa")
    country.put(34,"İstanbul")
    country[6] = "Ankara"
    println(country)

    println(country.get(16))

    country.put(16,"Yeni Bursa")
    println(country)

    println(country.size)
    println(country.isEmpty())

    for ((key,value)in country) {
        println("$key -> $value")
    }

    country.remove(34)
    println(country)

    country.clear()
    println(country)


}