package com.example.dogcompose.di

import com.example.dogcompose.data.datasource.remote.images.ImagesDataSource
import com.example.dogcompose.data.datasource.remote.images.ImagesDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteDataSourceModule {

    @Singleton
    @Binds
    abstract fun bindsImagesDataSource(
        imagesDataSourceImpl: ImagesDataSourceImpl
    ): ImagesDataSource
}