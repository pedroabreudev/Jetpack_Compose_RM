package com.pedroabreudev.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.pedroabreudev.aluvery.domain.sampledata.sampleSections
import com.pedroabreudev.aluvery.presentation.produtolist.ProductListScreen
import com.pedroabreudev.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    ProductListScreen(sampleSections)
                }
            }
        }
    }
}