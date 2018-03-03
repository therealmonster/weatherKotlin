package com.example.amirz.weatherapp.util

import android.app.Application
import android.net.Network

/**
 * Created by amirz on 3/2/2018.
 */
class ApplicationClass:Application() {
    val URL: String = "http://api.openweathermap.org/data/2.5"
     var service: ForumService? =null
    override fun onCreate() {
        super.onCreate()
        init();
    }

    private fun init() {
        service = Network.initRetroFit(URL)
    }
}