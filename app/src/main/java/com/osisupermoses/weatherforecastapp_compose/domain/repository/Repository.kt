package com.osisupermoses.weatherforecastapp_compose.domain.repository

import com.osisupermoses.weatherforecastapp_compose.common.Resource
import com.osisupermoses.weatherforecastapp_compose.data.remote.dto.Weather
import kotlinx.coroutines.flow.Flow

interface Repository {

    suspend fun getWeatherInfo(lat: String, lon: String): Flow<Resource<Weather>>
}