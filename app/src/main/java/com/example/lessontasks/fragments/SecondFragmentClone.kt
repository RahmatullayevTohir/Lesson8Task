package com.example.lessontasks.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.lessontasks.R
import com.example.lessontasks.user.User
import java.lang.RuntimeException

class SecondFragmentClone:Fragment() {

    var textView: TextView? = null
    private var listener:SecondListenerClone?= null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.seconds_fragment,container,false)
         textView = view.findViewById(R.id.tv_second)
        var button = view?.findViewById<Button>(R.id.b_second_fragment)
            button!!.setOnClickListener {
                listener!!.onSecondSend(User(30,"Adham"))
        }
        return view

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = if (context is SecondListenerClone) {
            context
        } else {
            throw RuntimeException(context.toString() + "must implement SecondListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface SecondListenerClone{
        fun onSecondSend(user:User)
    }

    fun upadateSecondUser(user: User){
        textView!!.text = "${user.name} ${user.age.toString()+" yosh"}"
    }
}