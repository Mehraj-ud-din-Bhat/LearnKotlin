package com.example.learnkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
     lateinit var userName:EditText
     lateinit var userEmail:EditText
     lateinit var userPhone:EditText
     lateinit var userAddress:EditText
     lateinit var submit:Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userName=findViewById(R.id.userName)
        userEmail=findViewById(R.id.userEmail);
        userPhone=findViewById(R.id.userMobile)
        userAddress=findViewById(R.id.userAddress)
        submit=findViewById(R.id.submit)
        submit.setOnClickListener {
            var status=validate();

            if(status==true)
            {
                // Everything is fine proceed further
                Toast.makeText(this,"I am ready to send the form",Toast.LENGTH_LONG).show()

               moveScreen()



            }

        }

        Log.d("ACTIVITY STATUS: ","ON CREATE");







    }


    override fun onStart() {
        super.onStart()

        Log.d("ACTIVITY STATUS: ","ON START CALLED");
    }

    override fun onResume() {
        super.onResume()
        Log.d("ACTIVITY STATUS: ","ON RESUME ");
    }

    override fun onPause() {
        super.onPause()
        Log.d("ACTIVITY STATUS: ","ON PAUSE");
    }

    override fun onStop() {
        super.onStop()
        Log.d("ACTIVITY STATUS: ","ON STOP");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ACTIVITY STATUS: ","ON DESTROY");
    }


    fun  moveScreen()
    {
        var intent=Intent(this,ViewInfo::class.java)
        intent.putExtra("name",userName.text.toString())
        intent.putExtra("email",userEmail.text.toString())
        intent.putExtra("phone",userPhone.text.toString())
        intent.putExtra("address",userAddress.text.toString())
        startActivity(intent)
    }


    fun  validate():Boolean{

        if(userName.text.toString().isEmpty())
        {
           userName.setError("Please enter user name")
            return  false
        }


        if(userEmail.text.toString().isEmpty())
        {
            userEmail.setError("Please enter Email")
            return  false
        }


        if(userPhone.text.toString().isEmpty())
        {
            userPhone.setError("Please enter your phone number")
            return  false
        }


        if(userAddress.text.toString().isEmpty())
        {
            userAddress.setError("Please enter address")
            return  false
        }

        return  true;


    }
}