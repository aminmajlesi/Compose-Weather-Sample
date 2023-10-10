package com.example.composeweather.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun WeatherCard(
    state: WeatherState,
    backgroundColor : Color,
    modifier: Modifier = Modifier
){
    state.weatherInfo?.currentWeatherData?.let {
        Card(
            //backgroundColor = backgroundColor,
            shape = RoundedCornerShape(10.dp),
            modifier = modifier.padding(16.dp)
        ) {

        }
    }
}
