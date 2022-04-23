package com.example.learnkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var studentList:ArrayList<Student>
    lateinit var  adapter: StudentListAdapter
    lateinit var  rvStudents:RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvStudents=findViewById(R.id.rv_students)

          studentList= ArrayList();
          studentList.add(Student("MEHRAJ","849403 jjsjs",R.drawable.myimage))
          studentList.add(Student("VIjAY","999999",R.drawable.img_two))
          studentList.add(Student("Amit","0000000",R.drawable.myimage))
          studentList.add(Student("Louis","357299292",R.drawable.img_two))
        studentList.add(Student("Ben","357299292",R.drawable.myimage))
        studentList.add(Student("Michalis","357299292",R.drawable.img_two))
        adapter= StudentListAdapter(studentList,this)
          rvStudents.adapter=adapter;
           rvStudents.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)


    }


      fun onStudentClicked(student:Student)
      {

         // Toast.makeText(this,""+student.studentName+": WAS CLICKED",Toast.LENGTH_LONG).show()

        var intent=Intent(this,ViewInfo::class.java)
          intent.putExtra("name",student.studentName)
          intent.putExtra("phone",student.studentPhone)
          startActivity(intent)





      }

    fun  onStudentDeleteClicked (student: Student)
    {
        studentList.remove(student)
        adapter.notifyDataSetChanged()
    }



}