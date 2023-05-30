package com.example.trabajopractico

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class nav_header : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.nav_header, container, false);
        val headerUserName = vista.findViewById<TextView>(R.id.txtHeaderUserName);
        val dataBundle = arguments
        val value = dataBundle!!.getString("userName")!!
        headerUserName.text = value

        return vista;
    }

}