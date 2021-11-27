package com.example.ambisyuk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class UpdateTodo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.updatetodo)

        val rollButton: Button = findViewById(R.id.update_button)
        rollButton.setOnClickListener {
            Toast.makeText(this, "Successfully updated todo!", Toast.LENGTH_SHORT).show()
        }
    }
}