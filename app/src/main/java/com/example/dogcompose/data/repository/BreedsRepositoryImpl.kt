package com.example.dogcompose.data.repository

import com.example.dogcompose.util.Result
import com.example.dogcompose.data.datasource.remote.breeds.BreedsDataSource
import com.example.dogcompose.domain.model.Breeds
import com.example.dogcompose.domain.repository.BreedsRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BreedsRepositoryImpl @Inject constructor(
    private val breedsDataSource: BreedsDataSource
) : BreedsRepository {
    override suspend fun getBreeds(limit: Int, page: Int): Result<Breeds> {
        return breedsDataSource.getBreeds(limit, page)
    }
}