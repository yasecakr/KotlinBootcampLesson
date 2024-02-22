package com.example.bootcamplessons.object_oriented_programming

import java.lang.reflect.Array

class Homework2 {
    fun question1(km: Double): Double {
        val result = km * 0.621
        return result
    }

    fun question2(length: Int, width: Int): Int {
        val result = length * width
        return result
    }

    fun question3(number: Int): Int {
        var result = 1
        for (i in 1..number) {
            result *= i
        }
        return result
    }

    fun question4(word: String): Int {
        var count = 0
        for (char in word) {
            if (char == 'e' || char == 'E') {
                count++
            }
        }
        return count

    }

    fun question5(numOfSides: Int): List<Double> {
        val totalAngle = (numOfSides - 2) * 180
        val angle = totalAngle.toDouble() / numOfSides.toDouble()
        val interiorAngles = mutableListOf<Double>()
        repeat(numOfSides){
            interiorAngles.add(angle)
        }
        return interiorAngles
    }


    fun question6(day:Int): Int {
        val workingHours = day* 8
        println("Çalışma saati : $workingHours ")
        var m = 0
        if (workingHours > 150){
            val ms = (workingHours - 150)
            m =  (160 * 40) + (ms * 80)
        }else{
            m = workingHours * 40

        }
        return m

    }

    fun question7(time:Int): Int {
        var fee = 0
        if (time > 1 ){
            fee = ((time - 1) * 10) + 50
        }else if( time == 0){
            println("Ücret ödemenize gerek yoktur.")
        }else if (time == 1){
            fee = 50
        }

        return fee
    }

}





