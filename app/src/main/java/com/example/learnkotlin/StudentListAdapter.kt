package com.example.learnkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class StudentListAdapter() : RecyclerView.Adapter<StudentListAdapter.StudentViewHolder>() {

     lateinit var studentList:ArrayList<Student>
     lateinit var  mainActivity: MainActivity


     constructor(studentList:ArrayList<Student>,mainActivity: MainActivity) : this() {
         this.studentList=studentList
         this.mainActivity=mainActivity;

     }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.item_student,parent ,false)
        return  StudentViewHolder(view);
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
           holder.phone.setText(studentList.get(position).studentPhone)
           holder.studentName.setText(studentList.get(position).studentName)
            holder.studentImage.setBackgroundResource(studentList.get(position).imageurl)
           holder.root.setOnClickListener {

                mainActivity.onStudentClicked(studentList.get(position))
           }

        holder.deleteIcon.setOnLongClickListener(View.OnLongClickListener {

            mainActivity.onStudentDeleteClicked(studentList.get(position))
            true
        })
    }

    override fun getItemCount(): Int {
      return this.studentList.size
    }


    class  StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var studentName:TextView=itemView.findViewById(R.id.name)
        var phone:TextView=itemView.findViewById(R.id.phone)
        var  root:View=itemView.findViewById(R.id.root)
        var deleteIcon:ImageView=itemView.findViewById(R.id.deleteIcon)
        var studentImage:ImageView=itemView.findViewById(R.id.studentImage)
    }
}




