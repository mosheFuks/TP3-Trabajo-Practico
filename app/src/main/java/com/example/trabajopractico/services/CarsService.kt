package com.example.trabajopractico.services

import com.example.trabajopractico.entities.Car
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface CarsService {
    @Headers("X-Api-Key: 8rzv6uDX8hCMD/cH1nVv+g==SyC9W1j1RLVWQ8FH")
    @GET("cars?limit=10&fuel_type=gas")
    fun getCars(): Call<List<Car>>
}
