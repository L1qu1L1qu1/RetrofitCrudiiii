package com.example.retrofitcrudiiii.book

import com.example.retrofitcrudiiii.api.ApiHelper
import com.example.retrofitcrudiiii.api.Book
import com.example.retrofitcrudiiii.api.BookApi
import retrofit2.Response

class BookRepository { //источник данных (хранилище)

    fun helloWorld():String{
        return "hello world"
    }
   suspend fun getBooks(): Response<List<Book>> {
       var api: BookApi = ApiHelper.createBookApi()
      return api.getBooks()
    }

}