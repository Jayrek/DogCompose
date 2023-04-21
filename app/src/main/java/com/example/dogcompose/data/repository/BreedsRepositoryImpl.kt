package com.example.dogcompose.data.repository

import com.example.dogcompose.data.datasource.remote.breeds.BreedsDataSource
import com.example.dogcompose.domain.repository.BreedsRepository
import javax.inject.Inject

class BreedsRepositoryImpl @Inject constructor(
    private val breedsDataSource: BreedsDataSource
) : BreedsRepository {
    override suspend fun getBreeds(limit: Int, page: Int) {
        breedsDataSource.getBreeds(limit, page)
    }
}