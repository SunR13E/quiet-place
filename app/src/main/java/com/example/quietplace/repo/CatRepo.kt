package com.example.quietplace.repo

import com.example.quietplace.api.CatApi
import com.example.quietplace.api.response.CatListItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class CatRepo(private val catApi: CatApi) {

    suspend fun getCatImages(limit: Int): Flow<List<CatListItem>> {
        val catList = catApi.getCatsList(limit.toString())
        return flowOf(catList)
    }
}
