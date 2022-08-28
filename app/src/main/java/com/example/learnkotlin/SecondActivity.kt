package com.example.learnkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.text.FieldPosition

class SecondActivity : AppCompatActivity() {
    lateinit var  toolbarTitle:TextView;
    lateinit var toolbarIcon: ImageView
    lateinit var  taskEt:EditText
    lateinit var  button: Button
    lateinit var  taskTitle: EditText
    var  taskPosition: Int =-1;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        toolbarTitle=findViewById(R.id.toolBarTitle)
        toolbarIcon=findViewById(R.id.toolbarIcon)
        taskEt=findViewById(R.id.task_et)
        taskTitle=findViewById(R.id.task_title)
        button=findViewById(R.id.save_task)
        toolbarIcon.setImageDrawable(getDrawable(R.drawable.icon_close))

        taskPosition=intent.getIntExtra("taskPosition",-1)


        if(taskPosition != -1)
        {

            /**
             *  UPDATE TASK SECTION
             *
             *  It Means that we need to edit the task
             */
            var task=  MainActivity.list.get(taskPosition)
            taskTitle.setText(task.taskTitle)
            taskEt.setText(task.taskDescription)
            button.setText("Update Task")
            toolbarTitle.setText("Update Task")


        }


        toolbarIcon.setOnClickListener {
            finish()
        }


        if(taskPosition== -1 )
        toolbarTitle.text="Add New Task"


        button.setOnClickListener {


            if(taskTitle.text.length==0)
            {
                Toast.makeText(SecondActivity@this,"Please Enter Task Title",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if(taskEt.text.toString().length==0)
            {
                Toast.makeText(SecondActivity@this,"Please Enter Task Description",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }


            /**
             *
             * USER HAS ENTERED THE TASK
             */



            var task=Task()

            task.taskDescription  =taskEt.text.toString();

            task.taskTitle=    taskTitle.text.toString();


            if(taskPosition==-1) {
                MainActivity.list.add(task);
            }else{
                var task=  MainActivity.list.get(taskPosition)
                task.taskDescription  =taskEt.text.toString();
                task.taskTitle=    taskTitle.text.toString();
            }
            finish()



        }


    }
}