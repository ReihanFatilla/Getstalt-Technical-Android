package com.gestalt.reift.perpustakaan.model

import java.time.LocalDate

data class Rent(
    val id: Long,
    val customer: Customer,
    val book: Book,
    val dateRent: LocalDate,
    val dateReturn: LocalDate
)