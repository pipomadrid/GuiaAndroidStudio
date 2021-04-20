package com.example.guiaandroidstudio_fragments

import android.content.Context
import com.example.guiaandroidstudio_fragments.R


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.guiaandroidstudio_fragments.OnFragmentActionsListener



class RedFragment : Fragment() {

    // paso 4 -->creamos una variable para que contenga el listener
    private var listener: OnFragmentActionsListener?=null




    //paso 5 --> inicializamos la varible listener pasandole el contexto que implementa el listener
    // en este caso la mainActivity
    override fun onAttach(context: Context) {
        super.onAttach(context)// llamamos al super para que continúe realziando las funciones del
        //padre mas las que impementaremos nosotros
        if(context is OnFragmentActionsListener){ //Comprobamos que el contexto contenga la interfaz
            listener = context // Inicilizamos la variable con el contexto
        }
    }
    //paso 6 --> al desonectar el fragment de la activity ponemos listener nulo para evitar problemas
    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_red, container, false)
    }
    //Paso 7 --> ejecutamos la función de la interfaz cuando el botón del fragmento sea pulsado
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btnPlus2).setOnClickListener {
            listener?.onClickFragmentButton()
        }

    }



}