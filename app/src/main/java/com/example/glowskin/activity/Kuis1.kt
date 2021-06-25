package com.example.glowskin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import com.example.glowskin.R

class Kuis1 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kuis1)

        val a: CardView = findViewById(R.id.a1)
        val b: CardView = findViewById(R.id.b1)
        val c: CardView = findViewById(R.id.c1)
        val d: CardView = findViewById(R.id.d1)

        a.setOnClickListener(this)
        b.setOnClickListener(this)
        c.setOnClickListener(this)
        d.setOnClickListener(this)


    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.a1 -> {
                val skor = 1
                val jawaban = Intent(this, Kuis2::class.java)
                jawaban.putExtra("jawaban1", skor)
                startActivity(jawaban)
            }
            R.id.b1 -> {
                val skor = 2
                val jawaban = Intent(this, Kuis2::class.java)
                jawaban.putExtra("jawaban1", skor)
                startActivity(jawaban)
            }
            R.id.c1 -> {
                val skor = 3
                val jawaban = Intent(this, Kuis2::class.java)
                jawaban.putExtra("jawaban1", skor)
                startActivity(jawaban)
            }
            R.id.d1 -> {
                val skor = 4
                val jawaban = Intent(this, Kuis2::class.java)
                jawaban.putExtra("jawaban1", skor)
                startActivity(jawaban)
            }
        }

    }
}
