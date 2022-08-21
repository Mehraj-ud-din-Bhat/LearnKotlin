package com.example.learnkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
     lateinit var  email:EditText
     lateinit var  password:EditText
     lateinit var  login:Button
     lateinit var  signup:Button


    companion object{
        val list=ArrayList<User>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        login = findViewById(R.id.login)
        signup = findViewById(R.id.signup)



        signup.setOnClickListener {
             signup()

        }

        login.setOnClickListener {
            login()
        }

    }


    fun signup()
    {
        val intent=Intent(this,Signup::class.java)
        startActivity(intent)
    }


    fun login()
    {
        val email=email.text.toString()
        val password=password.text.toString()
        var isFound:Boolean=false

        var  mainUser:User?=null

        for(user in list)
        {
            if(user.email.equals(email) )
            {

                if(user.password.equals(password))
                {
                    mainUser=user;
                    isFound=true;

                }else{
                    Toast.makeText(this,"Your Password is Incorrect",Toast.LENGTH_LONG).show()
                }



            }



        }

        if(isFound==true)
        {
            Toast.makeText(this,"USER FOUND : ${mainUser?.name}",Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this,"USER NOT FOUND",Toast.LENGTH_LONG).show()
        }


    }
}