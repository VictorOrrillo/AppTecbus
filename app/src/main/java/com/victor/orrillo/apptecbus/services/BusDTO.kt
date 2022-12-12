package com.victor.orrillo.apptecbus.services

import com.google.gson.annotations.SerializedName

data class BusDTO (
    @SerializedName("id") val id: String,
    @SerializedName("ruta") val ruta:String,
    @SerializedName("horario") val horario: String,
    @SerializedName("disponible")  val disponible: Boolean,
    @SerializedName("picture") val picture : String

)