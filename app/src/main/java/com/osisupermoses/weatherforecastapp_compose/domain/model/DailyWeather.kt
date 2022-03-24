package com.osisupermoses.weatherforecastapp_compose.domain.model

data class DailyWeather(
    val day: String = "",
    val img: String,
    val weatherType: String,
    val maxTemp: String,
    val minTemp: String
)
