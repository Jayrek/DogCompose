package com.example.dogcompose.data.datasource.remote.images

import com.example.dogcompose.di.ApiInterface
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ImagesDataSourceImpl @Inject constructor(
    private val apiInterface: ApiInterface
) : ImagesDataSource {

    override suspend fun imagesSearch() {
        apiInterface.searchImages()
    }
}