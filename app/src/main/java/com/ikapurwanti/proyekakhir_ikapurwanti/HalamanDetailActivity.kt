package com.ikapurwanti.proyekakhir_ikapurwanti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class HalamanDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_detail)

        val ivBackDetail: ImageView = findViewById(R.id.iv_back_detail)
        ivBackDetail.setOnClickListener {
            val intent = Intent(this@HalamanDetailActivity, HalamanUtamaActivity::class.java)
            startActivity(intent)
        }

        val setGambar: ImageView = findViewById(R.id.iv_gambar)
        val setNama: TextView = findViewById(R.id.tv_nama)
        val setHarga: TextView = findViewById(R.id.tv_harga)
        val setDeskripsi: TextView = findViewById(R.id.tv_detail)
        val setManfaat: TextView = findViewById(R.id.tv_manfaat)
        val setCara: TextView = findViewById(R.id.tv_cara)
        val setUkuran: TextView = findViewById(R.id.tv_ukuran)

        val getItem = intent
        val getGmbar = getItem.getIntExtra("gambar", 0)
        val getNama = getItem?.getStringExtra("nama")
        val getHarga = getItem?.getStringExtra("harga")
        val getDeskripsi = getItem?.getStringExtra("deskripsi")
        val getManfaat = getItem?.getStringExtra("manfaat")
        val getCara = getItem?.getStringExtra("cara")
        val getUkuran = getItem?.getStringExtra("ukuran")

        setGambar.setImageResource(getGmbar)
        setNama.text = getNama
        setHarga.text = getHarga
        setDeskripsi.text = getDeskripsi
        setManfaat.text = getManfaat
        setCara.text = getCara
        setUkuran.text = getUkuran

        val aboutShare: Button = findViewById(R.id.action_share)
        aboutShare.setOnClickListener {
            Toast.makeText(this, "Share $getNama", Toast.LENGTH_SHORT).show()
        }


    }
}