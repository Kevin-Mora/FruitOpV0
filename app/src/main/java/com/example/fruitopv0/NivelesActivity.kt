package com.example.fruitopv0

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NivelesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.niveles__activity)

        // Boton para ir a a los niveles
        // Creamos una nueva variable tipo Button y contiene el metodo findViewById(parametros
        // en este caso R.id.idDelBoton)
        val btn3: Button = findViewById(R.id.btn_puntuaciones)
        // a traves de nuestro boton, llamamos a nuestra funcion escucha(lo que este dentro de
        // nombreboton.setOnCLickListener{ }) en este caso a la variable intent y nuestro metodo
        // intent que como parametros es this de esta pantalla a, nombre de la otra pantalla
        // por ultimo con startActivity(intent) activamos nuestro intent




        // Boton para ir a nivel UNO
        val btn4: Button = findViewById(R.id.btn_n1)
        // Llamamos a nuestra funcion escucha
        btn4.setOnClickListener {
            val intent: Intent = Intent(this, Nivel1Activity:: class.java)
            startActivity(intent )
        }

    }
}