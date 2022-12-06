package com.victor.orrillo.apptecbus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.victor.orrillo.apptecbus.databinding.ActivityListadoBusesBinding

class ListadoBusesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListadoBusesBinding

    private lateinit var busListRecyclerView : RecyclerView

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
        val buses = BusRepository()
        val busesAdapter =BusesAdapter(buses.buses)
        busListRecyclerView.adapter = busesAdapter

    }

    fun regresarInicio(view: View) {
        val intent = Intent(this,InicioActivity::class.java).apply { }
        startActivity(intent)
    }
}