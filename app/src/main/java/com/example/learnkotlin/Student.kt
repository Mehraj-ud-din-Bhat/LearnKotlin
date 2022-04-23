package com.example.learnkotlin

class Student {
    lateinit var studentName:String
    lateinit var studentPhone:String
 var imageurl:Int


    constructor(studentName: String, studentPhone: String, imageurl: Int) {
        this.studentName = studentName
        this.studentPhone = studentPhone
        this.imageurl = imageurl
    }


}