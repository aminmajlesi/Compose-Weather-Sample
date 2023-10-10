package com.example.composeweather.domain.repository

import com.example.composeweather.domain.util.Resource
import com.example.composeweather.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}