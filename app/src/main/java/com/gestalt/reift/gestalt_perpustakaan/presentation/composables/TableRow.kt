package com.gestalt.reift.gestalt_perpustakaan.presentation.composables

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gestalt.reift.perpustakaan.model.Rent

@Composable
fun RentTableRow(rent: Rent) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RentTableRowCell(rent.id.toString(), modifier = Modifier.weight(0.4f))
        RentTableRowCell(rent.customer.name, modifier = Modifier.weight(1f))
        RentTableRowCell(rent.book.title, modifier = Modifier.weight(1f))
        RentTableRowCell(rent.dateRent.toString(), modifier = Modifier.weight(1f))
        RentTableRowCell(rent.dateReturn.toString(), modifier = Modifier.weight(1f))
    }
}

@Composable
fun RentTableRowCell(text: String, modifier: Modifier){
    Text(
        text,
        modifier = modifier
            .border(1.dp, Color.DarkGray)
            .padding(8.dp),
        maxLines = 1,
        fontSize = 11.sp
    )
}