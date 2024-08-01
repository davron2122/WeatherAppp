package com.example.myapplication.repository

import com.example.myapplication.server.ApiService

class CityRepository(val api : ApiService) {
fun getCities(q: String, limit: Int)=
    api.getCitiesList (q, limit, "7558532c79ae918db4a6928698dc03e2")
}