package com.example.glowskin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import com.example.glowskin.R

class Kuis4 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kuis4)

        val a: CardView = findViewById(R.id.a4)
        val b: CardView = findViewById(R.id.b4)
        val c: CardView = findViewById(R.id.c4)
        val d: CardView = findViewById(R.id.d4)

        a.setOnClickListener(this)
        b.setOnClickListener(this)
        c.setOnClickListener(this)
        d.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val kuis4 : Int = intent.getIntExtra("jawaban3",0)
        when (v?.id) {
            R.id.a4 -> {
                val skor = 1 + kuis4
                val jawaban = Intent(this, Kuis5::class.java)
                jawaban.putExtra("jawaban4", skor)
                startActivity(jawaban)
            }
            R.id.b4-> {
                val skor = 2 + kuis4
                val jawaban = Intent(this, Kuis5::class.java)
                jawaban.putExtra("jawaban4", skor)
                startActivity(jawaban)
            }
            R.id.c4 -> {
                val skor = 3 + kuis4
                val jawaban = Intent(this, Kuis5::class.java)
                jawaban.putExtra("jawaban4", skor)
                startActivity(jawaban)
            }
            R.id.d4 -> {
                val skor = 4 + kuis4
                val jawaban = Intent(this, Kuis5::class.java)
                jawaban.putExtra("jawaban4", skor)
                startActivity(jawaban)
            }
        }
    }
}