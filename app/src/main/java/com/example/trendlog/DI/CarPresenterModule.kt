package com.example.trendlog.DI

import com.example.trendlog.Presenters.CarPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CarPresenterModule {
    @Provides
    @Singleton
    fun provideCarPresenter(): CarPresenter = CarPresenter()
}