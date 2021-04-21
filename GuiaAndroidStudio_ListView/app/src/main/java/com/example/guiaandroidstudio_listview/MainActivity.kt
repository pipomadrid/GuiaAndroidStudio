package com.example.guiaandroidstudio_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //PASO 1 añadimos el listView al xml de la activity dentro de un linearLayout vertical

        //PASO 2 Creamos un arrayAdapter de tipo ArrayAdapter
        val arrayAdapter :ArrayAdapter<*>
        //PASO 3 Creamos los datos que mostraremos en la lista
        val personas = mutableListOf<String>("Pedro", "Sara","Bruno","Marina")
        //PASO 4  Creamos una variable con el listView
        val lvDatos = findViewById<ListView>(R.id.lvDatos)

        //PASO 5 inicializamos el adapter con el contexto, el diseño de la lista , y los datos que se mostrarán
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,personas)
        //PASO 6  establecemos el adapter creado en el listview
        lvDatos.adapter = arrayAdapter

        /*PASO 7 Si queremos que cuando pulse sobre un nobmre de la lsita haga algo tenemos que hacer lo siguiente
        / llamamos al listener de los Item del listview que llevarán los parámetros
            parent--> elemento visual donde están los datos
            view -> la vista
            position --> la posición del elemento con el que estoy trabajando
        id--> el index de ese elemento
         */
        lvDatos.setOnItemClickListener(){parent,view,position,id->

            Toast.makeText(this,parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show()
        }

    }
}