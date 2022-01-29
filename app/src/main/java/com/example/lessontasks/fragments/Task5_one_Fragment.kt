package com.example.lessontasks.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lessontasks.R
import com.example.lessontasks.adapter.CustomAdapter
import com.example.lessontasks.adapter.Task5_one_CustomAdapter

class Task5_one_Fragment: Fragment() {

    private lateinit var context1:Context
    private var recyclerView:RecyclerView?=null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.task5_first_layout,container,false)
        initViews(view)

        return view
    }

    private fun initViews(view: View) {
        recyclerView = view.findViewById(R.id.recyclerView_task5_first)
        recyclerView!!.layoutManager = GridLayoutManager(context,1)
        recyclerView!!.adapter = Task5_one_CustomAdapter()
    }

}