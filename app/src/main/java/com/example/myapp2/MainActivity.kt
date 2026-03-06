package com.example.myapp2

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = findViewById<Button>(R.id.botaoClique)

        botao.setOnClickListener {
            Toast.makeText(
                this,
                getString(R.string.mensagem_toast),
                Toast.LENGTH_LONG
            ).show()
        }
    }
}