package com.example.trendlog.Views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.trendlog.R

class Main3Activity : AppCompatActivity() {

    private lateinit var _mainlistview: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        _mainlistview = findViewById(R.id.main_listview)
        var customAdapter = ListAdapter(this)
        _mainlistview.adapter = customAdapter

    }
}
