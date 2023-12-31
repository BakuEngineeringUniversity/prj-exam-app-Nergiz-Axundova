package com.example.examapp.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.examapp.R

class LoginActivity : AppCompatActivity() {
    private lateinit var etEmailAddress: EditText
    private lateinit var etTextPassword: EditText
    private lateinit var btnLogin: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val explicitText = findViewById<TextView>(R.id.textSignUp)

        explicitText.setOnClickListener {
            val explicitIntent = Intent(this, SignupActivity::class.java)
            startActivity(explicitIntent)
        }

        etEmailAddress = findViewById(R.id.etEmailAddress)
        etTextPassword = findViewById(R.id.etTextPassword)

        btnLogin= this.findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            loginUser()
        }
    }

    private fun loginUser() {
            val email = etEmailAddress.text.toString()
            val password = etTextPassword.text.toString()

            if(email.isBlank() && password.isBlank()) {
                Toast.makeText(this, "Email and Password are required", Toast.LENGTH_SHORT).show()
            }

            else if(password.isBlank()) {
            Toast.makeText(this, "Password cannot be empty", Toast.LENGTH_SHORT).show()
            }

            else if(email.isBlank()) {
                Toast.makeText(this, "Email cannot be empty", Toast.LENGTH_SHORT).show()
            }

            else {
                val explicitButton = findViewById<Button>(R.id.btnLogin)

                explicitButton.setOnClickListener {
                    val explicitIntent1 = Intent(this, MainActivity::class.java)
                    startActivity(explicitIntent1)
                    finish()
                }
            }
    }
}


