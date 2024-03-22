package com.example.myapplication



package com.example.calculo_desconto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
package com.example.calculo_desconto



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // criando variaveis com formatos fechados
        val entrada: EditText
        val saida: EditText
        val calcular: Button
        // Chamando as variaveis do activity_main
        entrada = findViewById<View>(R.id.valorBrutoEntrada) as EditText
        saida = findViewById<View>(R.id.valorSaida) as EditText
        calcular = findViewById<View>(R.id.calcular) as Button

        calcular.setOnClickListener {
            val string = entrada.text.toString()
            val moeda = string.toInt()
            val i = moeda - 5
            val decimal = i.toString()
            saida.setText(decimal)
        }
    }
    }

