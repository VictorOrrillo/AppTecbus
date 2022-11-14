package com.victor.orrillo.apptecbus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.victor.orrillo.apptecbus.databinding.ActivityListadoBusesBinding

class ListadoBusesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListadoBusesBinding

    private lateinit var busListRecyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listado_buses)
        setRecyclerView()
    }

    private fun setRecyclerView() {
        busListRecyclerView = binding.busesList
        busListRecyclerView.layoutManager = LinearLayoutManager(this)
        val buses = BusRepository()
        val busesAdapter =BusesAdapter(buses.buses)
        busListRecyclerView.adapter = busesAdapter

    }
}