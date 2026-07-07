package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val EXTRA_ITEM = "extra_item"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val item = intent.getSerializableExtra(EXTRA_ITEM) as? DashboardItem

        item?.let {
            populateUI(it)
        }
    }

    private fun populateUI(item: DashboardItem) {
        binding.detailTitle.text = item.title
        binding.detailDescription.text = item.description

        Glide.with(this)
            .load(item.imageUrl)
            .placeholder(android.R.drawable.ic_menu_gallery)
            .centerCrop()
            .into(binding.detailHeroImage)
    }
}
