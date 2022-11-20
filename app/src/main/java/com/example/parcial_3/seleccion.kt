package com.example.parcial_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class seleccion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun siguente (vista: View){
        val ventana: Intent = Intent(applicationContext,Menu::class.java)
        startActivity(ventana)
    }


}