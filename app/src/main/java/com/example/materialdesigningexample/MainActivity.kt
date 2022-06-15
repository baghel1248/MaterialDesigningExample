package com.example.materialdesigningexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button:Button=findViewById(R.id.button)
        button.setOnClickListener {
            var intent=Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}