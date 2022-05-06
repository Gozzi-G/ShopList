package com.demo.shoplist.domain.use_cases

import com.demo.shoplist.domain.ShopItem
import com.demo.shoplist.domain.ShopListRepository

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItemUseCase(shopItem)
    }
}