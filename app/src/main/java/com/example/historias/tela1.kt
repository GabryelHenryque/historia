package com.example.historias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.historias.historias.historia1

class tela1 : AppCompatActivity() {

    lateinit var irBatata : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela1)

       irBatata = findViewById(R.id.BirBatata)


        irBatata.setOnClickListener {
            val Tbatata = Intent(this, historia1::class.java )
            startActivity(Tbatata)

        }

    }
}