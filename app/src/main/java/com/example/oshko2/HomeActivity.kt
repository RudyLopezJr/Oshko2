package com.example.oshko2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

const val USER_NAME = "com.example.oshko2.USER_NAME"


class HomeActivity : AppCompatActivity() {

    private lateinit var boton: Button
    private lateinit var input: EditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

    }
}

/*
       boton = findViewById(R.id.buttonAccept)
       input = findViewById(R.id.editText)

       boton.setOnClickListener {
           val bundle = Bundle()

           //Ir metiendo toda la info, bundle es como la caja
           bundle.putString(USER_NAME, input.text.toString())

           //Intent es el canal de comunicación
           val intent = Intent(this, principalMenu::class.java ).apply{
               putExtras(bundle)
           }

           startActivity(intent)
       }

        */