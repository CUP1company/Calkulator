package com.project.kalkulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton

import androidx.appcompat.app.AppCompatDelegate

class Referents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_referenses)

        val  meme :RadioButton = findViewById(R.id.Tmeme)
        val themes :RadioButton = findViewById(R.id.Kalkulate)
        val intent = Intent(this@Referents, MainActivity::class.java)

        meme.setOnClickListener{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            startActivity(intent)
        }

        themes.setOnClickListener{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            startActivity(intent)
        }

    }
}