package com.pedroabreudev.aluvery.data.database.dao

import androidx.compose.runtime.mutableStateListOf
import com.pedroabreudev.aluvery.domain.model.Product

class ProductDao {
    companion object {
        private val products = mutableStateListOf<Product>()
    }

    fun products() = products.toList()

    fun save(product: Product) {
        products.add(product)
    }
}