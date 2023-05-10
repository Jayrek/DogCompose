package com.example.dogcompose.data.datasource.remote.breeds

import android.util.Log
import com.example.dogcompose.di.ApiInterface
import com.example.dogcompose.domain.model.Breeds
import javax.inject.Inject
import javax.inject.Singleton
import com.example.dogcompose.util.Result
import java.lang.Exception

@Singleton
class BreedsDataSourceImpl @Inject constructor(
    private val apiInterface: ApiInterface
) : BreedsDataSource {

    override suspend fun getBreeds(limit: Int, page: Int): Result<Breeds> {
        return try {
            val breeds = apiInterface.getBreeds(limit, page)
            Log.wtf("BREEDS: ", breeds.toString())
            Result.Success(breeds)
        } catch (e: Exception) {
            Result.Error(e)
        }

    }
}