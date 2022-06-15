package com.example.materialdesigningexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var imageView:ImageView=findViewById(R.id.imageview)
        imageView.setOnClickListener {
            var intent=Intent(applicationContext,MainActivity4::class.java)
            startActivity(intent)
        }
    }
}