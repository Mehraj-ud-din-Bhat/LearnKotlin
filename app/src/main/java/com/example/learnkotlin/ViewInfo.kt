package com.example.learnkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView

class ViewInfo : AppCompatActivity() {

   lateinit  var viewInfo:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_info)
        viewInfo=findViewById(R.id.info)
        var name=intent.getStringExtra("name")
        var email=intent.getStringExtra("email")
        var phone=intent.getStringExtra("phone")
        var  address=intent.getStringExtra("address")
        var info="Your Name Is : ${name} \n Email: ${email} \n Phone: ${phone} \n Adddress: ${address}"
        viewInfo.setText(info)



    }



}