package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar

data class MockItem(val id: Int, val title: String, val description: String)

class MockItemAdapter(private val items: List<MockItem>) : RecyclerView.Adapter<MockItemAdapter.MockViewHolder>() {

    class MockViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleView: TextView = view.findViewById(R.id.itemTitle)
        val descriptionView: TextView = view.findViewById(R.id.itemDescription)
        val iconView: ImageView = view.findViewById(R.id.itemIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MockViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_mock_data, parent, false)
        return MockViewHolder(view)
    }

    override fun onBindViewHolder(holder: MockViewHolder, position: Int) {
        val item = items[position]
        holder.titleView.text = item.title
        holder.descriptionView.text = item.description
        // Icon stays as default for now
    }

    override fun getItemCount() = items.size
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val topAppBar: MaterialToolbar = findViewById(R.id.topAppBar)
        setSupportActionBar(topAppBar)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val mockItems = MockDataGenerator.generateMockData(20)
        recyclerView.adapter = MockItemAdapter(mockItems)
    }
}
