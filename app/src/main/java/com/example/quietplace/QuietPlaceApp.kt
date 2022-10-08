package com.example.quietplace

import android.app.Application
import com.example.quietplace.di.AppComponent
import com.example.quietplace.di.DaggerAppComponent
import com.example.quietplace.di.modules.AppModule
import com.example.quietplace.di.modules.NetworkModule
import kotlinx.coroutines.MainScope

class QuietPlaceApp : Application() {

    val di: AppComponent by lazy { createBuilder().build() }

    override fun onCreate() {
        super.onCreate()
        di.inject(this)
    }

    private fun createBuilder(): AppComponent.Builder {
        return DaggerAppComponent.builder()
            .appModule(AppModule(this, MainScope()))
            .networkModule(NetworkModule())
    }
}
