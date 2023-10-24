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

        val selectedTemp = findViewById<Spinner>(R.id.temp_options)
        val temp = findViewById<EditText>(R.id.cantidad)
        val button = findViewById<Button>(R.id.convertir)
        val result = findViewById<TextView>(R.id.resultado)

        if (selectedTemp != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                resources.getStringArray(R.array.convert_options)
            )
            selectedTemp.adapter = adapter
        }

        button.setOnClickListener {
            convert(temp.text.toString(), result)
        }
    }

    fun convert(celsiusString: String, result: TextView) {
        // °C to °F Formula
        if (celsiusString.isNotEmpty()) {
            val celsius = celsiusString.toDouble()
            val fahrenheit = (celsius * 9 / 5) + 32
            result.text = "Resultado: $fahrenheit °F"
        } else {
            result.text = "Ingresa un valor válido en grados Celsius."
        }

     fun convertCK(CelsiusK: String, result: TextView){
         // °C to °K
         if(CelsiusK.isNotEmpty()){
             val celsiusK = CelsiusK.toDouble()
             val kelvin = (celsiusK + 273.15)
             result.text = "Resultado: $kelvin °K"
         } else {
            result.text = "Ingresa un valor válido en grados Kelvin."
        }
     }
        //°F a °C: Celsius (°C) = (Fahrenheit (°F) - 32) × 5/9
        //°F a °K: Kelvin (K) = (Fahrenheit (°F) - 32) × 5/9 + 273.15
        //°K a °C: Celsius (°C) = Kelvin (K) - 273.15
        //°K a °F: Fahrenheit (°F) = (Kelvin (K) - 273.15) × 9/5 + 32



    }
}
