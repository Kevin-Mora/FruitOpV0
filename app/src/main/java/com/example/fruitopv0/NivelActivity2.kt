package com.example.fruitopv0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class NivelActivity2 : AppCompatActivity() {

    // Definimos variables
    lateinit var  chronometer: Chronometer
    private lateinit var opera2: ImageView
    var x = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nivel2)

        // varializamos nuestro chronometro por su ID
        chronometer = findViewById(R.id.chronometerId2)
        //Lo inicializamos en cuanto entre al nivel
        chronometer.start()




        var almacenaEditText = findViewById<EditText>(R.id.textResultado2)
        var almacenadaTextView = findViewById<TextView>(R.id.textViewAlmacenado2)
        //playBtn
        opera2 = findViewById(R.id.imageViewN2)

        almacenadaTextView.text = almacenaEditText.text

        //Agregamos la funcionalidad del boton
        findViewById<Button>(R.id.btnEnviar2).setOnClickListener {

            addResultado(it)



        }



    }


    // Funcion de los niveles
    private fun addResultado(view: View){


        var almacenaEditText = findViewById<EditText>(R.id.textResultado2)
        var almacenadaTextView = findViewById<TextView>(R.id.textViewAlmacenado2)

        //var almacenaTextViewUps = findViewById<TextView>(R.id.textViewAlmacenado)
        almacenadaTextView.text = almacenaEditText.text


        //OP1
        if (almacenadaTextView.text.toString() == "112" && x == 0){
            println("hoolaaaa borolas")
            //delay(3000)
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n2op2)
            x++

        }
        else if( x == 0)
            almacenadaTextView.text = ""

        println(x)
        //OP2
        if (x == 1 && almacenadaTextView.text.toString() == "40" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n1op3)
            x++
        }
        else if( x == 1 )
            almacenadaTextView.text = ""


        //OP3
        if (x == 2 && almacenadaTextView.text.toString() == "64" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n1op4)
            x++
        }
        else if( x == 2 )
            almacenadaTextView.text = ""

        //OP4
        if (x == 3 && almacenadaTextView.text.toString() == "4" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n1op5)
            x++
        }
        else if( x == 3 )
            almacenadaTextView.text = ""

        //OP5
        if (x == 4 && almacenadaTextView.text.toString() == "11" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n1op6)
            x++
        }
        else if( x == 4 )
            almacenadaTextView.text = ""

        //OP6
        if (x == 5 && almacenadaTextView.text.toString() == "60" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n1op7)
            x++
        }
        else if( x == 5 )
            almacenadaTextView.text = ""

        //OP7
        if (x == 6 && almacenadaTextView.text.toString() == "66" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n1op8)
            x++
        }
        else if( x == 6 )
            almacenadaTextView.text = ""

        //OP8
        if (x == 7 && almacenadaTextView.text.toString() == "180" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n1op9)
            x++
        }
        else if( x == 7 )
            almacenadaTextView.text = ""

        //OP9
        if (x == 8 && almacenadaTextView.text.toString() == "240" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n1op10)
            x++
        }
        else if( x == 8 )
            almacenadaTextView.text = ""

        //OP10
        if (x == 9 && almacenadaTextView.text.toString() == "48" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡Felicidades!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.celebracion)  // Poner imagen de felicidades o derivado

        }
        else if( x == 9 )
            almacenadaTextView.text = ""
            //almacenadaTextView.text = "¡Felicidades!"




        almacenaEditText.text.clear()


    }
}