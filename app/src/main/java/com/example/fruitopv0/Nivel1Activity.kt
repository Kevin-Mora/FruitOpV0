package com.example.fruitopv0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.Chronometer
import android.widget.ImageView

class Nivel1Activity : AppCompatActivity() {

    //
    lateinit var  chronometer: Chronometer
    private lateinit var opera2: ImageView
    //private lateinit var playBtn :ImageView
    var x = 0
    //lateinit var editText: EditText
    //var runningC = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nivel1)

        // varializamos nuestro chronometro por su ID
        chronometer = findViewById(R.id.chronometerId3)
        //Lo inicializamos en cuanto entre al nivel
        chronometer.start()




        // varializamos nuestra caja de texto
        //editText = findViewById(R.id.textResultado)
        //var editText = findViewById<EditText>(R.id.textResultado)


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

    private fun addResultado(view: View){


        var almacenaEditText = findViewById<EditText>(R.id.textResultado3)
        var almacenadaTextView = findViewById<TextView>(R.id.textViewAlmacenado3)

        //var almacenaTextViewUps = findViewById<TextView>(R.id.textViewAlmacenado)
        almacenadaTextView.text = almacenaEditText.text

        //opera2 = findViewById(R.id.btnEnviar)

       // if (x == 1){
         //   opera2.setImageResource(R.drawable.n1op1)
       // }

        //OP1 n1o1 51+15
        if (almacenadaTextView.text.toString() == "66" && x == 0){
            println("hoolaaaa borolas")
            //delay(3000)
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n1op2)
            x++

        }
        else if( x == 0)
            almacenadaTextView.text = ""

        println(x)
        //OP2 n1op2 34+8
        if (x == 1 && almacenadaTextView.text.toString() == "42" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n1op3)
            x++
        }
        else if( x == 1 )
            almacenadaTextView.text = ""


        // NO ESTAN HECHOS AUN ////////////////////////////////////////////////////////////////////
        //OP3 n1op3 34+8
        if (x == 2 && almacenadaTextView.text.toString() == "42" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n1op4)
            x++
        }
        else if( x == 2 )
            almacenadaTextView.text = ""

        //OP4 n1op 29+14
        if (x == 3 && almacenadaTextView.text.toString() == "43" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n1op5)
            x++
        }
        else if( x == 3 )
            almacenadaTextView.text = ""

        //OP5 n1op 36+36
        if (x == 4 && almacenadaTextView.text.toString() == "72" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n1op6)
            x++
        }
        else if( x == 4 )
            almacenadaTextView.text = ""

        //OP6 n1op6 44-36
        if (x == 5 && almacenadaTextView.text.toString() == "8" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n1op7)
            x++
        }
        else if( x == 5 )
            almacenadaTextView.text = ""

        //OP7 n1op 46-26
        if (x == 6 && almacenadaTextView.text.toString() == "20" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n1op8)
            x++
        }
        else if( x == 6 )
            almacenadaTextView.text = ""

        //OP8 n1op 24-18
        if (x == 7 && almacenadaTextView.text.toString() == "6" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n1op9)
            x++
        }
        else if( x == 7 )
            almacenadaTextView.text = ""

        //OP9 n1op 50-37
        if (x == 8 && almacenadaTextView.text.toString() == "13" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡correcto!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.n1op10)
            x++
        }
        else if( x == 8 )
            almacenadaTextView.text = ""

        //OP10 n1op 51-39
        if (x == 9 && almacenadaTextView.text.toString() == "12" ){
            almacenaEditText.text.clear()
            almacenadaTextView.text = "¡Felicidades!"
            //  cambiando el nivel
            opera2.setImageResource(R.drawable.celebracion)  // Poner imagen de felicidades o derivado

        }
        else if( x == 9 )
            almacenadaTextView.text = ""
           // almacenadaTextView.text = "¡Felicidades!"






        almacenaEditText.text.clear()


    }


}