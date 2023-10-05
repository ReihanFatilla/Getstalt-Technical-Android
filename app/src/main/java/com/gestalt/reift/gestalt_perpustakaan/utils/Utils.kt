package com.gestalt.reift.gestalt_perpustakaan.utils

object Utils {
    fun Int.toRupiah(): String {
        val rupiahFormat = "Rp ${String.format("%,d", this)}"
        return rupiahFormat.replace(",", ".")
    }
}