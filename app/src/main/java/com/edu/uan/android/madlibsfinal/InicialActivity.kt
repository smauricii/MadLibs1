package com.edu.uan.android.madlibsfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inicial.*

class InicialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicial)

        text_mad.setText("Mad Libs es un juego de palabras de plantilla de frases que consiste en un jugador que pide a otros una lista de palabras para sustituir los espacios en blanco en una historia antes de leer en voz alta.")

        btn_comenzar.setOnClickListener {
            val intent = Intent(this, MainLibs::class.java)
            startActivity(intent)
        }
    }
}