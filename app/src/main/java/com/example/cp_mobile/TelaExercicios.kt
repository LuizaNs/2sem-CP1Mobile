package com.example.cp_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaExercicios : AppCompatActivity() {

    lateinit var buttonIntegrantes: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_exercicios)

        buttonIntegrantes = findViewById(R.id.btnIntegrantes)
        buttonIntegrantes.setOnClickListener {
            val navegarIntegrantes = Intent(this, Integrantes::class.java)
            startActivity(navegarIntegrantes)

        }
    }
}