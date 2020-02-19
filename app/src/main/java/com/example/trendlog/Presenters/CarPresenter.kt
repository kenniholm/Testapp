package com.example.trendlog.Presenters

import com.example.trendlog.Model.Car
import javax.inject.Inject

class CarPresenter @Inject constructor() {

    fun getTestCars(): ArrayList<Car> {
        var listWithTestCars = arrayListOf<Car>()

        val car1 = Car("Ford Mustang", "Black", 130.33)

        val car2 = Car("Chevy", "Yellow", 120.00)

        val car3 = Car("Ferrari", "Red", 300.00)

        val car4 = Car("MiniCooper", "Orange", 44.44)

        val car5 = Car("Porsche", "Black", 150.00)

        val car6 = Car("Volvo", "White", 666.00)

        val car7 = Car("volkswagen", "Yellow", 160.66)

        val car8 = Car("BMW", "Silver", 300.00)

        val car9 = Car("Opel", "Red", 100.00)

        val car10 = Car("Mercedes", "Black", 350.00)

        listWithTestCars.add(car1)
        listWithTestCars.add(car2)
        listWithTestCars.add(car3)
        listWithTestCars.add(car4)
        listWithTestCars.add(car5)
        listWithTestCars.add(car6)
        listWithTestCars.add(car7)
        listWithTestCars.add(car8)
        listWithTestCars.add(car9)
        listWithTestCars.add(car10)

        return listWithTestCars
    }
}