package com.example.bootcamplessons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var str1: String? = null
    lateinit var str2: String //Daha sonra başlatıcam. val ile kullanımaz.primimif tiplerde kullanılmıyor
    var number:Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        str2 = "Merhaba"
    }


}