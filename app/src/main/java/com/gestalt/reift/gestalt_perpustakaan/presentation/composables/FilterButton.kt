package com.gestalt.reift.gestalt_perpustakaan.presentation.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FilterButtons(
    onPriceRangeClicked: (Boolean) -> Unit,
) {
    var isFilter by remember { mutableStateOf(false) }
    Button(
        onClick = {
            onPriceRangeClicked(isFilter)
            isFilter = !isFilter
        },
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            if (isFilter) "Reset Filter" else "Harga Peminjaman Rp.2000 - Rp.6000",
            fontSize = 11.sp
        )
    }
}