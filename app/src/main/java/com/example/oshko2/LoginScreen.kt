package com.example.oshko2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_register_screen.*


class LoginScreen : AppCompatActivity() {

    private lateinit var boton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        boton = findViewById(R.id.iniciarSesionButton)


        boton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java )
            startActivity(intent)
        }
    }
}