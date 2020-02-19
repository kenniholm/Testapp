package com.example.trendlog.Views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.trendlog.R

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var editEfternavn: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.name1)
        editEfternavn = findViewById(R.id.efternavn)
        button = findViewById(R.id.button1)
        // Første års projekt med lambda i UI
        button.setOnClickListener{
            submit()
        }

    }

    fun submit(){
        val Name = editText.text.toString()
        val LastName = editEfternavn.text.toString()
        display(Name, LastName)
    }
    fun display(text1:String, text2:String){
        val togethernow = text1 + " " + text2
        intent = Intent(this, Main2Activity::class.java)
        intent.putExtra("FullName", togethernow)
        startActivity(intent)
    }
}
