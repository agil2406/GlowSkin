package com.example.glowskin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.glowskin.R

class HasilBerminyak : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_berminyak)
        val kembali : TextView = findViewById(R.id.tv_kembali)
        kembali.setOnClickListener {
            startActivity(Intent(this,NavgationBar::class.java))
        }
    }
}