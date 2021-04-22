package com.example.guiaandroidstudio_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.guiaandroidstudio_recyclerview.adapter.MyAdapter
import com.example.guiaandroidstudio_recyclerview.data.DataSource
import com.example.guiaandroidstudio_recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)



        // creamos una lista con la funcion de la clase Datasource
        val  lista = DataSource().cargarCartasPokemon()

        // Creamos un recycler  vinculandolo con el xml
        val recyclerView = binding.rvPrueba

        //adapter es el equvalete a setAdapter con el que pasamos un adpater al recycler creado con los parámetros
        //necesarios de nuestra clase MyAdapter creada anteriormente
        recyclerView.adapter = MyAdapter(this ,lista)
        recyclerView.setHasFixedSize(true)





    }
}