package com.example.amirz.weatherapp.util

import com.example.amirz.weatherapp.model.Weather
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by amirz on 3/2/2018.
 */
interface ForumService {

    @GET("weather")
    abstract fun getWeatherInfo(@Query("q") cityName: String, @Query("appid") appid: String): Call<Weather>
}