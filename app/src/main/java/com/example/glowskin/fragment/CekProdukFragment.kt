package com.example.glowskin.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.glowskin.R
import com.example.glowskin.activity.Produk


class CekProdukFragment : Fragment() {
    lateinit var btn : TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cek_produk, container, false)


    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn = view.findViewById(R.id.cari)

        btn.setOnClickListener {
            val HomeIntent = Intent(activity, Produk::class.java)
            startActivity(HomeIntent)
        }

    }
}
