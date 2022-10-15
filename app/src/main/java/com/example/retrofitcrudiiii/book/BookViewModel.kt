package com.example.retrofitcrudiiii.book

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitcrudiiii.api.ApiHelper
import com.example.retrofitcrudiiii.api.Book
import com.example.retrofitcrudiiii.api.BookApi
import kotlinx.coroutines.launch

class BookViewModel:ViewModel() {
var repo =BookRepository()
    var list = mutableStateListOf<Book>()
    fun getBooks(){
        viewModelScope.launch {

         var res =   repo.getBooks()
            if(res.isSuccessful){
                list.addAll(res.body()!!)
            }
        }
    }

}