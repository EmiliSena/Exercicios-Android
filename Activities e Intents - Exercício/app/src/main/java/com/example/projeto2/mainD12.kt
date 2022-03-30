package com.example.projeto2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class mainD12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_d12)

        val botaoD12 = findViewById<Button>(R.id.button4)
        val intentNext = Intent(this, MainActivity20::class.java)
        val botaoNext = findViewById<Button>(R.id.botaonext)

        botaoNext.setOnClickListener {
            startActivity(intentNext)


        }
        val botaovoltar = findViewById<Button>(R.id.botaovoltar)
        botaovoltar.setOnClickListener {
            finish()


        }

         botaoD12.setOnClickListener {
              sorteardados(12)

         }


    }

    private fun sorteardados(lados:Int) {
        val valor = (1..lados).random()
        val texto = findViewById<TextView>(R.id.textView2)
        texto.text = valor.toString()

    }
}


