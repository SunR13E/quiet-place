package com.example.quietplace.repo

import com.example.quietplace.api.DogApi
import com.example.quietplace.api.response.DogListItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class DogRepo(private val dogApi: DogApi) {

    suspend fun getDogImages(limit: Int): Flow<List<DogListItem>> {
        val dogList = dogApi.getDogsList(limit.toString())
        return flowOf(dogList)
    }
}