package com.demo.shoplist.domain

interface ShopListRepository {
    fun getShopList(): List<ShopItem>

    fun getShopItem(shopItemId: Int): ShopItem

    fun insertShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItemUseCase(shopItem: ShopItem)

    fun addShopItem(shopItem: ShopItem)
}