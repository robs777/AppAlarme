package com.example.cp1pineu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var buttonRelogio: Button
    lateinit var buttonGrupo: Button
    lateinit var buttonAlarme: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        buttonRelogio = findViewById(R.id.imageButtonFuso)
        buttonRelogio.setOnClickListener{
            val navegarRelogio = Intent(this,TelaRelogio::class.java)
            startActivity(navegarRelogio)
        }

        buttonGrupo = findViewById(R.id.imgButtonGrupo)
        buttonGrupo.setOnClickListener{
            val navegarRelogio = Intent(this,TelaGrupo::class.java)
            startActivity(navegarRelogio)
        }

        buttonAlarme = findViewById(R.id.imageButtonAlarme)
        buttonAlarme.setOnClickListener{
            val navegarRelogio = Intent(this,TelaGrupo::class.java)
            startActivity(navegarRelogio)
        }





    }
}