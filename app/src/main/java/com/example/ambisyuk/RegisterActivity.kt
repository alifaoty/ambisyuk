package com.example.ambisyuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        supportActionBar?.hide()

        val btnLogin: Button = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {

            Intent(this@RegisterActivity, LoginActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}