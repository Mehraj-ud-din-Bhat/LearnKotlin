package com.example.learnkotlin

import android.content.Context
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class TaskAdapter( val  list:ArrayList<com.example.learnkotlin.Task>,val mainActivity: MainActivity) : RecyclerView.Adapter<TaskAdapter.Task>() {




    class  Task(item:View) : RecyclerView.ViewHolder(item){
        lateinit var  taskTitle:TextView
        lateinit var  taskDesc:TextView
        lateinit var viewGroup:View
         var  edit:ImageView
         var  delete:ImageView
        init {
            taskTitle=item.findViewById(R.id.task_title)
            taskDesc=item.findViewById(R.id.task_desc)
            viewGroup=item.findViewById(R.id.viewGroup)
            edit=item.findViewById(R.id.edit)
            delete=item.findViewById(R.id.delete)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Task {
        val taskView=LayoutInflater.from(parent.context).inflate(R.layout.item_task,parent,false)
        return  TaskAdapter.Task(taskView)

    }

    override fun onBindViewHolder(holder: Task, position: Int) {
        holder.taskTitle.text=list.get(position).taskTitle
        holder.taskDesc.text=list.get(position).taskDescription

        holder.viewGroup.setOnClickListener {

          mainActivity.onTaskClicked(position)


        }

        holder.delete.setOnClickListener {
            mainActivity.onDeleteClicked(position)
        }

        holder.edit.setOnClickListener {
            mainActivity.onEditClicked(position)
        }





    }

    override fun getItemCount(): Int {
     return  list.size
    }
}