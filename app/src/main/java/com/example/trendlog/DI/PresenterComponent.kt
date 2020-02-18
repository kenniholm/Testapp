package com.example.trendlog.DI

import com.example.trendlog.Presenters.CarPresenter
import com.example.trendlog.Views.ListAdapter
import dagger.Component

@Component
interface PresenterComponent {
    fun inject(myAdapter: ListAdapter)
}