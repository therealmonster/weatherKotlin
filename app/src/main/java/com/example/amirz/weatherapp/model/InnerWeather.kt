package com.example.amirz.weatherapp.model

import com.google.gson.annotations.SerializedName

/**
 * Created by amirz on 3/2/2018.
 */
class InnerWeather {
    @SerializedName("description")
    var description:String? = null
}