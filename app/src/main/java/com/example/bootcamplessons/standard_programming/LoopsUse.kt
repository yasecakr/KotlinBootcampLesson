package com.example.bootcamplessons.standard_programming

fun main() {
    //1,2,3
    for (i in 1..3){ //Swift : i in 1...3
        println("Loop 1 : $i")
    }

    //10 ile 10 arasında 5 er artsın
    for (a in 10..20 step 5){
        println("Loop 2 : $a")
    }

    //10 ile 10 arasında 5 er azalsın
    for (b in 20 downTo 10 step 5){
        println("Loop 3 : $b")
    }

    //1,2,3,4,5
    var count = 1

    while (count < 6) {
        println("Loop 4 : $count")
        //count = count + 1
        //count +=1
        count++
    }

    for (i in 1..5){
        if (i == 3){
            break //Çalışmayı durdur.
        }
        println("Loop 5 : $i")
    }

    for (i in 1..5){
        if (i == 3){
            continue //Sonraki adimlari yapma başa dön.
        }
        println("Loop 6 : $i")

    }

}