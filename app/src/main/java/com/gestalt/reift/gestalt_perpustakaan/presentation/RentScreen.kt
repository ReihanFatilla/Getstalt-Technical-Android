package com.gestalt.reift.gestalt_perpustakaan.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gestalt.reift.gestalt_perpustakaan.presentation.composables.RentTable
import com.gestalt.reift.perpustakaan.model.Rent

@Composable
fun RentTableScreen() {
    val rentList by remember { mutableStateOf(Rent.generateDummy()) }
    Column(
        modifier = Modifier.fillMaxSize(),
        content = {
            RentTable(listRent = rentList)
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