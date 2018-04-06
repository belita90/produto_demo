package com.example.belitadev.myapplication.entities

data class ProdutoEntity(
        val id:Int,
        var nome: String,
        var clicado: Boolean = false){
}