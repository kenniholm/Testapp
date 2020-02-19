package com.example.trendlog.DI

import com.example.trendlog.Views.ListAdapter
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, CarPresenterModule::class])
interface AppComponent {
    fun inject(target: ListAdapter){

    }
}