package com.example.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.mockDataListView)
        val mockData = MockDataGenerator.generateMockData(20)

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            mockData
        )
        listView.adapter = adapter
    }
}
