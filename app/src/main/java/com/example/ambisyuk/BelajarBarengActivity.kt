package com.example.ambisyuk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BelajarBarengActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_bareng)

        supportActionBar?.hide()
    }
}