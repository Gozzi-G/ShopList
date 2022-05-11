package com.demo.shoplist.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.demo.shoplist.databinding.ItemShopDisabledBinding
import com.demo.shoplist.databinding.ItemShopEnbledBinding
import com.demo.shoplist.domain.ShopItem

class ShopListAdapter(
    val onLongItemClickListener: ((ShopItem) -> Unit)? = null,
    val onItemClickListener: ((ShopItem) -> Unit)? = null
) : ListAdapter<ShopItem, RecyclerView.ViewHolder>(ShopItemDiffCallback()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            VIEW_TYPE_DISABLED -> ShopItemViewHolderDisabled(
                binding = ItemShopDisabledBinding.inflate(inflater, parent, false),
                onItemLongClick = onLongItemClickListener,
                onItemClick = onItemClickListener
            )
            VIEW_TYPE_ENABLED -> ShopItemViewHolderEnabled(
                binding = ItemShopEnbledBinding.inflate(inflater, parent, false),
                onItemLongClick = onLongItemClickListener,
                onItemClick = onItemClickListener
            )
            else -> throw RuntimeException("Unknown view type: $viewType")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val shopItem = getItem(position)
        when (holder) {
            is ShopItemViewHolderEnabled -> {
                holder.bind(shopItem)
            }
            is ShopItemViewHolderDisabled -> {
                holder.bind(shopItem)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        val item = getItem(position)
        return if (item.enabled) {
            VIEW_TYPE_ENABLED
        } else {
            VIEW_TYPE_DISABLED
        }
    }

    companion object {
        const val VIEW_TYPE_ENABLED = 0
        const val VIEW_TYPE_DISABLED = 1

        const val MAX_POOL_SIZE = 30
    }

}