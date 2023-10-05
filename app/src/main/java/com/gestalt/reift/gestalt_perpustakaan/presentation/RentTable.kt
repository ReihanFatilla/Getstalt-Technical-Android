import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gestalt.reift.perpustakaan.model.Customer
import com.gestalt.reift.perpustakaan.model.Rent
import java.time.LocalDate

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
            .border(1.dp, Color.Gray)
            .padding(8.dp),
        maxLines = 1,
        fontSize = 11.sp
    )
}

@Composable
fun RentTableHeader() {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        RentTableHeaderCell("ID", modifier = Modifier.weight(0.4f))
        RentTableHeaderCell("Customer", modifier = Modifier.weight(1f))
        RentTableHeaderCell("Book", modifier = Modifier.weight(1f))
        RentTableHeaderCell("Take", modifier = Modifier.weight(1f))
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
