package com.example.learnkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ViewInfo : AppCompatActivity() {

    lateinit var  info:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_info)
        info=findViewById(R.id.info)

        var name=intent.getStringExtra("name")
        var phone=intent.getStringExtra("phone")

        info.setText("NAME: ${name}  \n PHONE: ${phone}")
    }
}