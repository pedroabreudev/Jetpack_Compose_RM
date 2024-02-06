package com.pedroabreudev.aluvery.presentation.produtolist.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SearchTextField(
    searchText: String,
    onSearchChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        modifier = modifier,
        shape = RoundedCornerShape(100),
        value = searchText,
        onValueChange = { newValue ->
            onSearchChange(newValue)
        },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = null)
        },
        label = {
            Text(text = "Produto")
        },
        placeholder = {
            Text(text = "O que você procura?")
        })
}

@Preview
@Composable
fun SearchTextFieldPreview() {
    SearchTextField(searchText = "teste", onSearchChange = {
    })
}