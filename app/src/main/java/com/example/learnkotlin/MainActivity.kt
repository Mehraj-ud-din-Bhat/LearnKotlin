package com.example.learnkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
      val TAG="MAIN ACTIVITY STATUS"
      lateinit var  toolbarTitle:TextView;
      lateinit var toolbarIcon: ImageView
      lateinit var  rv_tasks:RecyclerView
      lateinit var  adapter: TaskAdapter
      companion object{
          var list:ArrayList<Task> = ArrayList();

      }






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbarTitle=findViewById(R.id.toolBarTitle)
        toolbarIcon=findViewById(R.id.toolbarIcon)
        rv_tasks=findViewById(R.id.tasks_rv)
        toolbarTitle.text="Task Manager"

        toolbarIcon.setOnClickListener {
            var intent=Intent(this,SecondActivity::class.java);
            startActivity(intent)

        }
       initAdapter()
        Toast.makeText(applicationContext," : Was Clicked",Toast.LENGTH_LONG)

        Log.e(TAG,"In ON CREATE METHOD")

    }


    override fun onResume() {
        super.onResume()
        Log.e(TAG,"In ON Resume")
        adapter.notifyDataSetChanged()
    }
    override fun onStart() {
        super.onStart()
        Log.e(TAG,"In ON START")

    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG,"In ON RE_START")
    }


    override fun onPause() {
        super.onPause()
        Log.e(TAG,"In ON PAUSE")
    }


    override fun onStop() {
        super.onStop()

        Log.e(TAG,"In ON STOP")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG,"In ON Destroy")
    }





    fun initAdapter()
    {
        adapter= TaskAdapter(list,this)
        rv_tasks.layoutManager=LinearLayoutManager(this)
        rv_tasks.adapter=adapter

    }


    fun onTaskClicked(pos:Int)
    {
      Toast.makeText(this, list.get(pos).taskTitle+"WAS CLICKED",Toast.LENGTH_LONG).show()

        /**
         *
         * EXPLICIT INTENT
         */




    }


    fun onDeleteClicked(pos:Int)
    {

        list.removeAt(pos)
        adapter.notifyDataSetChanged()
    }

    fun onEditClicked(pos: Int)
    {
        val intent=Intent(this,SecondActivity::class.java)
        intent.putExtra("taskPosition",pos)
        startActivity(intent)


    }









}