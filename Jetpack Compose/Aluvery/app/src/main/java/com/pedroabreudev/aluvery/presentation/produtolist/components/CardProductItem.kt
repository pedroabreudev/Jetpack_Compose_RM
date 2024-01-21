package com.pedroabreudev.aluvery.presentation.produtolist.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.pedroabreudev.aluvery.R
import com.pedroabreudev.aluvery.domain.model.Product
import com.pedroabreudev.aluvery.domain.sampledata.sampleProducts
import com.pedroabreudev.aluvery.extensions.toBrazilianCurrency
import com.pedroabreudev.aluvery.ui.theme.AluveryTheme
import java.math.BigDecimal

@Composable
fun CardProductItem(
    product: Product,
    modifier: Modifier = Modifier,
    elevation: Dp = 4.dp,
    expanded: Boolean = false
) {
    var expandedState by remember {
        mutableStateOf(expanded)
    }
    ElevatedCard(
        modifier = modifier
            .fillMaxWidth()
            .heightIn(150.dp)
            .clickable {
                expandedState = !expandedState
            },
        elevation = CardDefaults.cardElevation(
            defaultElevation = elevation
        )
    ) {
        Column {
            AsyncImage(
                model = product.image,
                contentDescription = null,
                Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                placeholder = painterResource(id = R.drawable.placeholder),
                contentScale = ContentScale.Crop
            )
            Column(
                Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.secondaryContainer)
                    .padding(16.dp)
            ) {
                Text(
                    text = product.name
                )
                Text(
                    text = product.price.toBrazilianCurrency()
                )
            }
            val textOverflow =
                if (expandedState) TextOverflow.Visible
                else TextOverflow.Ellipsis
            val maxLines =
                if (expandedState) Int.MAX_VALUE
                else 2
            product.description?.let {
                Text(
                    text = product.description,
                    Modifier
                        .padding(16.dp),
                    overflow = textOverflow,
                    maxLines = maxLines
                )
            }
        }
    }
}

@Preview
@Composable
private fun CardProductItemPreview() {
    AluveryTheme {
        Surface {
            CardProductItem(
                product = sampleProducts.random(),
            )
        }
    }
}

@Preview
@Composable
private fun CardProductItemWithDescriptionPreview() {
    AluveryTheme {
        Surface {
            CardProductItem(
                product = Product(
                    name = "Test Product",
                    BigDecimal("100.00"),
                    description = LoremIpsum(50).values.first()
                ),
            )
        }
    }
}

@Preview
@Composable
fun CardProductItemWithDescriptionExpandedPreview() {
    AluveryTheme {
        Surface {
            CardProductItem(
                product = Product(
                    "teste",
                    BigDecimal("9.99"),
                    description = LoremIpsum(50).values.first(),
                ),
                expanded = true,
            )
        }
    }
}