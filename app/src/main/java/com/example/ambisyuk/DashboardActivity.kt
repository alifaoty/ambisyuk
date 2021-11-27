package com.example.ambisyuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        supportActionBar?.hide()

        val intentButton: Button = findViewById(BelajarBarengActivity)
        intentButton.setOnClickListener { viewDetail() }
        val intentButton2: Button = findViewById(CatatanActivity)
        intentButton2.setOnClickListener { viewDetail2() }
        val intentButton3: Button = findViewById(ProfileActivity)
        intentButton3.setOnClickListener { viewDetail3() }
    }

    private fun viewDetail() {
        val intent = Intent(this, BelajarBarengActivity::class.java)
        startActivity(intent)
    }

    private fun viewDetail2() {
        val intent = Intent(this, CatatanActivity::class.java)
        startActivity(intent)
    }

    private fun viewDetail3() {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }

}