package com.example.practica8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practica8.Adapter.ParquesAdapter
import com.example.practica8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val manager = LinearLayoutManager(this)

        binding.recycler.layoutManager = manager
        binding.recycler.adapter=ParquesAdapter(ListadoParques.listaParques)
    }
}