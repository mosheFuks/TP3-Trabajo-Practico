package com.example.trabajopractico

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class fragment_profile : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.fragment_profile, container, false);
        val userName = vista.findViewById<TextView>(R.id.txtUserName)
        //Obtener el nombre del usuario
        val dataBundle = arguments
        val value = dataBundle!!.getString("userName")!!

        userName.text = value

        return vista

    }
}