package com.example.myrecipeapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class WelcomeScreen : AppCompatActivity() {

    private val WELCOME_TIME : Long = 4000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        Handler().postDelayed( {
            startActivity( Intent(this, MainActivity::class.java))
            finish()
        }, WELCOME_TIME)
    }
}