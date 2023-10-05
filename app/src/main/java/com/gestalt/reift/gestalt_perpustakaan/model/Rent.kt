package com.gestalt.reift.perpustakaan.model

import java.time.LocalDate

data class Rent(
    val id: Long,
    val customer: Customer,
    val book: Book,
    val dateRent: LocalDate,
    val dateReturn: LocalDate
){
    companion object{
        fun generateDummy(): List<Rent> {
            val dummyCustomer = Customer(1, "John Doe", "1234567890", "123 Main St")
            val dummyBook = Book(1, "Sample Book", "Sample Author", 10, "Fiction")

            return List(10) { index ->
                Rent(
                    id = index.toLong(),
                    customer = dummyCustomer,
                    book = dummyBook,
                    dateRent = LocalDate.now(),
                    dateReturn = LocalDate.now().plusDays(index.toLong())
                )
            }
        }
    }
}