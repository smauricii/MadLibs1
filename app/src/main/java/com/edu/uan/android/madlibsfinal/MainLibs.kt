package com.edu.uan.android.madlibsfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_libs.*

class MainLibs : AppCompatActivity() {
    var palabra1 = ""
    var palabra2 = ""
    var palabra3 = ""
    var palabra4 = ""
    var palabra5 = ""
    var palabra6 = ""
    var palabra7 = ""
    var palabra8 = ""
    var palabra9 = ""
    var palabra10 = ""
    var palabra11 = ""
    var palabra12 = ""
    var palabra13 = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_libs)

        txt_title.setText("Ingresa la palabra correspondiente que se te va indicando")
        var contador = 0
        var contador2 = 13
        txt_cambio_palabra.setText("Ingresa un adjetivo")
        txt_contador.setText("Quedan $contador2 palabras")
        btn_continuar.setOnClickListener {
            if (edti_ingresrTexto.text.toString() != "") {
                contador++
                contador2--
                if (contador == 1) {
                    palabra1 = edti_ingresrTexto.text.toString()
                    edti_ingresrTexto.setText("")
                    txt_cambio_palabra.setText("Ingresa un sustantivo plural")
                    txt_contador.setText("Quedan $contador2 palabras")

                }

                if (contador == 2) {

                    palabra2 = edti_ingresrTexto.text.toString()
                    edti_ingresrTexto.setText("")
                    txt_cambio_palabra.setText("Ingresa un sustantivo")
                    txt_contador.setText("Quedan $contador2 palabras")


                }
                if (contador == 3) {
                    palabra3 = edti_ingresrTexto.text.toString()
                    edti_ingresrTexto.setText("")
                    txt_cambio_palabra.setText("Ingresa un adjetivo")
                    txt_contador.setText("Quedan $contador2 palabras")

                }
                if (contador == 4) {
                    palabra4 = edti_ingresrTexto.text.toString()
                    edti_ingresrTexto.setText("")
                    txt_cambio_palabra.setText("Ingresa un lugar")
                    txt_contador.setText("Quedan $contador2 palabras")

                }
                if (contador == 5) {
                    palabra5 = edti_ingresrTexto.text.toString()
                    edti_ingresrTexto.setText("")
                    txt_cambio_palabra.setText("Ingresa un sustantivo plural")
                    txt_contador.setText("Quedan $contador2 palabras")

                }
                if (contador == 6) {
                    palabra6 = edti_ingresrTexto.text.toString()
                    edti_ingresrTexto.setText("")
                    txt_cambio_palabra.setText("Ingresa un sustantivo")
                    txt_contador.setText("Quedan $contador2 palabras")

                }
                if (contador == 7) {
                    palabra7 = edti_ingresrTexto.text.toString()
                    edti_ingresrTexto.setText("")
                    txt_cambio_palabra.setText("Ingresa un Ruido divertido")
                    txt_contador.setText("Quedan $contador2 palabras")

                }
                if (contador == 8) {
                    palabra8 = edti_ingresrTexto.text.toString()
                    edti_ingresrTexto.setText("")
                    txt_cambio_palabra.setText("Ingresa un Advjetivo")
                    txt_contador.setText("Quedan $contador2 palabras")

                }
                if (contador == 9) {
                    palabra9 = edti_ingresrTexto.text.toString()
                    edti_ingresrTexto.setText("")
                    txt_cambio_palabra.setText("Ingresa un sustantivo")
                    txt_contador.setText("Quedan $contador2 palabras")

                }
                if (contador == 10) {
                    palabra10 = edti_ingresrTexto.text.toString()
                    edti_ingresrTexto.setText("")
                    txt_cambio_palabra.setText("Ingresa un Advjetivo")
                    txt_contador.setText("Quedan $contador2 palabras")

                }
                if (contador == 11) {
                    palabra11 = edti_ingresrTexto.text.toString()
                    edti_ingresrTexto.setText("")
                    txt_cambio_palabra.setText("Ingresa un sustantivo plural")
                    txt_contador.setText("Quedan $contador2 palabras")

                }
                if (contador == 12) {
                    palabra12 = edti_ingresrTexto.text.toString()
                    edti_ingresrTexto.setText("")
                    txt_cambio_palabra.setText("Ingresa el nombre de una persona")
                    txt_contador.setText("Quedan $contador2 palabras")

                }

                if (contador == 13) {
                    palabra13 = edti_ingresrTexto.text.toString()
                    edti_ingresrTexto.setText("")
                    txt_contador.setText("Quedan $contador2 palabras")

                    var intent = Intent(this, MadLibsActivity::class.java)
                    intent.putExtra("palabra1", palabra1)
                    intent.putExtra("palabra2", palabra2)
                    intent.putExtra("palabra3", palabra3)
                    intent.putExtra("palabra4", palabra4)
                    intent.putExtra("palabra5", palabra5)
                    intent.putExtra("palabra6", palabra6)
                    intent.putExtra("palabra7", palabra7)
                    intent.putExtra("palabra8", palabra8)
                    intent.putExtra("palabra9", palabra9)
                    intent.putExtra("palabra10", palabra10)
                    intent.putExtra("palabra11", palabra11)
                    intent.putExtra("palabra12", palabra12)
                    intent.putExtra("palabra13", palabra13)

                    startActivity(intent)
                }
            }else{
                Toast.makeText(this, "Ingresa una palabra", Toast.LENGTH_SHORT).show()
            }

            Log.d("tag", "palabra1$palabra1")

            Log.d("tag", "palabra3$palabra3")
            Log.d("tag", "palabra13$palabra13")

        }
    }
}
