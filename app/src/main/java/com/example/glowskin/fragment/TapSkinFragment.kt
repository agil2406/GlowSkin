package com.example.glowskin.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.glowskin.R
import com.example.glowskin.activity.Kuis1
import com.example.glowskin.activity.Produk

class TapSkinFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tap_skin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lateinit var btn : TextView
         btn = view.findViewById(R.id.mulai)

        btn.setOnClickListener {
            val HomeIntent = Intent(activity, Kuis1::class.java)
            startActivity(HomeIntent)
        }

    }


}