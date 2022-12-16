package com.ikapurwanti.proyekakhir_ikapurwanti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HalamanAboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_about)

        val ivback : ImageView = findViewById(R.id.iv_back)
        ivback.setOnClickListener{
            val intent = Intent(this@HalamanAboutActivity,HalamanUtamaActivity::class.java)
            startActivity(intent)
        }
    }
}