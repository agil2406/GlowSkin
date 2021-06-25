package com.example.glowskin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import com.example.glowskin.R

class Kuis3 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kuis3)

        val a: CardView = findViewById(R.id.a3)
        val b: CardView = findViewById(R.id.b3)
        val c: CardView = findViewById(R.id.c3)
        val d: CardView = findViewById(R.id.d3)

        a.setOnClickListener(this)
        b.setOnClickListener(this)
        c.setOnClickListener(this)
        d.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val kuis3 : Int = intent.getIntExtra("jawaban2",0)
        when (v?.id) {
            R.id.a3 -> {
                val skor = 1 + kuis3
                val jawaban = Intent(this, Kuis4::class.java)
                jawaban.putExtra("jawaban3", skor)
                startActivity(jawaban)
            }
            R.id.b3-> {
                val skor = 2 + kuis3
                val jawaban = Intent(this, Kuis4::class.java)
                jawaban.putExtra("jawaban3", skor)
                startActivity(jawaban)
            }
            R.id.c3 -> {
                val skor = 3 + kuis3
                val jawaban = Intent(this, Kuis4::class.java)
                jawaban.putExtra("jawaban3", skor)
                startActivity(jawaban)
            }
            R.id.d3 -> {
                val skor = 4 + kuis3
                val jawaban = Intent(this, Kuis4::class.java)
                jawaban.putExtra("jawaban3", skor)
                startActivity(jawaban)
            }
        }
    }
}