package com.example.cp_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var buttonTelaExercicios:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        buttonTelaExercicios = findViewById(R.id.btnProxPagina)
        buttonTelaExercicios.setOnClickListener{
            val navegarTelaExercicios = Intent(this,TelaExercicios::class.java)
            startActivity(navegarTelaExercicios)
        }
        }
    }
