package com.example.trabajopractico.holders

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.trabajopractico.R

class CarHolder(v: View) : RecyclerView.ViewHolder(v)  {

    private var view: View

    init {
        this.view = v
    }

    fun setClass(clase: String) {
        val txt: TextView = view.findViewById(R.id.txt_class)
        txt.text = clase
    }

    fun setFullCarName(make: String, model: String) {
        val txt: TextView = view.findViewById(R.id.txt_full_car_name)
        txt.text = "$make $model"
    }

    fun setTransmission(transmission: String) {
        val txt: TextView = view.findViewById(R.id.txt_transmission)
        txt.text = transmission
    }

    fun setYear(year: Int) {
        val txt: TextView = view.findViewById(R.id.txt_year)
        txt.text = year.toString()
    }

    fun setFuelType(fuel_type: String) {
        val txt: TextView = view.findViewById(R.id.txt_fuel_type)
        txt.text = fuel_type
    }
}