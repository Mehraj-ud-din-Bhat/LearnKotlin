package com.example.learnkotlin

import android.content.Context
import android.content.Context.MODE_PRIVATE
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type


class SharedPref {
    companion object{


        fun storeTasks(con:Context,list:ArrayList<Task>)
        {

            val sp= con.getSharedPreferences("tasks",MODE_PRIVATE)

            val editor=sp.edit()
            editor.clear()
            editor.commit()
            val     gson = Gson()
            val tasksJson: String = gson.toJson(list)
            editor.putString("tasksList",tasksJson)
            editor.apply()


        }


        fun getTasks(con: Context):List<Task>
        {
            val type: Type? = object : TypeToken<List<Task>>() {}.type
            val     gson = Gson()


            val sp= con.getSharedPreferences("tasks",MODE_PRIVATE)
            val taskString=sp.getString("tasksList","");
            if(taskString?.length!!>0) {
                val tasks: List<Task> = gson.fromJson(taskString, type)
                return  tasks;
            }
          return  ArrayList()
        }




    }
}