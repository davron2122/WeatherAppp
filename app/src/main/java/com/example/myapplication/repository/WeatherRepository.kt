package com.example.myapplication.repository

import com.example.myapplication.server.ApiService

class WeatherRepository (val api:ApiService){

    fun getCurrentRepository(lat: Double, lng:Double, unit:String)=
        api.getCurrentWeather(lat, lng, unit, "7558532c79ae918db4a6928698dc03e2")


}