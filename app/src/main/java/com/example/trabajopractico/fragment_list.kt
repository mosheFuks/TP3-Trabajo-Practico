package com.example.trabajopractico

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.trabajopractico.entites.Cars
import com.example.trabajopractico.services.ActivityServicesApiBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class fragment_list : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.fragment_list, container, false)

        fun loadCars() {
            val service = ActivityServicesApiBuilder.create()
            service.getCars().enqueue(object: Callback<List<Cars>> {
                override fun onResponse(call: Call<List<Cars>>, response: Response<List<Cars>>){
                    if(response.isSuccessful){
                        val apiResponse = response.body()!!
                        Log.d("CARS", apiResponse.toString())
//                        for (data in apiResponse!!.list!!) {
//                            simpsonsCharactersList.add(data)
//                        }
//                        recyclerViewCharachter.adapter = APIListAdapter(simpsonsCharactersList)
                    }
                }

                override fun onFailure(call: Call<List<Cars>>, t: Throwable) {
                    Log.e("CARS", "no anda nada")
                }

            })
        }

        loadCars()

        return vista
    }
}