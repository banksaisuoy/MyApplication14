package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = MockDataGenerator.generateMockData(5)
        findViewById<TextView>(R.id.textView)?.text = resources.getQuantityString(R.plurals.generated_items, data.size, data.size)
    }
}
