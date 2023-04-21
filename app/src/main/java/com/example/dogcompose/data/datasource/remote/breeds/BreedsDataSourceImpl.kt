package com.example.dogcompose.data.datasource.remote.breeds

import com.example.dogcompose.di.ApiInterface
import javax.inject.Inject

class BreedsDataSourceImpl @Inject constructor(
    private val apiInterface: ApiInterface
) : BreedsDataSource {

    override suspend fun getBreeds(limit: Int, page: Int) {
        apiInterface.getBreeds(limit, page)
    }
}