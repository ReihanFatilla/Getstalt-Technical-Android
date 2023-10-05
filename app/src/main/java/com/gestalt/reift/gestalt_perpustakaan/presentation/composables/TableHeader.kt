package com.gestalt.reift.gestalt_perpustakaan.presentation.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RentTableHeader() {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        RentTableHeaderCell("ID", modifier = Modifier.weight(0.4f))
        RentTableHeaderCell("Customer", modifier = Modifier.weight(1f))
        RentTableHeaderCell("Book", modifier = Modifier.weight(1f))
        RentTableHeaderCell("Price", modifier = Modifier.weight(1f))
        RentTableHeaderCell("Return", modifier = Modifier.weight(1f))
    }
}

@Composable
fun RentTableHeaderCell(text: String, modifier: Modifier) {
    Box(
        modifier = modifier
            .border(1.dp, Color.Black)
            .padding(8.dp)
    ) {
        Text(
            text = text,
            modifier = Modifier
                .fillMaxWidth(),
            fontWeight = FontWeight.Bold,
            maxLines = 1,
            fontSize = 12.sp
        )
        Spacer(
            modifier = Modifier
                .fillMaxHeight()
                .width(1.dp)
                .background(Color.Black)
        )
    }
}