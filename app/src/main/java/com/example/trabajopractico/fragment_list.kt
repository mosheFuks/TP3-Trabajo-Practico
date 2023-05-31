package com.example.trabajopractico

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.trabajopractico.services.ActivityServicesApiBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trabajopractico.adapter.CarListAdapter
import com.example.trabajopractico.entities.Car

class fragment_list : Fragment() {

    lateinit var v: View

    private lateinit var car_list : RecyclerView

    var cars : List<Car> = ArrayList()

    private lateinit var linearLayoutManager: LinearLayoutManager

    private lateinit var contactoListAdapter: CarListAdapter

    companion object {
        fun newInstance() = fragment_list()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        fun loadCars() {
            val service = ActivityServicesApiBuilder.create()
            service.getCars().enqueue(object: Callback<List<Car>> {
                override fun onResponse(call: Call<List<Car>>, response: Response<List<Car>>){
                    if(response.isSuccessful){
                        val apiResponse = response.body()!!
                        cars = apiResponse

                        car_list.setHasFixedSize(true)
                        linearLayoutManager = LinearLayoutManager(context)

                        car_list.layoutManager = linearLayoutManager
                        Log.d("CARS apiResponse!=null", cars.toString())
                        contactoListAdapter = CarListAdapter(cars)
                        car_list.adapter = contactoListAdapter


                        Log.d("CARS", apiResponse.toString())

//                        for (data in apiResponse!!.list!!) {
//                            simpsonsCharactersList.add(data)
//                        }
//                        recyclerViewCharachter.adapter = APIListAdapter(simpsonsCharactersList)
                    }
                }

                override fun onFailure(call: Call<List<Car>>, t: Throwable) {
                    Log.e("CARS", "no anda nada")
                }

            })
        }

        v = inflater.inflate(R.layout.fragment_list, container, false)
        car_list = v.findViewById(R.id.carList)
        loadCars()
        return v
    }

//    override fun onStart() {
//        super.onStart()
//        //Configuración Obligatoria
//
//        car_list.setHasFixedSize(true)
//        linearLayoutManager = LinearLayoutManager(context)
//
//        car_list.layoutManager = linearLayoutManager
//        Log.d("CARS onStart", cars.toString())
//        contactoListAdapter = CarListAdapter(cars)
//        car_list.adapter = contactoListAdapter
//    }
}