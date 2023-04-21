package com.example.dogcompose.di

import com.example.dogcompose.domain.model.Breeds
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("images/search")
    suspend fun searchImages(): Response<String>

    @GET("breeds")
    suspend fun getBreeds(
        @Query("limit") limit: Int, @Query("page") page: Int
    ): Response<Breeds>
}