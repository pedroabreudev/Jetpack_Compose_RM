package com.pedroabreudev.aluvery.presentation.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.pedroabreudev.aluvery.data.database.dao.ProductDao
import com.pedroabreudev.aluvery.presentation.productform.ProductFormScreen
import com.pedroabreudev.aluvery.ui.theme.AluveryTheme

class ProductFormActivity : ComponentActivity() {

    private val dao = ProductDao()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                Surface {
                    ProductFormScreen(
                        onSaveClick = { product ->
                            dao.save(product)
                            finish()
                        }
                    )
                }
            }
        }
    }
}