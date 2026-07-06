package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ITEM = "extra_item"
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val item = intent.getSerializableExtra(EXTRA_ITEM) as? MockItem

        item?.let {
            binding.tvDetailTitle.text = it.title
            binding.tvDetailDesc.text = it.description

            Glide.with(this)
                .load(it.imageUrl)
                .placeholder(R.drawable.placeholder_circle)
                .into(binding.ivDetailImage)
        }
    }
}
