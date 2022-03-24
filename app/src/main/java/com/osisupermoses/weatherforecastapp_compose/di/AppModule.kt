package com.osisupermoses.weatherforecastapp_compose.di

import com.osisupermoses.weatherforecastapp_compose.data.remote.OpenWeatherMapApi
import com.osisupermoses.weatherforecastapp_compose.data.remote.OpenWeatherMapApi.Companion.BASE_URL
import com.osisupermoses.weatherforecastapp_compose.data.repository.RepositoryImpl
import com.osisupermoses.weatherforecastapp_compose.domain.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideWeatherApi(): OpenWeatherMapApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(OpenWeatherMapApi::class.java)
    }

    @Singleton
    @Provides
    fun provideWeatherRepository(
        api: OpenWeatherMapApi
    ) = RepositoryImpl(api)
}