package com.example.ambisyuk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class DeleteTodo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.deletetodo)

        val rollButton: Button = findViewById(R.id.delete_button)
        rollButton.setOnClickListener {
            Toast.makeText(this, "Successfully deleted todo!", Toast.LENGTH_SHORT).show()
        }
    }
}