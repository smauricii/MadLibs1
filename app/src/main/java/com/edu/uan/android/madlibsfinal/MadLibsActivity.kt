package com.edu.uan.android.madlibsfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_m_ad_libs.*

class MadLibsActivity : AppCompatActivity() {
    var datos:Bundle? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_m_ad_libs)

        datos = intent.extras
        var palabra1:String = datos!!.getString("palabra1","palabra1")
        var palabra2:String = datos!!.getString("palabra2","palabra1")
        var palabra3:String = datos!!.getString("palabra3","palabra1")
        var palabra4:String = datos!!.getString("palabra4","palabra1")
        var palabra5:String = datos!!.getString("palabra5","palabra1")
        var palabra6:String = datos!!.getString("palabra6","palabra1")
        var palabra7:String = datos!!.getString("palabra7","palabra1")
        var palabra8:String = datos!!.getString("palabra8","palabra1")
        var palabra9:String = datos!!.getString("palabra9","palabra1")
        var palabra10:String = datos!!.getString("palabra10","palabra1")
        var palabra11:String = datos!!.getString("palabra11","palabra1")
        var palabra12:String = datos!!.getString("palabra12","palabra1")
        var palabra13:String = datos!!.getString("palabra13","palabra1")



        txt_madlib.setText("One of the most <$palabra1> characters in fiction is named Tarzan of the <$palabra2> .Tarzan was raised by a/an<$palabra3> and lives in the <$palabra4> jungle in the heart of darkest <$palabra5> . He spends most of his time eating <$palabra6> and swinging from tree to <$palabra7> . Whenever he gets angry, he beats on his chest and says, <$palabra8> ! This is his war cry. Tarzan always dresses in<$palabra9> shorts made from the skin of a/an <$palabra10> and his best friend is a/an <$palabra11> chimpanzee named Cheetah. He is supposed to be able to speak to elephants and <$palabra12> . In the movies, Tarzan is played by <$palabra13> ."
        )
    }
}