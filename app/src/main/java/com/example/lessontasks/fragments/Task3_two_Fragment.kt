package com.example.lessontasks.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.lessontasks.R

class Task3_two_Fragment: Fragment() {

    lateinit var tv_import_name : TextView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.task3_two_fragment,container,false)
        tv_import_name = view.findViewById(R.id.tv_import_name)
        return view
    }
    fun updateTask3SecondText(str: String?) {
        tv_import_name.text = str
    }
}