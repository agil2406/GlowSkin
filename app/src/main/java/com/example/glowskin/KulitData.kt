package com.example.glowskin

import com.example.glowskin.model.Kulit

object KulitData  {
    private val namakulit = arrayOf(
            "Kulit \nNormal",
            "Kulit \nBerminyak",
            "Kulit \nKering",
            "Kulit \nKombinasi"
    )
    private val fotokulit = intArrayOf(
            R.drawable.normal,
            R.drawable.minyak,
            R.drawable.kering,
            R.drawable.kombinasi
    )
    private val deskripsikulit = arrayOf(
            "Do’s:\nPakai moisturizer untuk melembapkan wajah\nTidur teratur setiap hari untuk menjaga kelembapan kulit\nPakai toner yang alcohol-free\nExfoliate secara teratur untuk menghilangkan sel kulit mati\n" +
                    "Don’t’s :\nHindari penggunaan produk yang menyebabkan kulit kering\nHindari produk yang membuat kulit terasa greasy atau berminyak\nTidak disarankan untuk berlama-lama mandi dengan air panas\nJangan terlalu sering membersihkan wajah",
            "Do’s:\nPakai moisturizer untuk melembapkan wajah\nTidur teratur setiap hari untuk menjaga kelembapan kulit\nPakai toner yang alcohol-free\nExfoliate secara teratur untuk menghilangkan sel kulit mati\n" +
                    "Don’t’s :\nHindari penggunaan produk yang menyebabkan kulit kering\nHindari produk yang membuat kulit terasa greasy atau berminyak\nTidak disarankan untuk berlama-lama mandi dengan air panas\nJangan terlalu sering membersihkan wajah",
            "Do’s:\nPakai moisturizer untuk melembapkan wajah\nTidur teratur setiap hari untuk menjaga kelembapan kulit\nPakai toner yang alcohol-free\nExfoliate secara teratur untuk menghilangkan sel kulit mati\n" +
                    "Don’t’s :\nHindari penggunaan produk yang menyebabkan kulit kering\nHindari produk yang membuat kulit terasa greasy atau berminyak\nTidak disarankan untuk berlama-lama mandi dengan air panas\nJangan terlalu sering membersihkan wajah",
            "Do’s:\nPakai moisturizer untuk melembapkan wajah\nTidur teratur setiap hari untuk menjaga kelembapan kulit\nPakai toner yang alcohol-free\nExfoliate secara teratur untuk menghilangkan sel kulit mati\n" +
                    "Don’t’s :\nHindari penggunaan produk yang menyebabkan kulit kering\nHindari produk yang membuat kulit terasa greasy atau berminyak\nTidak disarankan untuk berlama-lama mandi dengan air panas\nJangan terlalu sering membersihkan wajah"
    )

    val listdata : ArrayList<Kulit>
        get() {
            val list = arrayListOf<Kulit>()
            for (position in namakulit.indices){
                val kt = Kulit()
                kt.nama = namakulit[position]
                kt.foto = fotokulit[position]
                kt.deskripsi = deskripsikulit[position]
                list.add(kt)
            }
            return list
        }

}