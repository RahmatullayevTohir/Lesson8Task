package com.example.lessontasks.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.lessontasks.R

class Task3_one_Fragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.task3_one_fragment,container,false)
        return view
    }



    interface Task3FirstListener {
        fun onTask3FirstSend(str: String?)
    }
}