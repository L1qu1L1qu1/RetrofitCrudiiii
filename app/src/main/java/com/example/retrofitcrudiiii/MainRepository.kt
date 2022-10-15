package com.example.retrofitcrudiiii

import com.example.retrofitcrudiiii.api.ApiHelper
import com.example.retrofitcrudiiii.api.Book
import com.example.retrofitcrudiiii.api.BookApi
import retrofit2.Response

class MainRepository {
    var bookApi: BookApi = ApiHelper.createBookApi()
    suspend fun getBooks(): Response<List<Book>> {
      return  bookApi.getBooks()

    }
}