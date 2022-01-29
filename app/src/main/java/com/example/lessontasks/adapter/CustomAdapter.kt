package com.example.lessontasks.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lessontasks.R
import com.example.lessontasks.Task3Activity
import com.example.lessontasks.fragments.FirstFragment
import com.example.lessontasks.fragments.Task3_one_Fragment
import com.example.lessontasks.fragments.Task3_two_Fragment
import com.example.lessontasks.user.Person
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class CustomAdapter(val activity: Task3Activity, val persons: ArrayList<Person>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    private var listener: Task3_one_Fragment.Task3FirstListener? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact_layout,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val person = persons.get(position)

        if (holder is CustomViewHolder){
            holder.lay_item.setOnClickListener{
                listener?.onTask3FirstSend(person.name)
            }
            holder.textView.text = person.name
            holder.textViewNum.text = person.number.toString()
        }
    }

    override fun getItemCount(): Int {
        return persons.size
    }

    class CustomViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val lay_item = itemView.findViewById<LinearLayout>(R.id.layout_item)
        val textView = itemView.findViewById<TextView>(R.id.tv_name)
        val textViewNum = itemView.findViewById<TextView>(R.id.tv_number)
    }
}