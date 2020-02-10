package com.example.trendlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle:Bundle = intent.getBundleExtra("FullName")
        val string = bundle.get("FullName")
        var textView = findViewById<View>(R.id.textView2)
        // Set text data from prev view


    }



}
