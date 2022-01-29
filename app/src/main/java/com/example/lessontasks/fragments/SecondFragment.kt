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
import java.lang.RuntimeException

class SecondFragment: Fragment() {

    var textView: TextView? = null
    private var listener: SecondListener? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View = inflater.inflate(R.layout.seconds_fragment,container, false)

        textView = view.findViewById(R.id.tv_second)
        val button1 = view.findViewById<Button>(R.id.b_second_fragment)
        button1.setOnClickListener {
            listener!!.onSecondSend("Umid")
        }

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = if (context is SecondListener) {
            context
        } else {
            throw RuntimeException(context.toString() + "must implement FirstListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    fun updateSecondText(malumot: String?) {
        textView!!.text = malumot
    }

    interface SecondListener {
        fun onSecondSend(malumot: String?)
    }
}