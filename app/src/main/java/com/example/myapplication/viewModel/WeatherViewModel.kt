package com.example.myapplication.viewModel

import androidx.lifecycle.ViewModel
import com.example.myapplication.repository.WeatherRepository
import com.example.myapplication.server.ApiClient
import com.example.myapplication.server.ApiService
import retrofit2.create

class WeatherViewModel (val repository: WeatherRepository): ViewModel() {

    constructor() : this(WeatherRepository(ApiClient().getClient().create(ApiService::class.java)))

    fun loadCurrentWeather(lat:Double, lng:Double,unit:String )=
        repository.getCurrentRepository(lat, lng, unit)


}