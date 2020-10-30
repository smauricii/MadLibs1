package com.edu.uan.android.madlibsfinal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_m_ad_libs.*
import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.FileReader

class MadLibsActivity : AppCompatActivity() {
    var datos: Bundle? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_m_ad_libs)

        datos = intent.extras



        readList()
        // readList1()
    }

    fun readList() {

        val file: File
        file = getFileStreamPath("madlib.txt")

        if (file.exists()) {
            var inputAsString = FileInputStream(file).bufferedReader().use { it.readText() }


            inputAsString = inputAsString.replace("<adjective>", "${datos!!.getString("palabra1")}")
            inputAsString= inputAsString.replace("<plural-noun>", "${datos!!.getString("palabra2")}")
            inputAsString = inputAsString.replace("<noun>","${datos!!.getString("palabra3")}")
            inputAsString = inputAsString.replace("<adjective1>","${datos!!.getString("palabra4")}")
            inputAsString = inputAsString.replace("<place>","${datos!!.getString("palabra5")}")
            inputAsString = inputAsString.replace("<plural-noun1>","${datos!!.getString("palabra6")}")
            inputAsString= inputAsString.replace("<noun1>","${datos!!.getString("palabra7")}")
            inputAsString = inputAsString.replace("<funny-noise>","${datos!!.getString("palabra8")}")
            inputAsString = inputAsString.replace("<adjective2>","${datos!!.getString("palabra9")}")
            inputAsString= inputAsString.replace("<noun2>","${datos!!.getString("palabra10")}")
            inputAsString = inputAsString.replace("<adjective3>","${datos!!.getString("palabra11")}")
            inputAsString = inputAsString.replace("<plural-noun1>","${datos!!.getString("palabra12")}")
            inputAsString = inputAsString.replace("<person's-name>","${datos!!.getString("palabra13")}")
            txt_madlib.text = inputAsString


        } else {
            android.widget.Toast.makeText(
                this,
                "No hay lista para ver",
                android.widget.Toast.LENGTH_SHORT
            ).show()
        }

    }


}
