package com.example.belitadev.myapplication.mock

import com.example.belitadev.myapplication.entities.ProdutoEntity

class ProdutoMock {

    fun getList(): MutableList<ProdutoEntity> {
        return mutableListOf(
                ProdutoEntity(1, "Item 01"),
                ProdutoEntity(2, "Item 02"),
                ProdutoEntity(3, "Item 03"),
                ProdutoEntity(4, "Item 04"),
                ProdutoEntity(5, "Item 05"),
                ProdutoEntity(6, "Item 06"),
                ProdutoEntity(7, "Item 07"),
                ProdutoEntity(8, "Item 08"),
                ProdutoEntity(9, "Item 09"),
                ProdutoEntity(10, "Item 10"),
                ProdutoEntity(11, "Item 11"),
                ProdutoEntity(12, "Item 12"),
                ProdutoEntity(13, "Item 13"),
                ProdutoEntity(14, "Item 14"),
                ProdutoEntity(15, "Item 15"),
                ProdutoEntity(16, "Item 16")
        )
    }
}