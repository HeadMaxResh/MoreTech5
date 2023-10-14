package com.example.moretech5.app

import android.app.Application
import com.yandex.mapkit.MapKit
import com.yandex.mapkit.MapKitFactory
import com.yandex.maps.mobile.BuildConfig

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        MapKitFactory.setApiKey("7acffba5-1d1d-4a60-ba13-60ee1ad6ec34")
    }
}