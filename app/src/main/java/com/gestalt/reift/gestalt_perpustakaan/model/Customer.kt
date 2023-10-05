package com.gestalt.reift.perpustakaan.model

data class Customer(
    val id: Int,
    val name: String,
    val identityCardNumber: String,
    val address: String?
)
