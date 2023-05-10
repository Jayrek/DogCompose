package com.example.dogcompose.data.repository

import com.example.dogcompose.data.datasource.remote.images.ImagesDataSource
import com.example.dogcompose.domain.repository.ImagesRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ImagesRepositoryImpl @Inject constructor(
    private val imagesDataSource: ImagesDataSource
) : ImagesRepository {

    override suspend fun imagesSearch() {
        imagesDataSource.imagesSearch()
    }
}