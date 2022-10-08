package com.example.quietplace.api

import com.example.quietplace.api.response.CatListItem
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface CatApi {

    @GET("/search?limit={limit}")
    @Headers("Content-Type: application/json")
    suspend fun getCatsList(@Path ("limit") limit: String) : List<CatListItem>
}
