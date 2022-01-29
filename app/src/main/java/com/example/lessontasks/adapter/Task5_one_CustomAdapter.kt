package com.example.lessontasks.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lessontasks.R

class Task5_one_CustomAdapter:RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.task5_first_item,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is CustomViewHolder){
            holder.itemView.findViewById<TextView>(R.id.tv_task5_first)
        }
    }

    override fun getItemCount() = 20

    class CustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }
}