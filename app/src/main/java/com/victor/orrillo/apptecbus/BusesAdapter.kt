package com.victor.orrillo.apptecbus

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.victor.orrillo.apptecbus.databinding.ItemBusBinding

class BusesAdapter(
    private val listbuses : List <Bus>,
) : RecyclerView.Adapter<BusesAdapter.BusViewHolder>() {

    class BusViewHolder(
        private val binding : ItemBusBinding
    ): RecyclerView.ViewHolder(binding.root)
    {
        val picture : ImageView =binding.pictureImage
        val rutas : TextView = binding.rutasText
        val additionalText :TextView = binding.aditionalText
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BusViewHolder {
        val itemBusBinding = ItemBusBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BusViewHolder(itemBusBinding)
    }

    override fun onBindViewHolder(holder: BusViewHolder, position: Int) {
        val bus : Bus = listbuses[position]

        val context = holder.itemView.context

        val idRes = context.resources.getIdentifier(bus.picture, "drawable", context.packageName)

        holder.rutas.text = bus.rutas
        holder.picture.setImageResource(idRes)
        holder.itemView.setOnClickListener {
            Toast.makeText(context, " ${bus.rutas} ", Toast.LENGTH_SHORT).show()
        }
        holder.additionalText.visibility = View.VISIBLE
    }

    override fun getItemCount(): Int {
        return listbuses.size
    }

}