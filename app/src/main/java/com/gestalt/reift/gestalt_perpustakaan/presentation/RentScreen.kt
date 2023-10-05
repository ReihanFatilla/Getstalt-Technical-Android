package com.gestalt.reift.gestalt_perpustakaan.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gestalt.reift.gestalt_perpustakaan.presentation.composables.RentTable
import com.gestalt.reift.perpustakaan.model.Rent

@Composable
fun RentTableScreen() {
    val listRent by remember { mutableStateOf(Rent.generateDummy()) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp),
        content = {
            FilterButtons(
                onShowNeverBorrowedClicked = {

                },
                onPriceRangeClicked = {
                    listRent
                }
                )
            RentTable(listRent = listRent)
        }
    )
}

@Composable
fun FilterButtons(
    onShowNeverBorrowedClicked: () -> Unit,
    onPriceRangeClicked: () -> Unit
) {
    Row(
        modifier = Modifier.padding(16.dp)
    ) {
        Button(
            onClick = { onShowNeverBorrowedClicked() },
            modifier = Modifier.weight(1f),
        ) {
            Text("Tampilkan Buku yang Belum Dipinjam", fontSize = 11.sp)
        }
        Spacer(modifier = Modifier.width(16.dp))
        Button(
            onClick = { onPriceRangeClicked() },
            modifier = Modifier.weight(1f)
        ) {
            Text("Harga Peminjaman Rp.2000 - Rp.6000", fontSize = 11.sp)
        }
    }
}


@Composable
@Preview(showBackground = true)
fun RentTablePreview() {
    MaterialTheme {
        RentTableScreen()
    }
}