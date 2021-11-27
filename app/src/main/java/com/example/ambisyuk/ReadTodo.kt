package com.example.ambisyuk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ReadTodo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.readtodo)

        supportActionBar?.hide()
        val TodoList = listOf<Todo>(
            Todo(
                "Homework"
            ),
            Todo(
                "Studying"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_todo)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ToDoAdapter(this, TodoList) {
        }
    }
}