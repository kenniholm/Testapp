package com.example.trendlog.Application

import android.app.Application
import com.example.trendlog.DI.AppComponent
import com.example.trendlog.DI.AppModule
import com.example.trendlog.DI.DaggerAppComponent

class testApplication : Application() {

    lateinit var testComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        testComponent = initDagger(this)
    }

    private fun initDagger(app: testApplication): AppComponent =
        DaggerAppComponent.builder().appModule(AppModule(app)).build()
}