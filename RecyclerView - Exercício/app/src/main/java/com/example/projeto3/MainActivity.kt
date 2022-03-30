package com.example.projeto3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {


    {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }
    }

    private lateinit var binding: ActivityMainBinding

    private lateinit var mainViewModel: MainViewModel

    override fun onCreat(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layotInflater)
        setContentView(binding.root)

        MainViewModel = ViewModelProvider(this).get(MainViewactivity)

        mainViewModel.cont.observe(this) {
            binding.textCont.text = it.toString()
        }
            binding.buttonClique.setOnClickListener{
                mainViewModel.adicionar()
        }

    }
}
