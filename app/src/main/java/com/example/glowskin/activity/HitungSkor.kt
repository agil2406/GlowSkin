package com.example.glowskin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.glowskin.R

class HitungSkor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_skor)

        val kuis1 : Int = intent.getIntExtra("skor",0)

        val hasil_skor : TextView = findViewById(R.id.Hasil)


        hasil_skor.setOnClickListener{
            fun hasil (kuis1 : Int){
                if(kuis1 >= 3 && kuis1 <= 5){
                    startActivity(Intent(this,HasilNormal::class.java))
                }else if (kuis1 >= 6 && kuis1 <= 10 ){
                    startActivity(Intent(this,HasilKering::class.java))
                }else if (kuis1 >=11  && kuis1 <= 15 ){
                    startActivity(Intent(this,HasilBerminyak::class.java))
                }else if (kuis1 >= 16 &&  kuis1 <= 20 ){
                    startActivity(Intent(this,HasilKombinasi::class.java))
                }
            }
            hasil(kuis1)
        }


    }
}