package com.example.dogcompose.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.dogcompose.util.Result
import com.example.dogcompose.domain.model.Breeds
import com.example.dogcompose.domain.repository.BreedsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BreedsViewModel @Inject constructor(
    private val breedsRepository: BreedsRepository
) : ViewModel() {

    suspend fun getDogBreeds(limit: Int, page: Int): Result<Breeds> {
        return breedsRepository.getBreeds(limit, page)
    }
}