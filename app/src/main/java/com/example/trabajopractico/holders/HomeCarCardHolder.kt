package com.example.trabajopractico.holders

import android.graphics.drawable.Drawable
import android.net.Uri
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.trabajopractico.CarListGenerator
import com.example.trabajopractico.R
import com.squareup.picasso.Picasso
import org.json.JSONArray

class HomeCarCardHolder(v: View) : RecyclerView.ViewHolder(v)  {

    private var view: View

    init {
        this.view = v
    }

    fun setType(type: String) {
        val txt: TextView = view.findViewById(R.id.type)
        txt.text = type
    }

    fun setImage(image: Int) {
        val img: ImageView = view.findViewById(R.id.image)
        img.setImageResource(image)
    }

    fun setColor(color: Int) {
        val card: CardView = view.findViewById(R.id.color)
        card.setCardBackgroundColor(color)
    }


}