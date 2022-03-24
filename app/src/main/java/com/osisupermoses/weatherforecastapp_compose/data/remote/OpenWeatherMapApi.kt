package com.osisupermoses.weatherforecastapp_compose.data.remote

import com.osisupermoses.weatherforecastapp_compose.BuildConfig
import com.osisupermoses.weatherforecastapp_compose.data.remote.dto.Weather
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherMapApi {

    @GET("/data/2.5/onecall?")
    suspend fun getWeather(
        @Query("lat") lat: String,
        @Query("lon") lon: String,
        @Query("appid") appId: String = API_KEY,
//        @Query("exclude") exclude: String = "minutely, alerts"
    ): Weather

    companion object {
        //Base URL
        const val BASE_URL = "https://api.openweathermap.org/"

        //API KEY - Go to https://openweathermap.org to obtain an API key
        const val API_KEY = BuildConfig.API_KEY

        //COVERT URL
        const val CONVERT_URL = "convert"
    }

}