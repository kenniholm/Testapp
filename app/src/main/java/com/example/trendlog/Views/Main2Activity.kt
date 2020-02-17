package com.example.trendlog.Views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.trendlog.R
import kotlinx.android.synthetic.main.activity_main.*

class Main2Activity : AppCompatActivity() {

    private lateinit var _textView: TextView
    private lateinit var _button: Button
    private lateinit var _button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        _textView = findViewById(R.id.textView2)
        _button = findViewById(R.id.button)
        _button2 = findViewById(R.id.button2)

        val testString = intent.getStringExtra("FullName")
        _textView.text = testString
        val startNext = Intent(this, Main3Activity::class.java)

        _button.setOnClickListener{
            Toast.makeText(this,"$testString er sej", Toast.LENGTH_LONG).show()
        }

        _button2.setOnClickListener {
            startActivity(startNext)
        }
    }
}
