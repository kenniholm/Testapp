package com.example.trendlog.Views

import android.app.Application
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.trendlog.Application.testApplication
import com.example.trendlog.Presenters.CarPresenter
import com.example.trendlog.R
import javax.inject.Inject

class ListAdapter(context: Context): BaseAdapter() {

    //@Inject lateinit var carPresenter: CarPresenter
    private lateinit var carModelTextView: TextView
    private lateinit var carColorTextView: TextView
    private lateinit var carSpeedTextView: TextView
    private var _context: Context
    private val cars = CarPresenter().getTestCars()
    //var cars = CarPresenter().getTestCars()

    init {

        _context = context

        }

        // Ansvar for hvor mange rækker der er i listen.
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {


            val layoutInflater = LayoutInflater.from(_context)
            val rowMain = layoutInflater.inflate(R.layout.row_main3, parent, false)

            carModelTextView = rowMain.findViewById(R.id.CarModelData)
            carColorTextView = rowMain.findViewById(R.id.CarColorData)
            carSpeedTextView = rowMain.findViewById(R.id.CarSpeedData)

            carModelTextView.text = cars[position].model
            carColorTextView.text = cars[position].color
            carSpeedTextView.text = cars[position].topSpeed.toString()

            return rowMain
        }

        override fun getItem(position: Int): Any {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
        //
        override fun getItemId(position: Int): Long {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
        // Ansvar for at render hver række
        override fun getCount(): Int {

            return cars.count()
        }
}