package com.example.trendlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textView = findViewById(R.id.textView2)
        button = findViewById(R.id.button)

        val testString = intent.getStringExtra("FullName")
        textView.text = testString
        button.setOnClickListener{
            Toast.makeText(this,"$testString er sej", Toast.LENGTH_LONG).show()
        }
    }
}
