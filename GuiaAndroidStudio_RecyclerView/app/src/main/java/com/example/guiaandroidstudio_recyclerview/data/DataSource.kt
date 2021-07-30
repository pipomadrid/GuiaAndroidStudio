package com.example.guiaandroidstudio_recyclerview.data

import com.example.guiaandroidstudio_recyclerview.R
import com.example.guiaandroidstudio_recyclerview.model.CartasPokemon

class DataSource {


 // realizamos una función que devolverá una lista de cartas pokemon y que utilzaremos en la main activity
    fun cargarCartasPokemon():List<CartasPokemon>{

        return listOf(

            CartasPokemon(R.string.pikachu,R.drawable.cartapikachu),
            CartasPokemon(R.string.Miutu,R.drawable.cartamiutu),
            CartasPokemon(R.string.charizar,R.drawable.cartacharizar),
            CartasPokemon(R.string.turtonator,R.drawable.turtonator),
            CartasPokemon(R.string.mega_charizard,R.drawable.mega_charizard)

        )




    }
}