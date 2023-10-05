package com.gestalt.reift.gestalt_perpustakaan.model

data class Customer(
    val id: Int,
    val name: String,
    val identityCardNumber: String,
    val address: String?
)
