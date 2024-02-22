package com.example.bootcamplessons.object_oriented_programming.composition

fun main(){
    var c1 = Categories(1,"Dram")
    var c2 = Categories(2,"Science Fiction")

    val d1 = Directors(1,"Quentin Tarantino")
    val d2 = Directors(2,"Christopher Nolan")

    val f1 = Films(1,"Django",2013, c1,d1)

    println("Film id: ${f1.film_id}")
    println("Film name: ${f1.film_name}")
    println("Film id: ${f1.film_year}")
    println("Film Category: ${f1.category.category_ad}")
    println("Film direction: ${f1.director.director_name}")






}