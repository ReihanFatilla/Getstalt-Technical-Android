package com.gestalt.reift.gestalt_perpustakaan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gestalt.reift.gestalt_perpustakaan.presentation.composables.RentTable
import com.gestalt.reift.gestalt_perpustakaan.ui.theme.GestaltPerpustakaanTheme
import com.gestalt.reift.perpustakaan.model.Rent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GestaltPerpustakaanTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RentTable(listRent = Rent.generateDummy())
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GestaltPerpustakaanTheme {
        RentTable(listRent = Rent.generateDummy())
    }
}