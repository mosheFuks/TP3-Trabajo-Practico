package com.example.trabajopractico.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trabajopractico.R
import com.example.trabajopractico.entities.Car
import com.example.trabajopractico.holders.CarHolder

class CarListAdapter(
    private var carLista: MutableList<Car>
) : RecyclerView.Adapter<CarHolder>() {

    override fun getItemCount(): Int {
        return carLista.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.car_list_item,parent,false)
        return (CarHolder(view))
    }

    override fun onBindViewHolder(holder: CarHolder, position: Int) {
        holder.setClass(carLista[position].`class`)

    }
}