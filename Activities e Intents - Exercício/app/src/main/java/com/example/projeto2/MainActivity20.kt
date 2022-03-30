package com.example.projeto2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity20 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main20)
        val BotaoD20 = findViewById<Button>(R.id.BotaoD20)
        val BotaoVoltar = findViewById<Button>(R.id.BotaoVoltar)



        BotaoVoltar.setOnClickListener {
            finish()


        }

        BotaoD20.setOnClickListener {
            sorteardados(20)

        }


    }

    private fun sorteardados(lados:Int) {
        val valor = (1..lados).random()
        val texto = findViewById<TextView>(R.id.textView3)
        texto.text = valor.toString()

    }
}

