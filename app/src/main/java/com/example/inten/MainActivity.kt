package com.example.inten

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnmasuk = findViewById<Button>(R.id.btnmasuk)
        val nama = findViewById<EditText>(R.id.nama)
        btnmasuk.setOnClickListener {
            val nama = nama.text.toString()

            val intent = Intent (this, MainActivity2::class.java).apply {
                putExtra(EXTRA_MESSAGE, nama)
            }
            startActivity(intent)

        }
    }


}