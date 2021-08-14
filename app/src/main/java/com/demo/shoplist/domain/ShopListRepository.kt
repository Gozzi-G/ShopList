package com.demo.shoplist.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {
    fun getShopList(): LiveData<List<ShopItem>>

    fun getShopItem(shopItemId: Int): ShopItem

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItemUseCase(shopItem: ShopItem)

    fun addShopItem(shopItem: ShopItem)
}