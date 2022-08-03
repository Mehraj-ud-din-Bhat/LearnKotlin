package com.example.learnkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var info:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        info=findViewById(R.id.info)
        var intentData=intent;
        var name=intentData.getStringExtra("name");
        info.text="I AM SECOND ACTIVITY: MAIN ACTIVITY SENT ME THIS $name"


    }
}