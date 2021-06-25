package com.example.glowskin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import com.example.glowskin.R

class Kuis5 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kuis5)


        val a: CardView = findViewById(R.id.a5)
        val b: CardView = findViewById(R.id.b5)
        val c: CardView = findViewById(R.id.c5)
        val d: CardView = findViewById(R.id.d5)

        a.setOnClickListener(this)
        b.setOnClickListener(this)
        c.setOnClickListener(this)
        d.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val kuis5 : Int = intent.getIntExtra("jawaban4",0)
        when (v?.id) {
            R.id.a5 -> {
                val skor = kuis5
                val jawaban = Intent(this, HitungSkor::class.java)
                jawaban.putExtra("skor", skor)
                startActivity(jawaban)
            }
            R.id.b5-> {
                val skor = 2 + kuis5
                val jawaban = Intent(this, HitungSkor::class.java)
                jawaban.putExtra("skor", skor)
                startActivity(jawaban)
            }
            R.id.c5 -> {
                val skor = 3 + kuis5
                val jawaban = Intent(this, HitungSkor::class.java)
                jawaban.putExtra("skor", skor)
                startActivity(jawaban)
            }
            R.id.d5 -> {
                val skor = 4 + kuis5
                val jawaban = Intent(this, HitungSkor::class.java)
                jawaban.putExtra("skor", skor)
                startActivity(jawaban)
            }
        }
    }
}