package com.example.trabajopractico

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trabajopractico.adapter.CarListAdapter
import com.example.trabajopractico.entities.Car

class fragment_list : Fragment() {

    lateinit var v: View

    private lateinit var car_list : RecyclerView

    var cars : MutableList<Car> = ArrayList<Car>()

    private lateinit var linearLayoutManager: LinearLayoutManager

    private var contactoListAdapter: CarListAdapter?=null

    companion object {
        fun newInstance() = fragment_list()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_list, container, false)
        car_list = v.findViewById<RecyclerView>(R.id.carList)
        return v
    }

    override fun onStart() {
        super.onStart()

        //Creo la Lista Dinamica
        for (i in 1..5) {
            cars.add(Car("two steated","asdasd","asdasd","adasdasd","asdasd",2012))
            cars.add(Car("two steated","asdasd","asdasd","adasdasd","asdasd",2013))
            cars.add(Car("two steated","asdasd","asdasd","adasdasd","asdasd",2014))
        }

        //Configuración Obligatoria

        car_list.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(context)

        car_list.layoutManager = linearLayoutManager

        car_list.adapter = contactoListAdapter

    }
}