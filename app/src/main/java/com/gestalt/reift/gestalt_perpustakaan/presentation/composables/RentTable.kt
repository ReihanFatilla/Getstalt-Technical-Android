package com.gestalt.reift.gestalt_perpustakaan.presentation.composables

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gestalt.reift.perpustakaan.model.Rent

@Composable
fun RentTable(listRent: List<Rent>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
    ) {
        item {
            RentTableHeader()
        }
        items(listRent){ rent ->
            RentTableRow(rent = rent)
        }
    }
}