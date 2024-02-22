package com.example.bootcamplessons.variables

fun main() {
    var studentName = "Ahmet"
    var studentAge = 23
    var studentSize = 1.98
    var studentInitial = "A"
    var studentIsContinuing = true

    println(studentName)
    println(studentAge)
    println(studentSize)
    println(studentInitial)
    println(studentIsContinuing)

    var product_id : Int = 3416
    var product_name : String = "Macbook Pro"
    var product_number : Int = 100
    var product_price : Double = 42999.99
    var product_supplier : String = "Apple"

    println("Product id : $product_id")
    println("Product Name : $product_name")
    println("Product Number : $product_number")
    println("Product Price : $product_price TL" )
    println("Product Supplier : $product_supplier")


    var a = 10
    var b = 20

    println("$a x $b : ${a*b}")

    //Sabitler - Constant
    //val(Kotlin) - let (Swift)

    var number1 = 30
    println(number1)
    number1 = 100
    println(number1)

    val number2 = 40
    println(number2)
    //number2 = 88

    // Tür Dönüşü - Type Casting
    // Sayısaldan sayısala, sayısaldan mmetine, metinden sayısala
    // hangi türe dönüştürüceksem onu to metodunu kullanıyorum

    val i = 42
    var d = 78.95

    // Sayısaldan Sayısala dönüşüm
    val result1 = i.toDouble()
    var result2 = d.toInt()
    println(result1)
    println(result2)

    //Sayısaldan Metine Dönüşüm
    val result3 = i.toString() //"42"
    val result4 = d.toString() //"78.95"
    println(result3)
    println(result4)

    //Metinden Sayısala Dönüşüm
    val writ = " 67.54"
    val result5 = writ.toDoubleOrNull()

    if (writ != null){
        println(result5)
    }else{
        println("Dönüşüm hatası oluştu")
    }

    //null kontrolü
    result5.let {
        println(it)
    }




}