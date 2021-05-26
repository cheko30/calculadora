package com.spo.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var numberOne: EditText
    lateinit var numberTwo: EditText
    lateinit var result: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberOne = findViewById(R.id.txtOneNumber)
        numberTwo = findViewById(R.id.txtTwoNumber)
        result = findViewById(R.id.txtResultado)
    }

    fun sumar(view: View) {
        var resultado: Int = numberOne.text.toString().toInt() + numberTwo.text.toString().toString().toInt()
        result.setText(resultado.toString())
    }

    fun restar(view: View) {
        var resultado: Int = numberOne.text.toString().toInt() - numberTwo.text.toString().toString().toInt()
        result.setText(resultado.toString())
    }
    fun multiplicar(view: View) {
        var resultado: Int = numberOne.text.toString().toInt() * numberTwo.text.toString().toString().toInt()
        result.setText(resultado.toString())
    }
    fun dividir(view: View) {
        var resultado: Int = numberOne.text.toString().toInt() / numberTwo.text.toString().toString().toInt()
        result.setText(resultado.toString())
    }

}