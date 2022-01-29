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

class FirstFragment : Fragment() {

    var textView: TextView? = null
    private var listener: FirstListener? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.first_fragment, container, false)
        textView = view.findViewById(R.id.tv_first)
        val button1 = view.findViewById<Button>(R.id.b_first_fragment)
        button1.setOnClickListener {
            listener!!.onFirstSend("Nodir")
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


    fun updateFirstText(str: String?) {
        textView!!.text = str
    }

    interface FirstListener {
        fun onFirstSend(str: String?)
    }
}