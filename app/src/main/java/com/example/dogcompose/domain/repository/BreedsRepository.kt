package com.example.dogcompose.domain.repository

interface BreedsRepository {

    suspend fun getBreeds(limit: Int, page: Int)
}