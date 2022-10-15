package com.example.retrofitcrudiiii.api

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
 class Book(
    val id: Int,
    val author: String,
    val description: String,
    val title: String,
    val published: Int
):Parcelable