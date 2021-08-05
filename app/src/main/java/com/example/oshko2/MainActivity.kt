package com.example.oshko2


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.os.HandlerCompat.postDelayed


class
MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        open_btn=findViewById(R.id.open_btn)
        text=findViewById(R.id.text)
        open_btn.setOnClickListener {
            text.text = getString(R.string.button_clicked)
            text.visibility = View.INVISIBLE
            open_btn.isEnabled = false
        }


        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this@MainActivity , RegisterScreen::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}