package com.example.cp_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Integrantes : AppCompatActivity() {

    lateinit var buttonTelaInicial: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_integrantes)

        buttonTelaInicial = findViewById(R.id.btnTelaInicial)
        buttonTelaInicial.setOnClickListener {
            val navegarTelaInicial = Intent(this, MainActivity::class.java)
            startActivity(navegarTelaInicial)
        }
    }
}