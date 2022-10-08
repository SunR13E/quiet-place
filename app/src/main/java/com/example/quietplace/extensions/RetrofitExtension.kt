package com.example.quietplace.extensions

import java.util.concurrent.TimeUnit
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun createRetrofitInstance(
    apiKeyHeader: String,
    apiURL: String,
    apiKey: String,
): Retrofit {
    val httpLoggingInterceptor = HttpLoggingInterceptor()
    httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

    val okHttpClient = OkHttpClient.Builder()
        .addInterceptor { chain ->
            val original = chain.request()

            val requestBuilder = original.newBuilder()
                .header(
                    apiKeyHeader,
                    apiKey,
                )

            val request = requestBuilder.build()
            chain.proceed(request)
        }
        .connectTimeout(30, TimeUnit.SECONDS)
        .connectTimeout(30, TimeUnit.SECONDS)
        .addNetworkInterceptor(httpLoggingInterceptor)
        .build()

    val retrofit = Retrofit.Builder()
        .baseUrl(apiURL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())

    return retrofit.build()
}
