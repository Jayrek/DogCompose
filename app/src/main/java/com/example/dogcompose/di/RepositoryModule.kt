package com.example.dogcompose.di

import com.example.dogcompose.data.repository.BreedsRepositoryImpl
import com.example.dogcompose.data.repository.ImagesRepositoryImpl
import com.example.dogcompose.domain.repository.BreedsRepository
import com.example.dogcompose.domain.repository.ImagesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindsImagesRepository(
        imagesRepositoryImpl: ImagesRepositoryImpl
    ): ImagesRepository

    @Singleton
    @Binds
    abstract fun bindsBreedsRepository(
        breedsRepositoryImpl: BreedsRepositoryImpl
    ): BreedsRepository
}