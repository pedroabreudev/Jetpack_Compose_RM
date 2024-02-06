package com.pedroabreudev.aluvery.presentation.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pedroabreudev.aluvery.data.database.dao.ProductDao
import com.pedroabreudev.aluvery.domain.sampledata.sampleSections
import com.pedroabreudev.aluvery.presentation.produtolist.ProductListScreen
import com.pedroabreudev.aluvery.presentation.produtolist.ProductListScreenUiState
import com.pedroabreudev.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() {

    private val dao = ProductDao()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App(
                onFabClick = {
                    startActivity(
                        Intent(
                            this,
                            ProductFormActivity::class.java
                        )
                    )
                }, content = {
                    val products = dao.products()
                    ProductListScreen(products = products)
                }
            )
        }
    }
}

@Composable
fun App(
    onFabClick: () -> Unit = {},
    content: @Composable () -> Unit = {},
) {
    AluveryTheme {
        Surface {
            Scaffold(
                floatingActionButton = {
                    FloatingActionButton(onClick = onFabClick) {
                        Icon(imageVector = Icons.Default.Add, contentDescription = null)
                    }
                }) { paddingValues ->
                Box(modifier = Modifier.padding(paddingValues)) {
                    content()
                }
            }
        }
    }
}

@Preview
@Composable
private fun AppPreview() {
    App(
        content = {
            ProductListScreen(ProductListScreenUiState(sections = sampleSections))
        })
}