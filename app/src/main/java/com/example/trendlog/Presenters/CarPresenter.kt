package com.example.trendlog.Presenters

import com.example.trendlog.Model.Car
import com.example.trendlog.Views.Main3Activity
import javax.inject.Inject

class CarPresenter @Inject constructor() {

    fun getTestCars(): ArrayList<Car> {
        var listWithTestCars = arrayListOf<Car>()

        val car1 = Car("Ford Mustang", "Black", 130.33)

        val car2 = Car("Chevy", "Yellow", 120.00)

        listWithTestCars.add(car1)
        listWithTestCars.add(car2)

        return listWithTestCars
    }
}