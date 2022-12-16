package com.ikapurwanti.proyekakhir_ikapurwanti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HalamanUtamaActivity : AppCompatActivity() {

    private lateinit var rvProduk : RecyclerView
    private var list: ArrayList<Produk> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_utama)

        val aboutPage : ImageView = findViewById(R.id.about_page)
        aboutPage.setOnClickListener{
            val intent = Intent(this@HalamanUtamaActivity,HalamanAboutActivity::class.java)
            startActivity(intent)
        }

        rvProduk = findViewById(R.id.rv_produk)
        rvProduk.setHasFixedSize(true)

        list.addAll(ProdukData.listDataProduk)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvProduk.layoutManager = LinearLayoutManager(this)
        val listProdukAdapter = ListProdukAdapter(list)
        rvProduk.adapter = listProdukAdapter
    }
}