package com.example.retrofitcrudiiii

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.retrofitcrudiiii.book.BookViewModel

@Composable
fun Books(navController: NavHostController) {
var viewModel: BookViewModel = viewModel()
    viewModel.getBooks()
    LazyColumn{items(viewModel.list){
        Text(it.title)
    }
    }
}