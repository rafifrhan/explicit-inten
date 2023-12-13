package com.example.inten

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val tvhasil = findViewById<TextView>(R.id.TextHasil).apply {
            text = message
        }
        tvhasil.text = "Selamat Datang " + message

    }
}