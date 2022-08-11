package com.example.learnkotlin

import android.content.Intent
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var b1:Button
    lateinit var b2:Button

      companion object{
          var list:ArrayList<Task> = ArrayList();

      }






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1=findViewById(R.id.b1)
        b2=findViewById(R.id.b2)
        b1.setOnClickListener {
            b1.backgroundTintList= ColorStateList.valueOf(resources.getColor(R.color.pink));
            b1.setTextColor(resources.getColor(R.color.white))

            b2.backgroundTintList= ColorStateList.valueOf(resources.getColor(R.color.white));
            b2.setTextColor(resources.getColor(R.color.black))
        }
        b2.setOnClickListener {
            b2.backgroundTintList= ColorStateList.valueOf(resources.getColor(R.color.pink));
            b2.setTextColor(resources.getColor(R.color.white))

            b1.backgroundTintList= ColorStateList.valueOf(resources.getColor(R.color.white));
            b1.setTextColor(resources.getColor(R.color.black))
        }











    }

    override fun onResume() {
        super.onResume()




    }









}