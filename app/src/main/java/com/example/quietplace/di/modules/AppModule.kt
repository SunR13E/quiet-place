package com.example.quietplace.di.modules

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import kotlinx.coroutines.CoroutineScope

@Module
class AppModule(private val application: Application, private val scope: CoroutineScope) {

    @Provides
    @Singleton
    fun provideContext(): Context = application

    @Provides
    fun provideCoroutineScope(): CoroutineScope = scope
}
