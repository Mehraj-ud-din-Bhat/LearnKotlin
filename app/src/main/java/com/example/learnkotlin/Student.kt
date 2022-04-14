package com.example.learnkotlin

class Student {
    lateinit var studentName:String
    lateinit var studentPhone:String

    constructor(name:String,phone:String)
    {
        this.studentName=name
        this.studentPhone=phone;
    }
}