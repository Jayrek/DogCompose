package com.example.dogcompose.data.datasource.remote.breeds

import com.example.dogcompose.util.Result
import com.example.dogcompose.domain.model.Breeds

interface BreedsDataSource {

    suspend fun getBreeds(limit: Int, page: Int) : Result<Breeds>
}