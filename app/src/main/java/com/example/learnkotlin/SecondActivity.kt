package com.example.learnkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var  toolbarTitle:TextView;
    lateinit var toolbarIcon: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        toolbarTitle=findViewById(R.id.toolBarTitle)
        toolbarIcon=findViewById(R.id.toolbarIcon)
        toolbarIcon.setImageDrawable(getDrawable(R.drawable.icon_close))

        toolbarIcon.setOnClickListener {
            finish()
        }

        toolbarTitle.text="Add New Task"



    }
}