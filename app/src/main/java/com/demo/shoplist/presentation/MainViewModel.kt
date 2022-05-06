package com.demo.shoplist.presentation

import androidx.lifecycle.ViewModel
import com.demo.shoplist.data.ShopListRepositoryImpl
import com.demo.shoplist.domain.DeleteShopItemUseCase
import com.demo.shoplist.domain.EditShopItemUseCase
import com.demo.shoplist.domain.GetShopListItemUseCase
import com.demo.shoplist.domain.ShopItem

class MainViewModel: ViewModel() {
    private val repository = ShopListRepositoryImpl

    private val getShopListItemUseCase = GetShopListItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)

    val shopList = getShopListItemUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)

    }
}