package com.example.historias.historias

import android.graphics.LinearGradient
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.historias.R

class historia1 : AppCompatActivity() {
    lateinit var Hvoltar1 : ImageButton


    //cria variavel com tipo de LinearLayout:
    lateinit var linearLayout : LinearLayout


    lateinit var vTextos: Array<String>


    //cria uma array com valor de ids de imagens(drawable/batata)
    val images = arrayOf(
        R.drawable.batata,
        R.drawable.srbatata,
        R.drawable.sratatacopia,
        R.drawable.obatatabanho,
        R.drawable.thepotato,
        R.drawable.obatataestudando,
        R.drawable.obatatacantando
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historia1)

        //valor de texto(texto guadado no values/strings)
        vTextos = arrayOf(
            getString(R.string.text1),
            getString(R.string.text2),
            getString(R.string.text3),
            getString(R.string.text4),
            getString(R.string.text5),
            getString(R.string.text6),
            getString(R.string.text7)
        )


        Hvoltar1 = findViewById(R.id.IBvoltar1);

        Hvoltar1.setOnClickListener {
            finish()
        }


        //ONcreat:

        //da um id ao linear
        linearLayout = findViewById(R.id.LL1) // Substitua R.id.linearLayout pelo ID correto

        //cria um laço de repetiçao(for(in))
        for (_i in vTextos.indices) {

            //texto:

            // recebe texto| imagem para o parametro
            val _tView = TextView(this)
            val verImagem = ImageView(this)


            //configurações de  parametros do xml:


            //TextColor
            _tView.setTextColor(resources.getColor(R.color.white))

            //layout_width e layout_height (text||imagem)
            val parametroL = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            val IparametroL = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)


            //margins(text)
            parametroL.setMargins(100,0,0,0)

            /*gravity
            parametroL.gravity = Gravity.CENTER_HORIZONTAL */

            //atribui os parametros
            _tView.layoutParams = parametroL
            verImagem.layoutParams = IparametroL


            //mudando e adicionando o text| imagem
            _tView.text = vTextos[_i]
            linearLayout.addView(_tView)

            verImagem.setImageResource(images[_i])
            linearLayout.addView(verImagem)
        }


    }
}