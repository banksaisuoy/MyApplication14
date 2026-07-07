package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.myapplication.databinding.ItemDashboardBinding

class DashboardAdapter(
    private val onItemClick: (DashboardItem) -> Unit
) : RecyclerView.Adapter<DashboardAdapter.DashboardViewHolder>() {

    private var items: List<DashboardItem> = emptyList()

    fun submitList(newItems: List<DashboardItem>) {
        items = newItems
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashboardViewHolder {
        val binding = ItemDashboardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DashboardViewHolder(binding, onItemClick)
    }

    override fun onBindViewHolder(holder: DashboardViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    class DashboardViewHolder(
        private val binding: ItemDashboardBinding,
        private val onItemClick: (DashboardItem) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: DashboardItem) {
            binding.itemTitle.text = item.title
            binding.itemDescription.text = item.description

            Glide.with(binding.root.context)
                .load(item.imageUrl)
                .placeholder(android.R.drawable.ic_menu_gallery)
                .transform(CenterCrop(), RoundedCorners(16))
                .circleCrop()
                .into(binding.itemImage)

            binding.root.setOnClickListener {
                onItemClick(item)
            }
        }
    }
}
