package com.example.retrofitcrudiiii.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiHelper {
    fun  createBookApi(): BookApi{
        var retrofit = Retrofit
            .Builder()
            .baseUrl("https://spring-boot-mysql-server-part0.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        var bookApi:BookApi=retrofit.create(BookApi::class.java)
        return bookApi
    }
}