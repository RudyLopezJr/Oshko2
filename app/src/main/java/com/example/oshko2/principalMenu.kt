package com.example.oshko2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class principalMenu : AppCompatActivity() {

    private lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal_menu)

        text = findViewById(R.id.textView)

        val bundle = intent.extras

        val name = bundle?.getString(USER_NAME)

        text.text = "Bienvenido ${name}"
    }
}

