package com.example.myapplication.server

import androidx.viewpager2.widget.ViewPager2.OffscreenPageLimit
import com.example.myapplication.model.CityResponseApi
import com.example.myapplication.model.CurrentResponseApi
import com.example.myapplication.model.ForecastResponseApi
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
// current weather
    @GET("data/2.5/weather")
    fun getCurrentWeather(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("units") units: String,
        @Query("appid") ApiKey: String,
    ): Call<CurrentResponseApi>

// forecast for future
    @GET("data/2.5/forecast")
    fun getForecastWeather(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("units") units: String,
        @Query("appid") ApiKey: String,
    ): Call<ForecastResponseApi>

// cities in the world
    @GET("geo/1.0/direct")
    fun getCitiesList(
        @Query("q") q: String,
        @Query("limit") limit: Int,
        @Query("appid") ApiKey: String
    ): Call<CityResponseApi>


}