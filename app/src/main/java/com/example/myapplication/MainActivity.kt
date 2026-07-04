package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataTextView = findViewById<TextView>(R.id.dataTextView)

        // Generate mocked data for 100% functionality as per instructions
        val data = MockDataGenerator.generateData(forceMock = true)

        dataTextView.text = data.joinToString(separator = "\n")
    }
}
