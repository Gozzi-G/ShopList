package com.demo.shoplist.domain.use_cases

import androidx.lifecycle.LiveData
import com.demo.shoplist.domain.ShopItem
import com.demo.shoplist.domain.ShopListRepository

class GetShopListItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopList(): LiveData<List<ShopItem>> {
        return shopListRepository.getShopList()
    }
}