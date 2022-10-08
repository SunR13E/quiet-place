package com.example.quietplace.di

import com.example.quietplace.QuietPlaceApp
import com.example.quietplace.api.CatApi
import com.example.quietplace.api.DogApi
import com.example.quietplace.di.modules.AppModule
import com.example.quietplace.di.modules.NetworkModule
import com.example.quietplace.di.modules.ViewModelsModule
import com.example.quietplace.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NetworkModule::class,
        ViewModelsModule::class
    ]
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        fun appModule(module: AppModule): Builder
        fun networkModule(module: NetworkModule): Builder
        fun build(): AppComponent
    }

    fun inject(arg: QuietPlaceApp)
    fun inject(arg: MainActivity)

    fun provideCatApi(): CatApi
    fun provideDogApi(): DogApi
}
