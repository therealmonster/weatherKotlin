package com.example.amirz.weatherapp.util

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.URL

/**
 * Created by amirz on 3/2/2018.
 */
class Network {
    var ForumService initRetroFit(URL:String){
        return Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create(initGson))
                .build()
                .create(ForumService)
    }
}