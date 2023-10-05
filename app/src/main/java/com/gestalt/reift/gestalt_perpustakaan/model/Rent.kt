package com.gestalt.reift.perpustakaan.model

import java.time.LocalDate
import kotlin.random.Random

data class Rent(
    val id: Int,
    val customer: Customer,
    val book: Book,
    val dateRent: LocalDate,
    val dateReturn: LocalDate
){
    companion object{
        fun generateDummyCustomer(): Customer {
            val customerId = Random.nextInt(1, 100)
            val customerName = "Customer${customerId}"
            val identityCardNumber = "ID-${customerId}"
            val address = "Address${customerId}"
            return Customer(customerId, customerName, identityCardNumber, address)
        }

        private fun generateDummyBook(): Book {
            val bookId = Random.nextInt(101, 200)
            val bookTitle = "Book${bookId}"
            val author = "Author${bookId}"
            val priceRent = Random.nextInt(10, 50)
            val bookCategory = "Category${Random.nextInt(1, 5)}"
            return Book(bookId, bookTitle, author, priceRent, bookCategory)
        }
        fun generateDummy(): List<Rent> {

            return List(50) { index ->
                Rent(
                    id = Random.nextInt(1001, 2000),
                    customer = generateDummyCustomer(),
                    book = generateDummyBook(),
                    dateRent = LocalDate.now(),
                    dateReturn = LocalDate.now().plusDays(Random.nextLong(1, 30))
                )
            }
        }
    }
}