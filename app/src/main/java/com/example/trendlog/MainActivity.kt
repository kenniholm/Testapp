package com.example.trendlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submit(v: View){
        var editText = findViewById<View>(R.id.name1) as EditText
        val Name = editText.text.toString()
        editText = findViewById<View>(R.id.efternavn) as EditText
        val LastName = editText.text.toString()
        display(Name, LastName)
    }
    fun display(text1:String, text2:String){
        val textView = findViewById<View>(R.id.yay) as TextView
        val togethernow = text1 + " " + text2
        textView.text = togethernow

        intent = Intent(this, Main2Activity::class.java)
        intent.putExtra("FullName", togethernow)
        startActivity(intent)
    }
}
