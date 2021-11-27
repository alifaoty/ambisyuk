package com.example.ambisyuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CatatanActivity : AppCompatActivity() {

    companion object{
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catatan)

        supportActionBar?.hide()

        val catatanlist = listOf <Catatan>(
            Catatan(
                R.drawable.askngiv,
                "Ask And Giving Opinion",
                "Bahasa Inggris Kelas XI"
            ),
            Catatan(
                R.drawable.eksplanasi,
                "Teks Eksplanasi",
                "Bahasa Indonesia Kelas XI"
            ),
            Catatan(
                R.drawable.seratwedhatama,
                "Serat Wedhatama",
                "Bahasa Jawa Kelas XI"
            ),
            Catatan(
                R.drawable.wanus,
                "Wawasan Nusantara",
                "PKN Kelas XI"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_catatan)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = CatatanAdapter(this, catatanlist) {
            val intent = Intent(this, DetailCatatanActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}