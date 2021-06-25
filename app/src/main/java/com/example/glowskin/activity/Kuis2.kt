package com.example.glowskin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import com.example.glowskin.R

class Kuis2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kuis2)



        val a: CardView = findViewById(R.id.a2)
        val b: CardView = findViewById(R.id.b2)
        val c: CardView = findViewById(R.id.c2)
        val d: CardView = findViewById(R.id.d2)

        a.setOnClickListener(this)
        b.setOnClickListener(this)
        c.setOnClickListener(this)
        d.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val kuis2 : Int = intent.getIntExtra("jawaban1",0)
        when (v?.id) {
            R.id.a2 -> {
                val skor = 1 + kuis2
                val jawaban = Intent(this, Kuis3::class.java)
                jawaban.putExtra("jawaban2", skor)
                startActivity(jawaban)
            }
            R.id.b2-> {
                val skor = 2 + kuis2
                val jawaban = Intent(this, Kuis3::class.java)
                jawaban.putExtra("jawaban2", skor)
                startActivity(jawaban)
            }
            R.id.c2 -> {
                val skor = 3 + kuis2
                val jawaban = Intent(this, Kuis3::class.java)
                jawaban.putExtra("jawaban2", skor)
                startActivity(jawaban)
            }
            R.id.d2 -> {
                val skor = 4 + kuis2
                val jawaban = Intent(this, Kuis3::class.java)
                jawaban.putExtra("jawaban2", skor)
                startActivity(jawaban)
            }
        }
    }
}