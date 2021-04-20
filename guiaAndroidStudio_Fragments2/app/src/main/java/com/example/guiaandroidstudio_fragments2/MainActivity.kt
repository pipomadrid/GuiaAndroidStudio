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

        binding.btnRed.setOnClickListener { replaceFragment(RedFragment()) }
        binding.btnBlue.setOnClickListener { replaceFragment(BlueFragment()) }
        }
    override fun onClickFragmentButton() {
        Toast.makeText(this, "El botón ha sido pulsado", Toast.LENGTH_SHORT).show()
    }
    /*
    //Esta función serviría para añadir fragments , pero al iniciar uno el otro moriría y al darle
    //hacia atras no volverá al fragment anterior, para ello usaremos la funcion replacefragment

    private fun loadFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction() // les estamo indicacndo que vamos a comenzar una transacción
        fragmentTransaction.add(R.id.fragmentContainer, fragment) //añadimos dentro del fragmentContainer el fragment que le pasemos
        fragmentTransaction.commit() // confirmamos la transacción

     */
    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction() //les estamos indicacndo que vamos a comenzar una transacción
        fragmentTransaction.replace(R.id.fragmentContainer, fragment) //reemplazamos  dentro del fragmentContainer el fragment que le pasemos
        fragmentTransaction.addToBackStack(null) // Le indicamos que queremos poder ir hacia atrás en el backstack
        fragmentTransaction.commit() // confirmamos la transacción



    }





}