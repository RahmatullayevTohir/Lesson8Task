package com.example.lessontasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lessontasks.fragments.FirstFragment
import com.example.lessontasks.fragments.SecondFragment

class Task1Activity : AppCompatActivity(), FirstFragment.FirstListener,
    SecondFragment.SecondListener {

    val TAG = Task1Activity::class.java.toString()
    var fristFragmant: FirstFragment? = null
    var secondFragment: SecondFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task1)
        initViews()
    }

    override fun onFirstSend(str: String?) {
        secondFragment!!.updateSecondText(str)
    }

    override fun onSecondSend(malumot: String?) {
        fristFragmant!!.updateFirstText(malumot)
    }

    private fun initViews() {
        fristFragmant = FirstFragment()
        secondFragment = SecondFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameFirst, fristFragmant!!)
            .replace(R.id.frameSecond, secondFragment!!)
            .commit()
    }
}