package com.example.fruitopv0
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Boton para ir a configuraciones
        // Creamos una nueva variable tipo Button y contiene el metodo findViewById(parametros
        // en este caso R.id.idDelBoton)
        val btn: Button = findViewById(R.id.button)
        // a traves de nuestro boton, llamamos a nuestra funcion escucha(lo que este dentro de
        // nombreboton.setOnCLickListener{ }) en este caso a la variable intent y nuestro metodo
        // intent que como parametros es this de esta pantalla a, nombre de la otra pantalla
        // por ultimo con startActivity(intent) activamos nuestro intent
        btn.setOnClickListener {
            val intent: Intent = Intent(this, ConfiguracionesActivity:: class.java)
            startActivity(intent )
        }

        // Boton para ir a niveles
        val btn2: Button = findViewById(R.id.btn_niveles)
        // Llamamos a nuestra funcion escucha
        btn2.setOnClickListener {
            val intent: Intent = Intent(this, NivelesActivity:: class.java)
            startActivity(intent )
        }

        //val btn3: Button = findViewById(R.id.btn_puntuaciones)
        // a traves de nuestro boton, llamamos a nuestra funcion escucha(lo que este dentro de
        // nombreboton.setOnCLickListener{ }) en este caso a la variable intent y nuestro metodo
        // intent que como parametros es this de esta pantalla a, nombre de la otra pantalla
        // por ultimo con startActivity(intent) activamos nuestro intent




    }



}

