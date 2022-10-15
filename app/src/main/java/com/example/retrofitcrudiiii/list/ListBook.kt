package com.example.retrofitcrudiiii

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.retrofitcrudiiii.book.BookViewModel
import com.example.retrofitcrudiiii.list.ListViewModel

@Composable
fun ListBook(navController: NavHostController) {
    var viewModel:ListViewModel = viewModel()

    viewModel.getList()
    LazyColumn{
        items(viewModel.list) {
            Row(modifier = Modifier.clickable { navController.navigate("book") }){ Text(it.title)}

        }
    }
}