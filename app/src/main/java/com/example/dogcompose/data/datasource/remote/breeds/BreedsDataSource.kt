package com.example.dogcompose.data.datasource.remote.breeds

interface BreedsDataSource {

    suspend fun getBreeds(limit: Int, page: Int)
}