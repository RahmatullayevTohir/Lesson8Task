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

class FirstFragmentClone: Fragment() {

    var textView:TextView? = null
    private var listener:FirstListener? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.first_fragment,container,false)
        textView = view?.findViewById(R.id.tv_first)
        var button = view?.findViewById<Button>(R.id.b_first_fragment)
        button?.setOnClickListener {
            listener!!.onFirstSend(User(22,"Sarvar"))
        }
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = if (context is FirstListener) {
            context
        } else {
            throw RuntimeException(context.toString() + "must implement SecondListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface FirstListener{
        fun onFirstSend(user:User)
    }

    fun upadateFristUser(user: User){
        textView!!.text = "${user.name} ${user.age.toString()+" yosh"}"
    }

}