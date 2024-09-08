package com.example.cp1pineu


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaRelogio : AppCompatActivity() {
    lateinit var buttonRelogio: ImageView
    lateinit var buttonGrupo: ImageView
    lateinit var buttonAlarme: ImageView

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
            val navegarGrupo = Intent(this,TelaGrupo::class.java)
            startActivity(navegarGrupo)
        }

        buttonAlarme = findViewById(R.id.imageButtonAlarme)
        buttonAlarme.setOnClickListener{
            val navegarAlarme = Intent(this,MainActivity::class.java)
            startActivity(navegarAlarme)
        }


    }

}