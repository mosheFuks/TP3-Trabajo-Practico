package com.example.trabajopractico.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.trabajopractico.CarListGenerator
import com.example.trabajopractico.R
import com.squareup.picasso.Picasso
import org.json.JSONArray

class CarHolder(v: View) : RecyclerView.ViewHolder(v)  {

    private var view: View

    init {
        this.view = v
    }

    fun setClass(clase: String) {
        val txt: TextView = view.findViewById(R.id.txt_class)
        txt.text = mayusFirstLetter(clase)
    }

    fun setFullCarName(make: String, model: String) {
        val txt: TextView = view.findViewById(R.id.txt_full_car_name)
        val mayusMake = mayusFirstLetter(make)
        val mayusModel = mayusFirstLetter(model)
        txt.text = "$mayusMake $mayusModel"
    }

    fun setTransmission(transmission: String) {
        val txt: TextView = view.findViewById(R.id.txt_transmission)
        val realTransmissionName: String = if (transmission=="m") {
            "Manual"
        } else {
            "Automatic"
        }
        txt.text = realTransmissionName
    }

    fun setYear(year: Int) {
        val txt: TextView = view.findViewById(R.id.txt_year)
        txt.text = year.toString()
    }

    fun setFuelType(fuel_type: String) {
        val txt: TextView = view.findViewById(R.id.txt_fuel_type)
        txt.text = mayusFirstLetter(fuel_type)
    }

    private fun mayusFirstLetter (text: String) : String  {
        val primeraLetraMayus = text[0].toString().uppercase()
        val sinPrimeraLetra = text.substring(1, text.length)
        return "$primeraLetraMayus$sinPrimeraLetra"
    }
    private fun buscarValorEspecifico(jsonArray: JSONArray?, slug: String): String? {
        if (jsonArray != null) {
            for (i in 0 until jsonArray.length()) {
                val jsonObject = jsonArray.getJSONObject(i)
                val elementoSlug = jsonObject.optString("slug")
                val logo = jsonObject.optString("logo")

                if (elementoSlug == slug) {
                    return logo
                }
            }
        }
        return null
    }
    fun setGravatar(make: String) {
        val jsonArray = CarListGenerator.createCarListJson()
        val carLogoUrl = buscarValorEspecifico(jsonArray,make)

        val imageView = view.findViewById<ImageView>(R.id.gravatarCarId)
        Picasso.get()
            .load(carLogoUrl)
            .into(imageView)
    }
}