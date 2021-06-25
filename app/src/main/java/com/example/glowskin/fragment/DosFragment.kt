package com.example.glowskin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.glowskin.R
import com.example.glowskin.model.Kulit
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.glowskin.KulitData
import com.example.glowskin.ListKulitAdapter

class DosFragment : Fragment() {
    lateinit var rv_kulit : RecyclerView
    private val list : ArrayList<Kulit> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dos, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_kulit = view.findViewById(R.id.rv_tipekulit)
        rv_kulit.setHasFixedSize(true)
        list.addAll(KulitData.listdata)

        //menampilkan rv
        rv_kulit.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        val listadapter = ListKulitAdapter(list)
        rv_kulit.adapter = listadapter
    }

    }