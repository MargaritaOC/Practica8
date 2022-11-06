package com.example.practica8.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practica8.Parques
import com.example.practica8.R

class ParquesAdapter(private val listaParques:List<Parques>): RecyclerView.Adapter<ParquesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParquesViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_parques,parent,false)

        return ParquesViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ParquesViewHolder, position: Int) {
        val item = listaParques[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return listaParques.size
    }
}