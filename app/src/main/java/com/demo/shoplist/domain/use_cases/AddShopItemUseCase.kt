package com.demo.shoplist.domain.use_cases

import com.demo.shoplist.domain.ShopItem
import com.demo.shoplist.domain.ShopListRepository

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}