package com.example.learnkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
     lateinit var  layout1:RelativeLayout
     lateinit var  layout2:RelativeLayout
     lateinit var  submit:Button
     lateinit var  logout:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layout1=findViewById(R.id.layout_1)
        layout2=findViewById(R.id.layout_2)
        submit=findViewById(R.id.signinbutton)
        logout=findViewById(R.id.logout)

        layout1.visibility= View.VISIBLE
        layout2.visibility= View.GONE
        submit.setOnClickListener {
            layout1.visibility= View.GONE
            layout2.visibility= View.VISIBLE
        }

        logout.setOnClickListener {
            layout1.visibility= View.VISIBLE
            layout2.visibility= View.GONE
        }

    }









}