package com.demo.shoplist.domain.use_cases

import com.demo.shoplist.domain.ShopItem
import com.demo.shoplist.domain.ShopListRepository

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}