package com.example.myapplication.model


import com.google.gson.annotations.SerializedName

data class ForecastResponseApi(
    @SerializedName("city")
    val city: City?,
    @SerializedName("cod")
    val cod: String?,
    @SerializedName("list")
    val list: List<data>?,
    @SerializedName("message")
    val message: Int?,
    @SerializedName("")
    val x: Int?
) {
    data class City(
        @SerializedName("country")
        val country: String?,
        @SerializedName("id")
        val id: Int?,
        @SerializedName("name")
        val name: String?,
        @SerializedName("population")
        val population: Int?,
        @SerializedName("sunrise")
        val sunrise: Int?,
        @SerializedName("sunset")
        val sunset: Int?,
        @SerializedName("")
        val x: Int?
    )

    data class data(
        @SerializedName("clouds")
        val clouds: Clouds?,
        @SerializedName("main")
        val main: Main?,
        @SerializedName("pop")
        val pop: Double?,
        @SerializedName("rain")
        val rain: Rain?,
        @SerializedName("sys")
        val sys: Sys?,
        @SerializedName("visibility")
        val visibility: Int?,
        @SerializedName("weather")
        val weather: List<Weather?>?,
        @SerializedName("wind")
        val wind: Wind?,
        @SerializedName("")
        val x: String?
    ) {
        data class Clouds(
            @SerializedName("all")
            val all: Int?
        )

        data class Main(
            @SerializedName("humidity")
            val humidity: Int?,
            @SerializedName("pressure")
            val pressure: Int?,
            @SerializedName("temp")
            val temp: Double?,
            @SerializedName("")
            val x: Double?
        )

        data class Rain(
            @SerializedName("3h")
            val h: Double?
        )

        data class Sys(
            @SerializedName("pod")
            val pod: String?
        )

        data class Weather(
            @SerializedName("description")
            val description: String?,
            @SerializedName("icon")
            val icon: String?,
            @SerializedName("id")
            val id: Int?,
            @SerializedName("main")
            val main: String?
        )

        data class Wind(
            @SerializedName("deg")
            val deg: Int?,
            @SerializedName("gust")
            val gust: Double?,
            @SerializedName("speed")
            val speed: Double?,
            @SerializedName("")
            val x: Int?
        )
    }
}