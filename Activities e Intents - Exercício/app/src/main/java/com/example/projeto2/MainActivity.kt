package com.example.projeto2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoD6 = findViewById<Button>(R.id.buttond6)
        val intentnext = Intent(this, mainD12::class.java)
        val botaonext = findViewById<Button>(R.id.buttond2)


        botaoD6.setOnClickListener {

            sorteardados(6)
        }

        botaonext.setOnClickListener {
            startActivity(intentnext)
        }

    }

    private fun sorteardados(lados: Int) {
        val valor = (1..lados).random()
        val texto = findViewById<TextView>(R.id.textView)
        texto.text = valor.toString()


        val imagemR = Imgtodoslados(valor)
        val imagemdado = findViewById<ImageView>(R.id.Imagemdado)
        imagemdado.setImageResource(imagemR)

    }

    private fun Imgtodoslados(valor: Int): Int {
        return when (valor) {

            1 -> R.drawable.dado1
            2 -> R.drawable.dado2
            3 -> R.drawable.dado3
            4 -> R.drawable.dado4
            5 -> R.drawable.dado5
            else -> R.drawable.dado6

        }


    }
}














