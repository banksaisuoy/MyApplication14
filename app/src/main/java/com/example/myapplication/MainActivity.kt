package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var textViewData: TextView
    private lateinit var buttonGenerate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewData = findViewById(R.id.textViewData)
        buttonGenerate = findViewById(R.id.buttonGenerate)

        buttonGenerate.setOnClickListener {
            val stringData = MockDataGenerator.mockMissingData { MockDataGenerator.generateString() }
            val intData = MockDataGenerator.mockMissingData { MockDataGenerator.generateInt() }
            val boolData = MockDataGenerator.mockMissingData { MockDataGenerator.generateBoolean() }

            textViewData.text = "String: $stringData\nInt: $intData\nBool: $boolData"
        }
    }
}
