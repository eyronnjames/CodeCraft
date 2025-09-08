package com.example.codecraft


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // gagamitin yung XML layout

        // Get views from XML
        val nameInput = findViewById<EditText>(R.id.nameInput)
        val submitBtn = findViewById<Button>(R.id.submitBtn)
        val resultText = findViewById<TextView>(R.id.resultText)

        // Button click listener
        submitBtn.setOnClickListener {
            val name = nameInput.text.toString()
            if (name.isNotEmpty()) {
                resultText.text = "Hello, $name! Welcome to My App 🚀"
            } else {
                resultText.text = "Please enter your name."
            }
        }
    }
}
