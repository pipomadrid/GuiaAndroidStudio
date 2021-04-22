package com.example.guiaandroidstudio_recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.RecyclerView
import com.example.guiaandroidstudio_recyclerview.R
import com.example.guiaandroidstudio_recyclerview.model.CartasPokemon


// Clase para instanciar en la main activity , lleva como parámetros el contexto y los datos
// en este caso la lista de cartas pokemon y debe extender de Recyclerview.Adapter
class MyAdapter(private val context: Context,private val lista:List<CartasPokemon>):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {



 // clase que se encargará de contener y gestionar las vistas o controles asociados a cada elemento individual de la lista
    //en este caso gestiona las vistas del texto y de la imagen
    class MyViewHolder(val view: View):RecyclerView.ViewHolder(view){

        val texto:TextView = view.findViewById(R.id.tvNombre)
        val imagen:ImageView = view.findViewById(R.id.ivImagen)

    }

    // Llama a este método siempre que necesita crear una ViewHolder nueva.
    // El método crea y, luego, inicializa la ViewHolder y su View asociada,
    // pero no completa el contenido de la vista; aún no se vinculó la ViewHolder con datos específicos.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
    val adapterLayout = LayoutInflater.from(context).inflate(R.layout.item_pokemon,parent,false)
        return  MyViewHolder(adapterLayout)
    }


    // vincula los datos de cada elemento del datasource(listas en este caso) con las vistas correspondientes
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = lista[position]
        holder.texto.text = context.resources.getString(item.idNombre)
        holder.imagen.setImageResource(item.idImagen)


    }

    override fun getItemCount()= lista.size
}