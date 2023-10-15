package com.example.moretech5.presentation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.moretech5.R
import com.example.moretech5.databinding.ActivityMainBinding
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.mapview.MapView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        MapKitFactory.setApiKey("7acffba5-1d1d-4a60-ba13-60ee1ad6ec34")
        MapKitFactory.initialize(this)
        setContentView(R.layout.activity_main)

    }
}