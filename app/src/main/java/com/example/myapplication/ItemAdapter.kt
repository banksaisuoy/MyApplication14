package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.myapplication.databinding.ItemCardBinding

class ItemAdapter(
    private val items: List<MockItem>,
    private val onItemClick: (MockItem) -> Unit
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = items.size

    inner class ItemViewHolder(private val binding: ItemCardBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MockItem) {
            binding.tvItemTitle.text = item.title
            binding.tvItemDesc.text = item.description

            Glide.with(binding.root.context)
                .load(item.imageUrl)
                .apply(RequestOptions().transform(CenterCrop(), RoundedCorners(16)))
                .placeholder(R.drawable.placeholder_circle)
                .into(binding.ivItemImage)

            binding.root.setOnClickListener { view ->
                view.startAnimation(AnimationUtils.loadAnimation(view.context, android.R.anim.fade_in))
                onItemClick(item)
            }
        }
    }
}
