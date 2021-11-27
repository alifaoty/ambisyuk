package com.example.ambisyuk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailCatatanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_catatan)

        supportActionBar?.hide()

        val catatan = intent.getParcelableExtra<Catatan>(CatatanActivity.INTENT_PARCELABLE)

        val imgCatatan = findViewById<ImageView>(R.id.img_item_photo)
        val nameCatatan = findViewById<TextView>(R.id.tv_item_name)
        val descCatatan = findViewById<TextView>(R.id.tv_item_description)

        imgCatatan.setImageResource(catatan?.imgCatatan!!)
        nameCatatan.text = catatan.nameCatatan
        descCatatan.text = catatan.descCatatan
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}