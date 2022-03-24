package com.osisupermoses.weatherforecastapp_compose.domain.model

data class HourlyWeather(
    val temp: String,
    val imgUrl: String,
    val time: String,
    val highTemp: String,
    val lowTemp: String
)
