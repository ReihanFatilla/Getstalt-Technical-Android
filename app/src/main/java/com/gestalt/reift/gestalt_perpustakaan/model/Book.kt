package com.gestalt.reift.perpustakaan.model

data class Book(
    val id: Int,
    val title: String,
    val author: String?,
    val priceRent: Int,
    val bookCategory: String
)
