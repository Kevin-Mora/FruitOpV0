package com.example.fruitopv0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Chronometer
import android.widget.EditText
import android.widget.TextView
import kotlinx.coroutines.delay

class Nivel1Activity : AppCompatActivity() {
    lateinit var  chronometer: Chronometer
    //lateinit var editText: EditText
    //var runningC = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nivel1)

        // varializamos nuestro chronometro por su ID
        chronometer = findViewById(R.id.chronometerId)
        //Lo inicializamos en cuanto entre al nivel
        chronometer.start()

        // varializamos nuestra caja de texto
        //editText = findViewById(R.id.textResultado)
        //var editText = findViewById<EditText>(R.id.textResultado)


        var almacenaEditText = findViewById<EditText>(R.id.textResultado)
        var almacenadaTextView = findViewById<TextView>(R.id.textViewAlmacenado)

        almacenadaTextView.text = almacenaEditText.text

        //Agregamos la funcionalidad del boton
        findViewById<Button>(R.id.btnEnviar).setOnClickListener {

            addResultado(it)


        }




        //editText = "20"

        if (almacenadaTextView.toString() == "50"){
            println("hoolaaaa borolas")
            almacenaEditText.text.clear()
        }
        println("hoola amigo 5")

       // var txt = toString(editText.text)

       // if (toString(editText.text) == "50"){

       // }



        /*
        //textResultado = findViewById(R.id.textResultado)
        chronometer.setOnClickListener {

        }

        chronometer = findViewById(R.id.chronometer)
        */

    }

    private fun addResultado(view: View){


        var almacenaEditText = findViewById<EditText>(R.id.textResultado)
        var almacenadaTextView = findViewById<TextView>(R.id.textViewAlmacenado)
        //var almacenaTextViewUps = findViewById<TextView>(R.id.textViewAlmacenado)
        almacenadaTextView.text = almacenaEditText.text


        if (almacenadaTextView.text.toString() == "50"){
            println("hoolaaaa borolas")
            //delay(3000)
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
        }
        else
            almacenadaTextView.text = ""

        almacenaEditText.text.clear()

        /*
        var editText = findViewById<EditText>(R.id.textResultado)



        //editText = "20"

        if (this.editText.text.toString() == "50"){
            println("hoolaaaa borolas")
        }
     */

    }


}