package com.example.lessontasks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        var button1 = findViewById<Button>(R.id.task1)
        var button2 = findViewById<Button>(R.id.task2)
        var button3 = findViewById<Button>(R.id.task3)
        var button4 = findViewById<Button>(R.id.task4)
        var button5 = findViewById<Button>(R.id.task5)

        button1.setOnClickListener {
            openTask1Activity()
        }

        button2.setOnClickListener {
            openTask2Activity()
        }
//
        button3.setOnClickListener {
            openTask3Activity()
        }
//
        button4.setOnClickListener {
            openTask4Activity()
        }
//
        button5.setOnClickListener {
            openTask5Activity()
        }
    }

    private fun openTask1Activity() {
        val intent = Intent(this,Task1Activity::class.java)
        startActivity(intent)
    }

    private fun openTask2Activity() {
        val intent = Intent(this,Task2Activity::class.java)
        startActivity(intent)
    }
//
    private fun openTask3Activity() {
        val intent = Intent(this,Task3Activity::class.java)
        startActivity(intent)
    }
//
    private fun openTask4Activity() {
        val intent = Intent(this,Task4Activity::class.java)
        startActivity(intent)
    }
//
    private fun openTask5Activity() {
        val intent = Intent(this,Task5Activity::class.java)
        startActivity(intent)
    }


}