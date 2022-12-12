package com.victor.orrillo.apptecbus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.victor.orrillo.apptecbus.databinding.ActivityListadoBusesBinding
import com.victor.orrillo.apptecbus.services.BusDTO

class ListadoBusesActivity : AppCompatActivity() {
    private var buses : List<BusDTO> = emptyList()

    private lateinit var binding: ActivityListadoBusesBinding

    private lateinit var busListRecyclerView : RecyclerView
    private val adapter by lazy { BusesAdapter(buses)}

    private val repo by lazy { BusRepository()}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListadoBusesBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)
        setRecyclerView()
    }

    private fun setRecyclerView() {
        busListRecyclerView = binding.busesList
        busListRecyclerView.layoutManager = LinearLayoutManager(this)


        repo.busesLive.observe(this) {
            Log.i("buses", it.get(0).toString())

            adapter.listbuses = it
            adapter.notifyDataSetChanged()

        }

        busListRecyclerView.adapter = adapter

    }
}