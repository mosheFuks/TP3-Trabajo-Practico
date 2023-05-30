package com.example.trabajopractico

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity


class fragment_setting : Fragment(R.layout.fragment_setting) {

    private lateinit var switchNightMode: Switch
    private lateinit var switchNotifications: Switch
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_setting, container, false)

            switchNightMode = view.findViewById(R.id.switchNightMode)
            switchNotifications = view.findViewById(R.id.switchNotifications)

           /* // lógica para manejar los cambios en los Switches
            switchNightMode.setOnCheckedChangeListener { _, isChecked ->
                // Lógica para cambiar al modo nocturno
            }

            switchNotifications.setOnCheckedChangeListener { _, isChecked ->
                // Lógica para activar/desactivar las notificaciones
            }*/

            return view
        }
    }