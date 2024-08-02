package com.example.myapplication.viewModel

import androidx.lifecycle.ViewModel
import com.example.myapplication.repository.CityRepository
import com.example.myapplication.server.ApiClient
import com.example.myapplication.server.ApiService

class CityViewModel(val repository: CityRepository) : ViewModel() {
    constructor() : this(CityRepository(ApiClient().getClient().create(ApiService::class.java)))

    fun loadCity(q: String, limit: Int) =
        repository.getCities(q, limit)

}