package com.rickyslash.mapsmapboxapp

import android.app.Application
import com.mapbox.mapboxsdk.Mapbox

open class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Mapbox.getInstance(applicationContext, getString(R.string.maps_public_token))
    }
}