package com.example.quietplace.api

import com.example.quietplace.api.response.DogListItem
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface DogApi {

    @GET("/search?limit={limit}")
    @Headers("Content-Type: application/json")
    suspend fun getDogsList(@Path ("limit") limit: String): List<DogListItem>
}
