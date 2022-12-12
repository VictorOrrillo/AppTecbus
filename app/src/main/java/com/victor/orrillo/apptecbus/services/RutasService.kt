package com.victor.orrillo.apptecbus.services

import android.annotation.SuppressLint
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers


interface RutasService {

    @Headers("Content-Type: application/json")
    @GET("rutas")
    suspend fun getAllRutas(): Response<List<BusDTO>>

    companion object {
        @SuppressLint("SuspiciousIndentation")
        fun build(): RutasService {
            val retrofit = Retrofit.Builder()
                    // cambiar ip
                .baseUrl("http://192.168.1.21:8080/api/v1/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

                    return retrofit.create(RutasService::class.java)
        }
    }
}