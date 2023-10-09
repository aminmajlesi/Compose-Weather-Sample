package com.example.composeweather.data.mappers

import com.example.composeweather.domain.weather.WeatherData

data class IndexedWeatherData(
    val index: Int,
    val data: WeatherData
)

