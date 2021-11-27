package com.example.ambisyuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        val btnRegister : Button = findViewById(R.id.btnRegister)
        btnRegister.setOnClickListener {

            Intent(this@LoginActivity, LoginActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}