package com.example.quietplace.di.modules

import com.example.quietplace.api.ApiConstants.API_KEY_HEADER
import com.example.quietplace.api.ApiConstants.CAT_API_KEY
import com.example.quietplace.api.ApiConstants.CAT_API_URL
import com.example.quietplace.api.ApiConstants.DOG_API_KEY
import com.example.quietplace.api.ApiConstants.DOG_API_URL
import com.example.quietplace.api.CatApi
import com.example.quietplace.api.DogApi
import com.example.quietplace.extensions.createRetrofitInstance
import com.example.quietplace.repo.CatRepo
import com.example.quietplace.repo.DogRepo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Suppress("TooManyFunctions")
@Module
open class NetworkModule {

    @Provides
    @Singleton
    fun provideCatRepo(catApi: CatApi): CatRepo = CatRepo(catApi)

    @Provides
    @Singleton
    fun provideDogRepo(dogApi: DogApi): DogRepo = DogRepo(dogApi)

    @Provides
    @Singleton
    fun provideCatApi(): CatApi {
        val retrofit = createRetrofitInstance(
            apiKeyHeader = API_KEY_HEADER,
            apiKey = CAT_API_KEY,
            apiURL = CAT_API_URL,
        )
        return retrofit.create(CatApi::class.java)
    }

    @Provides
    @Singleton
    fun provideDogApi(): DogApi {
        val retrofit = createRetrofitInstance(
            apiKeyHeader = API_KEY_HEADER,
            apiKey = DOG_API_KEY,
            apiURL = DOG_API_URL,
        )
        return retrofit.create(DogApi::class.java)
    }
}
