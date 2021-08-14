package com.demo.shoplist.domain

class GetShopListItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopList(): List<ShopItem> {
        return shopListRepository.getShopList()
    }
}