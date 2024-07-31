package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncDifferConfig
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.myapplication.databinding.ForecastViewholderBinding
import com.example.myapplication.model.ForecastResponseApi
import java.text.SimpleDateFormat

class ForecastAdapter  : RecyclerView.Adapter<ForecastAdapter.ViewHolder>(){
    private lateinit var binding: ForecastViewholderBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastAdapter.ViewHolder {
       val inflator =LayoutInflater.from(parent.context)
        binding= ForecastViewholderBinding.inflate(inflator, parent,false)
        return ViewHolder()

    }

    override fun onBindViewHolder(holder: ForecastAdapter.ViewHolder, position: Int) {
        val binding=ForecastViewholderBinding.bind(holder.itemView)
        val data = SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").parse(differ.currentList[position])

    }
    inner class ViewHolder : RecyclerView.ViewHolder(binding.root)

    override fun getItemCount()=differ.currentList.size

    }

    private val differCallback=object : DiffUtil.ItemCallback<ForecastResponseApi.data>() {
        override fun areItemsTheSame(
            oldItem: ForecastResponseApi.data,
            newItem: ForecastResponseApi.data
        ): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: ForecastResponseApi.data,
            newItem: ForecastResponseApi.data
        ): Boolean {
            oldItem == newItem
        }

    }
    val differ=AsyncListDiffer(this,differCallback)

}
