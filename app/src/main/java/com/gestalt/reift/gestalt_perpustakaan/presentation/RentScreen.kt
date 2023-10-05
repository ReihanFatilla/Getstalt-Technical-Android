package com.gestalt.reift.gestalt_perpustakaan.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gestalt.reift.gestalt_perpustakaan.presentation.composables.RentTable
import com.gestalt.reift.gestalt_perpustakaan.model.Rent
import com.gestalt.reift.gestalt_perpustakaan.presentation.composables.FilterButtons

@Composable
fun RentTableScreen() {
    var listRent by remember { mutableStateOf(Rent.dummy) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp),
        content = {
            FilterButtons(
                onPriceRangeClicked = { isFilter ->
                    listRent = if (isFilter) {
                        Rent.dummy
                    } else {
                        listRent.filter {
                            it.book.priceRent in 2001..5999
                        }
                    }
                }
            )
            RentTable(listRent = listRent)
        }
    )
}

@Composable
@Preview(showBackground = true)
fun RentTablePreview() {
    MaterialTheme {
        RentTableScreen()
    }
}