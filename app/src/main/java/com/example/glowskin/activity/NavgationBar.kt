package com.example.glowskin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.glowskin.R
import com.example.glowskin.fragment.CekProdukFragment
import com.example.glowskin.fragment.DosFragment
import com.example.glowskin.fragment.HomeFragment
import com.example.glowskin.fragment.TapSkinFragment

class NavgationBar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navgation_bar)


        val homeFragment = HomeFragment()
        val CekProdukFragment = CekProdukFragment()
        val TapSkinFragment = TapSkinFragment()
        val DosFragment = DosFragment()

        makeCurrentFragment(homeFragment)

        val nav_bar : com.google.android.material.bottomnavigation.BottomNavigationView =  findViewById(
            R.id.bottom_nav_bar
        )

        nav_bar.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.home -> makeCurrentFragment(homeFragment)
                R.id.cekProduk -> makeCurrentFragment(CekProdukFragment)
                R.id.tapSkin -> makeCurrentFragment(TapSkinFragment)
                R.id.dos -> makeCurrentFragment(DosFragment)
            }
            true
        }



    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container_fragment, fragment)
            commit()
        }
    }
}
