package com.example.trabajopractico.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trabajopractico.R
import com.example.trabajopractico.entities.HomeCarCard
import com.example.trabajopractico.holders.CarHolder
import com.example.trabajopractico.holders.HomeCarCardHolder

class HomeCarCardAdapter(
    private var carLista: MutableList<HomeCarCard>
) : RecyclerView.Adapter<HomeCarCardHolder>() {

    override fun getItemCount(): Int {
        return carLista.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeCarCardHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.fragment_home_car_card,parent,false)
        return (HomeCarCardHolder(view))
    }

    override fun onBindViewHolder(holder: HomeCarCardHolder, position: Int) {
        holder.setType(carLista[position].type)
        holder.setImage(carLista[position].image)
        holder.setColor(carLista[position].color)
    }
}