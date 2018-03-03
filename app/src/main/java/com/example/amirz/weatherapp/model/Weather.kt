package com.example.amirz.weatherapp.model

import com.google.gson.annotations.SerializedName

/**
 * Created by amirz on 3/2/2018.
 */
class Weather {
    @SerializedName("name")
    var cityName:String?= null
    var main:Main? =null
    @SerializedName("weather")
    var innerWeather: ArrayList<InnerWeather>? = null
}