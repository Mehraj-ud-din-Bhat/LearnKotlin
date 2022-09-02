package com.example.learnkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    lateinit var  framentContainer:FragmentContainerView
    lateinit var  login:Button
    lateinit var  signup:Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login=findViewById(R.id.login)
        signup=findViewById(R.id.signup)
        framentContainer=findViewById(R.id.fragmentContainer)



        login.setOnClickListener {
            replaceFragment(FragmentLogin())
        }

        signup.setOnClickListener {
            replaceFragment(SignupFragment())
        }


    }

    fun replaceFragment(fragment: Fragment) {

        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment, "TAG")
        //    fragmentTransaction.addToBackStack(fragment.toString())
        fragmentTransaction.commit()
    }



}