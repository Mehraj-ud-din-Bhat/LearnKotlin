package com.example.learnkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class SecondActivity : AppCompatActivity() {
    lateinit var  toolbarTitle:TextView;
    lateinit var toolbarIcon: ImageView
    lateinit var  taskEt:EditText
    lateinit var  button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        toolbarTitle=findViewById(R.id.toolBarTitle)
        toolbarIcon=findViewById(R.id.toolbarIcon)
        taskEt=findViewById(R.id.task_et)
        button=findViewById(R.id.save_task)
        toolbarIcon.setImageDrawable(getDrawable(R.drawable.icon_close))

        toolbarIcon.setOnClickListener {
            finish()
        }


        toolbarTitle.text="Add New Task"


        button.setOnClickListener {
            if(taskEt.text.toString().length==0)
            {
                Toast.makeText(SecondActivity@this,"Please enter task",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }


            /**
             *
             * USER HAS ENTERED THE TASK
             */



            var task=Task()
            var a:Int;
            task.taskDescription=taskEt.text.toString();
            MainActivity.list.add(task);
            finish()



        }


    }
}