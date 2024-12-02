package com.example.actividad16

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener {
            val intent: Intent= Intent(this, MainActivity2:: class.java)
            startActivity(intent)
        }

        val btn2: Button = findViewById(R.id.button2)
        btn2.setOnClickListener {
            val intent: Intent= Intent(this, MainActivity3:: class.java)
            startActivity(intent)
        }

        val btn3: Button = findViewById(R.id.button3)
        btn3.setOnClickListener {
            val intent: Intent= Intent(this, MainActivity4:: class.java)
            startActivity(intent)
        }


    }
}