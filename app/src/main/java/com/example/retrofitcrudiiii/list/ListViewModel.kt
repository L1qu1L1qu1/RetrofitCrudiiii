package com.example.retrofitcrudiiii.list

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitcrudiiii.MainRepository
import com.example.retrofitcrudiiii.api.ApiHelper
import com.example.retrofitcrudiiii.api.Book
import com.example.retrofitcrudiiii.api.BookApi
import kotlinx.coroutines.launch

class ListViewModel:ViewModel (){
    var list = mutableStateListOf<Book>()
var repository: MainRepository =  MainRepository()
    fun getList(){
        viewModelScope.launch {
            var response = repository.getBooks()
            if(response.isSuccessful){
                list.addAll(response.body()!!)
            }
        }
    }
}