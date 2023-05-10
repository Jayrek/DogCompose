package com.example.dogcompose.domain.repository

import com.example.dogcompose.util.Result
import com.example.dogcompose.domain.model.Breeds

interface BreedsRepository {

    suspend fun getBreeds(limit: Int, page: Int): Result<Breeds>
}