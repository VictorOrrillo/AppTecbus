package com.victor.orrillo.apptecbus

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.victor.orrillo.apptecbus.services.BusDTO
import com.victor.orrillo.apptecbus.services.RutasService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BusRepository(): ViewModel() {
    val busesLive = MutableLiveData<List<BusDTO>>()

    init {
        getDataBuses()
    }

    fun getDataBuses()  {
        CoroutineScope(Dispatchers.IO).launch {
            val call = RutasService.build().getAllRutas()
            if (call.isSuccessful) {
                call.body()?.let {
                    busesLive.postValue(it)
                }
            }
        }

    }
}