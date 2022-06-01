package com.example.fruitopv0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Nivel3Activity : AppCompatActivity() {

    //
    lateinit var  chronometer: Chronometer
    private lateinit var opera2: ImageView
    //private lateinit var playBtn :ImageView
    var x = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nivel3)

        // varializamos nuestro chronometro por su ID
        chronometer = findViewById(R.id.chronometerId3)
        //Lo inicializamos en cuanto entre al nivel
        chronometer.start()



        var almacenaEditText = findViewById<EditText>(R.id.textResultado3)
        var almacenadaTextView = findViewById<TextView>(R.id.textViewAlmacenado3)
        //playBtn
        opera2 = findViewById(R.id.imageViewN3)

        almacenadaTextView.text = almacenaEditText.text

        //Agregamos la funcionalidad del boton
        findViewById<Button>(R.id.btnEnviar3).setOnClickListener {

            addResultado(it)



        }

    }



    // Funcion para niveles
    private fun addResultado(view: View){


        var almacenaEditText = findViewById<EditText>(R.id.textResultado3)
        var almacenadaTextView = findViewById<TextView>(R.id.textViewAlmacenado3)

        //var almacenaTextViewUps = findViewById<TextView>(R.id.textViewAlmacenado)
        almacenadaTextView.text = almacenaEditText.text


        //OP1
        if (almacenadaTextView.text.toString() == "5" && x == 0){
            println("hoolaaaa borolas")
            //delay(3000)
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n3op2)
            x++

        }
        else if( x == 0)
            almacenadaTextView.text = ""

        println(x)
        //OP2
        if (x == 1 && almacenadaTextView.text.toString() == "8" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n3op3)
            x++
        }
        else if( x == 1 )
            almacenadaTextView.text = ""



        //OP3
        if (x == 2 && almacenadaTextView.text.toString() == "16" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n3op4)
            x++
        }
        else if( x == 2 )
            almacenadaTextView.text = ""

        //OP4
        if (x == 3 && almacenadaTextView.text.toString() == "140" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n3op5)
            x++
        }
        else if( x == 3 )
            almacenadaTextView.text = ""


        //OP10
        if (x == 4 && almacenadaTextView.text.toString() == "165" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡Felicidades!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.celebracion)  // Poner imagen de felicidades o derivado

        }
        else if( x == 4 )
            almacenadaTextView.text = ""







        almacenaEditText.text.clear()


    }


}