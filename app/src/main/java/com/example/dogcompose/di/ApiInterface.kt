package com.example.dogcompose.di

import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("images/search")
    suspend fun searchImages() : Response<String>
}