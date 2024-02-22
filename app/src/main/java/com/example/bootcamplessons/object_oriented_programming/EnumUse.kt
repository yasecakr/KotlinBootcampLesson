package com.example.bootcamplessons.object_oriented_programming

fun main(){

 feeAccount(12,CannedSize.MEDIUM)

}

fun feeAccount(piece:Int,size:CannedSize){
    when(size){
        CannedSize.SMALL -> println("Toplam Maliyet : ${piece *30} TL")
        CannedSize.MEDIUM -> println("Toplam Maliyet : ${piece *40} TL")
        CannedSize.LARGE -> println("Toplam Maliyet : ${piece *50} TL")
    }
}