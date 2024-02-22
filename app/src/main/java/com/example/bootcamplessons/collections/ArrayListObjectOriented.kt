package com.example.bootcamplessons.collections

fun main(){
    val s1 = Student(200,"Mert","9B")
    val s2 = Student(300,"Beyza","11Z")
    val s3 = Student(100,"Kerem","12A")


    val studentList = ArrayList<Student>()

    studentList.add(s1)
    studentList.add(s2)
    studentList.add(s3)

    for (o in studentList){
        println("No : ${o.no} - Name : ${o.name} - Class: ${o.class1}")
    }

    //Sort - Sıralama
    println("Sayısal : Küçükten > Büyüğe")
    val sort1 = studentList.sortedWith(compareBy{it.no})//ASC : ascend

    for (o in sort1){
        println("No : ${o.no} - Name : ${o.name} - Class: ${o.class1}")
    }


    println("Sayısal : Büyükten > Küçüğe ")
    val sort2 = studentList.sortedWith(compareByDescending{it.no})// DESC : desced

    for (o in sort2){
        println("No : ${o.no} - Name : ${o.name} - Class: ${o.class1}")
    }

    println("Metinsel : Büyükten > Küçüğe ")
    val sort3 = studentList.sortedWith(compareBy{it.name})

    for (o in sort3){
        println("No : ${o.no} - Name : ${o.name} - Class: ${o.class1}")
    }

    println("Metinsel : Küçükten > Büyüğe ")
    val sort4 = studentList.sortedWith(compareByDescending{it.name})

    for (o in sort4){
        println("No : ${o.no} - Name : ${o.name} - Class: ${o.class1}")
    }

    //Filtreleme - arama işlemi yapılabilir
    println("Filtreleme1")
    val filter1 = studentList.filter {it.no > 150 }
    for (o in filter1){
        println("No : ${o.no} - Name : ${o.name} - Class: ${o.class1}")
    }

    println("Filtreleme2")
    val filter2 = studentList.filter {it.name.contains("y")  }
    for (o in filter2){
        println("No : ${o.no} - Name : ${o.name} - Class: ${o.class1}")
    }






}