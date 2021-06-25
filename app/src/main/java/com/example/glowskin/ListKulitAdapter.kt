package com.example.glowskin

import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.glowskin.model.Kulit
import com.example.glowskin.R
import android.view.LayoutInflater
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.glowskin.activity.JenisKulit

class ListKulitAdapter(private val ListKulit : ArrayList<Kulit> ) : RecyclerView.Adapter<ListKulitAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var tv_nama : TextView = itemView.findViewById(R.id.tv_nama)
        var image : ImageView = itemView.findViewById(R.id.iv_kulit)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_pilihkulit,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val kulit = ListKulit[position]
        Glide.with(holder.itemView.context)
                .load(kulit.foto)
                .apply(RequestOptions().override(500,500))
                .into(holder.image)
        holder.tv_nama.text = kulit.nama

        holder.tv_nama.setOnClickListener {
            val context = it.context
            val catDetailIntent = Intent(context, JenisKulit::class.java)
            catDetailIntent.putExtra(JenisKulit.EXTRA_POSITION, position)
            context.startActivity(catDetailIntent)
        }

        holder.image.setOnClickListener{
            val context = it.context
            val catDetailIntent = Intent(context, JenisKulit::class.java)
            catDetailIntent.putExtra(JenisKulit.EXTRA_POSITION, position)
            context.startActivity(catDetailIntent)
        }

    }

    override fun getItemCount(): Int {
        return ListKulit.size
    }

}