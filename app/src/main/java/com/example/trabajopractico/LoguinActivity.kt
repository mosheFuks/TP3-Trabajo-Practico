package com.example.trabajopractico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class LoguinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loguin)

        val userName = findViewById<EditText>(R.id.txtName).text;
        val userPass = findViewById<EditText>(R.id.txtPassword).text;
        val btnIngresar = findViewById<Button>(R.id.btnIngresar);

        btnIngresar.setOnClickListener {
            if (userName.isNotEmpty() && userPass.isNotEmpty()) {
                var intent = Intent(this, MainActivity::class.java)
                intent.putExtra("userName", userName.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}