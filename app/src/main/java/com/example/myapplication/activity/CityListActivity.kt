package com.example.myapplication.activity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.R
import com.example.myapplication.databinding.ActivityCityListBinding

class CityListActivity : AppCompatActivity() {

    lateinit var binding: ActivityCityListBinding

    private  val cityAdapter by lazy {  }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding=ActivityCityListBinding.inflate(layoutInflater)
        setContentView(com.example.myapplication.R.layout.activity_city_list)
    }


}