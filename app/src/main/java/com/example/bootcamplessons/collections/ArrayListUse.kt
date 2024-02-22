package com.example.bootcamplessons.collections

fun main(){
    //Tanımlama
    val numbers = ArrayList<Int>()
    val fruits = ArrayList<String>()

    //Veri Ekleme
    fruits.add("Elma")//0
    fruits.add("Muz")//1
    fruits.add("Kiraz")//2
    println(fruits)

    //Günceleme
    fruits[1] = "Yeni Muz"
    println(fruits)

    //Insert
    fruits.add(1,"Portakal")
    println(fruits)

    //Okuma işlemi
    println(fruits[3])
    println(fruits.get(2))

    println("Boyut : ${fruits.size}")
    println("Boyut : ${fruits.count()}")
    println("Boş kontrol : ${fruits.isEmpty()}")
    println("İçeriyor mu : ${fruits.contains("Kiraz")}")

    fruits.reverse()//sıralamayı tersıne çevirdi
    println(fruits)

    fruits.sort() //sıralama
    println(fruits)

    for (fruit in fruits){ //değer almak
        println("Sonuç : $fruit")
    }

    for ((indeks,fruit) in fruits.withIndex()){ //enumarated () index değerini alma
        println("$indeks. -> $fruit")
    }

    fruits.removeAt(2)
    println(fruits)

    fruits.clear()
    println(fruits)






}