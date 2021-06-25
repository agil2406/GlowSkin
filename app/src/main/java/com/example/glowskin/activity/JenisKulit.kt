package com.example.glowskin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.glowskin.KulitData
import com.example.glowskin.R
import com.example.glowskin.model.Kulit

class JenisKulit : AppCompatActivity() {
    private var desList: ArrayList<Kulit> = arrayListOf()

    companion object{
        var EXTRA_POSITION = "extra_position"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jenis_kulit)

        val position = intent.getIntExtra(EXTRA_POSITION, 0)

        val tvItemName : TextView = findViewById(R.id.tv_nama_kulit)
        val tvItemDetail : TextView = findViewById(R.id.tv_deskripsi)

        desList.addAll(KulitData.listdata)
        tvItemName.setText(desList[position].nama)
        tvItemDetail.setText(desList[position].deskripsi)



    }
}