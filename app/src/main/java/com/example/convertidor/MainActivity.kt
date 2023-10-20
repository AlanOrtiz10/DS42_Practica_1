package com.example.convertidor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var selectedTemp = findViewById<Spinner>(R.id.temp_options)
        var temp = findViewById<EditText>(R.id.cantidad)
        var button = findViewById<Button>(R.id.convertir)
        var result = findViewById<TextView>(R.id.resultado)


        if(selectedTemp != null){
            val adapter = ArrayAdapter (
                this,
                android.R.layout.simple_spinner_item,
                resources.getStringArray(R.array.convert_options)
            )

            selectedTemp.adapter = adapter
        }

        button.setOnClickListener {

            temp.text
        }

        fun convert(){
            //TODO Crear las conversiones
            //Tarea: Traer las formulas de conversión
        }


    }


}