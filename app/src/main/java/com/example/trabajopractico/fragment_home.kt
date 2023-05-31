package com.example.trabajopractico

import android.graphics.Color
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
import com.example.trabajopractico.adapter.HomeCarCardAdapter
import com.example.trabajopractico.entities.Car
import com.example.trabajopractico.entities.HomeCarCard
import com.example.trabajopractico.services.ActivityServicesApiBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment_home.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment_home : Fragment() {

    lateinit var v: View

    private lateinit var car_list : RecyclerView

    var cars : MutableList<HomeCarCard> = ArrayList()

    private lateinit var linearLayoutManager: LinearLayoutManager

    private lateinit var carListAdapter: HomeCarCardAdapter

    companion object {
        fun newInstance() = fragment_list()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
    fun loadCars() {
            cars.add(HomeCarCard("Deportivo", R.drawable.deportivo, Color.rgb(255, 204, 0)))
            cars.add(HomeCarCard("SUV", R.drawable.suv, Color.rgb(51, 48, 229)))
            cars.add(HomeCarCard("Electricos", R.drawable.electrico, Color.rgb(4, 217, 255)))
    }

        v = inflater.inflate(R.layout.fragment_home, container, false)
        car_list = v.findViewById(R.id.homeCars)
        loadCars()
        Log.d("asd", cars.toString())
        linearLayoutManager = LinearLayoutManager(context)

        car_list.layoutManager = linearLayoutManager

        carListAdapter = HomeCarCardAdapter(cars)

        val recyclerViewTransactions = v.findViewById<RecyclerView>(R.id.homeCars)

        recyclerViewTransactions.adapter = HomeCarCardAdapter(cars)

        return v


    }
}