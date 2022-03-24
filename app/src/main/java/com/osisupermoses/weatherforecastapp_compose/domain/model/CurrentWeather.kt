package com.osisupermoses.weatherforecastapp_compose.domain.model

data class CurrentWeather(
    val currentDate: String,
    val currentWeatherType: String,
    val currentTemp: String,
    val currentImgUrl: String,
    val currentHumidity: String,
    val currentUV: String
)