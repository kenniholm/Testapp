package com.example.trendlog.Views

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.trendlog.DI.DaggerPresenterComponent
import com.example.trendlog.Presenters.CarPresenter
import com.example.trendlog.R
import javax.inject.Inject

class ListAdapter(context: Context): BaseAdapter() {
    @Inject
    lateinit var carPresenter: CarPresenter
    lateinit var carModelTextView: TextView
    lateinit var carColorTextView: TextView
    lateinit var carSpeedTextView: TextView

        private val _context: Context

        init {
            _context = context
            DaggerPresenterComponent.create().inject(this)
            carModelTextView.findViewById<TextView>(R.id.CarModelName)
            carColorTextView.findViewById<TextView>(R.id.CarColorData)
            carSpeedTextView.findViewById<TextView>(R.id.CarSpeedData)
        }

        // Ansvar for hvor mange rækker der er i listen.
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            var cars = carPresenter.getTestCars()

            val layoutInflater = LayoutInflater.from(_context)
            val rowMain = layoutInflater.inflate(R.layout.row_main3, parent, false)

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
            return 5
        }
}