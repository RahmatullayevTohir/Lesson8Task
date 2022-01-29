package com.example.lessontasks

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lessontasks.adapter.CustomAdapter
import com.example.lessontasks.fragments.Task3_one_Fragment
import com.example.lessontasks.fragments.Task3_two_Fragment
//import com.example.lessontasks.adapter.CustomAdapter
import com.example.lessontasks.user.Person

class Task3Activity : AppCompatActivity(),Task3_one_Fragment.Task3FirstListener {

    private lateinit var context: Context
    private var recyclerView: RecyclerView? = null

    var oneFragment : Task3_one_Fragment? = null
    var twoFragment : Task3_two_Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task3)

        initViews()

        val persons = prepareUserList()
        refreshAdapter(persons)
    }

    private fun refreshAdapter(persons: ArrayList<Person>){
        val adapter = CustomAdapter(this, persons)
        recyclerView!!.adapter = adapter
    }



    private fun prepareUserList(): ArrayList<Person> {
        val persons = ArrayList<Person>()
        for (i in 1..30){
            persons.add(Person("Tohir"+i,998990026 +i,))
        }
        return persons
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView!!.layoutManager=GridLayoutManager(this,1)
        oneFragment = Task3_one_Fragment()
        twoFragment = Task3_two_Fragment()
        supportFragmentManager.beginTransaction().replace(R.id.frameTask3First, oneFragment!!)
            .replace(R.id.frameTask3Second,twoFragment!!).commit()

    }

    override fun onTask3FirstSend(str: String?) {
        twoFragment!!.updateTask3SecondText(str)
    }

}