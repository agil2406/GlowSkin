package com.example.glowskin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.glowskin.R

class Produk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produk)
        val back : ImageView = findViewById(R.id.back)

        back.setOnClickListener {
            startActivity(Intent(baseContext,NavgationBar::class.java))
        }
    }
}