import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gestalt.reift.perpustakaan.model.Customer
import com.gestalt.reift.perpustakaan.model.Rent
import java.time.LocalDate

@Composable
fun RentTable(rentList: List<Rent>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        item {
            RentTableHeader()
        }
    }
}

@Composable
fun RentTableHeader() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("ID", modifier = Modifier.weight(0.5f))
        Text("Customer", modifier = Modifier.weight(2f))
        Text("Book", modifier = Modifier.weight(2f))
        Text("Rent Date", modifier = Modifier.weight(1f))
        Text("Return", modifier = Modifier.weight(1f))
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RentTableScreen() {
    val rentList by remember { mutableStateOf(Rent.generateDummy()) }

    Column(
        modifier = Modifier.fillMaxSize(),
        content = {
            RentTable(rentList = rentList)
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
