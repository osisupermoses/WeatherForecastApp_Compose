package com.osisupermoses.weatherforecastapp_compose.data.repository

import com.osisupermoses.weatherforecastapp_compose.common.Resource
import com.osisupermoses.weatherforecastapp_compose.data.remote.OpenWeatherMapApi
import com.osisupermoses.weatherforecastapp_compose.data.remote.dto.Weather
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val api: OpenWeatherMapApi
) {

    suspend fun getWeatherInfo(lat: String, lon: String): Flow<Resource<Weather>> = flow {
        try {
            emit(Resource.Loading())
            val apiResponse = api.getWeather(lat, lon)
            emit(Resource.Success(data = apiResponse))
        } catch (e: HttpException) {
            emit(Resource.Error(message = e.localizedMessage ?: "An unexpected error occurred"))
        } catch(e: IOException) {
            emit(Resource.Error(message = "Couldn't reach server. Check your internet connection"))
        } catch (e: Exception) {
            emit(Resource.Error(message = "An error occurred"))
        }
    }
}