package com.example.practica8.Adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.practica8.Parques
import com.example.practica8.databinding.ItemParquesBinding

class ParquesViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val binding = ItemParquesBinding.bind(view)
    fun render(parquetsModel: Parques) {
        binding.NombreParque.text = parquetsModel.nombre
        binding.DescripcionParque.text = parquetsModel.descripcion
        Glide.with(binding.imagen.context).load(parquetsModel.foto).into(binding.imagen)
        binding.imagen.setOnClickListener {
            Toast.makeText(
                binding.imagen.context,
                parquetsModel.nombre,
                Toast.LENGTH_SHORT
            ).show()
        }
        itemView.setOnClickListener {
            Toast.makeText(
                binding.imagen.context,
                parquetsModel.nombre,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}