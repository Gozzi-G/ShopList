package com.demo.shoplist.presentation.adapter

import androidx.recyclerview.widget.RecyclerView
import com.demo.shoplist.databinding.ItemShopDisabledBinding
import com.demo.shoplist.domain.ShopItem

class ShopItemViewHolderDisabled(
    private val binding: ItemShopDisabledBinding,
    private val onItemLongClick: ((ShopItem) -> Unit)?,
    private val onItemClick: ((ShopItem) -> Unit)?
) : RecyclerView.ViewHolder(binding.root) {

    private lateinit var item: ShopItem

    init {
        itemView.setOnLongClickListener {
            onItemLongClick?.invoke(item)
            true
        }
        itemView.setOnClickListener {
            onItemClick?.invoke(item)
        }
    }

    fun bind(item: ShopItem) {
        this.item = item
        setViews()
    }

    private fun setViews() {
        binding.tvName.text = item.name
        binding.tvCount.text = item.count.toString()
    }
}