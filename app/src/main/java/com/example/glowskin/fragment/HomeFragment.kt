package com.example.glowskin.fragment

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.glowskin.R
import com.example.glowskin.activity.Login
import com.example.glowskin.activity.Register
import com.google.firebase.auth.FirebaseAuth

class HomeFragment : Fragment(), View.OnClickListener {
    private lateinit var auth: FirebaseAuth
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        auth = FirebaseAuth.getInstance()
        val cekproduk : CardView = view.findViewById(R.id.cv_cari)
        val dos : CardView = view.findViewById(R.id.cv_dos)
        val ts : CardView = view.findViewById(R.id.cv_tapskin)
        val logout: TextView = view.findViewById(R.id.tv_logout)
        dos.setOnClickListener(this)
        cekproduk.setOnClickListener(this)
        ts.setOnClickListener(this)
        logout.setOnClickListener(this)

        }

    override fun onClick(v: View?) {
        val cekProdukFragment = CekProdukFragment()
        val TapSkinFragment = TapSkinFragment()
        val DosFragment = DosFragment()
        fun makeCurrentFragment(fragment: Fragment) {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container_fragment,fragment)
                        .addToBackStack(null)
                        .commit()
            }
        }
        when(v?.id){
            R.id.cv_cari -> {
                makeCurrentFragment(cekProdukFragment)
            }
            R.id.cv_dos ->{
                makeCurrentFragment(DosFragment)
            }
            R.id.cv_tapskin -> {
                makeCurrentFragment(TapSkinFragment)
            }
            R.id.tv_logout ->{
                auth.signOut()
                val intent =Intent(context, Login::class.java)
                startActivity(intent)
            }
        }

    }

}

