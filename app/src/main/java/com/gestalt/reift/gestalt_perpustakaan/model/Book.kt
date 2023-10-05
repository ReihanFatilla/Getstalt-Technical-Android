package com.gestalt.reift.gestalt_perpustakaan.model

data class Book(
    val id: Int,
    val title: String,
    val author: String?,
    val priceRent: Int,
    val bookCategory: String
)
