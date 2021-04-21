package com.example.guiaandroidstudio_fragments2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.guiaandroidstudio_fragments2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),OnFragmentActionListener {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //PASO 1 Creamos los botones para caragar los Fragments
        binding.btnRed.setOnClickListener { replaceFragment(RedFragment()) }
        //PASO 3 Añadimos la función loadFragment o replaceFragment al clickListener de los botones
        binding.btnBlue.setOnClickListener { replaceFragment(BlueFragment()) }
        }
    override fun onClickFragmentButton() {
        Toast.makeText(this, "El botón ha sido pulsado", Toast.LENGTH_SHORT).show()
    }
    /*PASO 2
    //Esta función serviría para añadir fragments , pero al iniciar uno el otro moriría y al darle
    //hacia atras no volverá al fragment anterior, para ello usaremos la funcion replacefragment

    private fun loadFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction() // les estamo indicacndo que vamos a comenzar una transacción
        fragmentTransaction.add(R.id.fragmentContainer, fragment) //añadimos dentro del framelayout con id  fragmentContainer el fragment que le pasemos
        fragmentTransaction.commit() // confirmamos la transacción

     */
    //PASO 2
    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction() //les estamos indicacando que vamos a comenzar una transacción
        fragmentTransaction.replace(R.id.fragmentContainer, fragment) //reemplazamos  dentro del framelayout con id fragmentContainer el fragment que le pasemos
        fragmentTransaction.addToBackStack(null) // Le indicamos que queremos poder ir hacia atrás en el backstack
        fragmentTransaction.commit() // confirmamos la transacción



    }





}