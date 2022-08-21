package com.example.learnkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Signup : AppCompatActivity() {
     lateinit var name:EditText
     lateinit var email:EditText
     lateinit var password:EditText
     lateinit var signup:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        name=findViewById(R.id.name)
        email=findViewById(R.id.email)
        password=findViewById(R.id.password)
        signup=findViewById(R.id.signup)


        signup.setOnClickListener {
//            THIS CODE WOULD BE EXECUTED ONLY WHEN I CLICK CREATE ACCOUNT


              val  user=User(name.text.toString(),email.text.toString(),password.text.toString())
              Login.list.add(user)
              finish()



        }
    }
}