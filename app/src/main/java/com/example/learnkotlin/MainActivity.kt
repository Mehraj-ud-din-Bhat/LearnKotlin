package com.example.learnkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
      lateinit var  toolbarTitle:TextView;
      lateinit var toolbarIcon: ImageView
      lateinit var tasks_tv:TextView
      companion object{
          var list:ArrayList<Task> = ArrayList();

      }






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbarTitle=findViewById(R.id.toolBarTitle)
        toolbarIcon=findViewById(R.id.toolbarIcon)
        tasks_tv=findViewById(R.id.tasks_tv)


        toolbarTitle.text="Task Manager"

        toolbarIcon.setOnClickListener {
            var intent=Intent(this,SecondActivity::class.java);
            startActivity(intent)

        }








    }

    override fun onResume() {
        super.onResume()
        tasks_tv.text="";
        for(task in list)
        {
            tasks_tv.text=tasks_tv.text.toString() + task.taskDescription+"\n";
        }
    }









}