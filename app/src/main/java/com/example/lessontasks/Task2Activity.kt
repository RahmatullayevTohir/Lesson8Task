package com.example.lessontasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lessontasks.fragments.FirstFragmentClone
import com.example.lessontasks.fragments.SecondFragmentClone
import com.example.lessontasks.user.User

class Task2Activity : AppCompatActivity(), FirstFragmentClone.FirstListener,
    SecondFragmentClone.SecondListenerClone {

    val TAG = Task2Activity::class.java.toString()
    var firstFragmentClone: FirstFragmentClone? = null
    var secondFragmentClone: SecondFragmentClone? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task2)
        initViews()
    }

    override fun onFirstSend(user: User) {
       secondFragmentClone!!.upadateSecondUser(user)
    }

    override fun onSecondSend(user: User) {
        firstFragmentClone!!.upadateFristUser(user)
    }

    fun initViews() {
        firstFragmentClone = FirstFragmentClone()
        secondFragmentClone = SecondFragmentClone()
        supportFragmentManager.beginTransaction().replace(R.id.frameFirst, firstFragmentClone!!)
            .replace(R.id.frameSecond, secondFragmentClone!!).commit()
    }
}