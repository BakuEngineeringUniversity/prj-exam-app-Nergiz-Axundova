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


class SignupActivity : AppCompatActivity() {
    private lateinit var etEmailAddress:EditText

    private lateinit var etUsername: EditText
    private lateinit var etTextPassword: EditText
    private lateinit var etConfirmPassword: EditText
    private lateinit var btnSignUp: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        etEmailAddress = findViewById(R.id.etEmailAddress)
        etUsername = findViewById(R.id.etUsername)
        etTextPassword = findViewById(R.id.etTextPassword)
        etConfirmPassword = findViewById(R.id.etConfirmPassword)

        btnSignUp.setOnClickListener {
            signUpUser()
        }

    }
    private fun signUpUser() {
        val email = etEmailAddress.text.toString()
        val username = etUsername.text.toString()
        val password = etTextPassword.text.toString()
        val confirmPassword = etConfirmPassword.text.toString()

        if(email.isBlank() || password.isBlank() || confirmPassword.isBlank() || username.isBlank()) {
            Toast.makeText(this, "Email/Password/Username cannot be empty", Toast.LENGTH_SHORT).show()
        }
        if(password != confirmPassword) {
            Toast.makeText(this, "Password and Confirm Password do not match", Toast.LENGTH_SHORT).show()
                return
        }

        //----INTENT BUTTON----

        val explicitButton = findViewById<Button>(R.id.btnSignUp)

        explicitButton.setOnClickListener{
            val explicitIntent2 = Intent(this, MainActivity::class.java)
            startActivity(explicitIntent2)
            finish()
        }


        /*auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(
                        baseContext,
                        "Successful",
                        Toast.LENGTH_SHORT,
                    ).show()

                } else {
                    // If sign in fails, display a message to the user.

                    Toast.makeText(
                        baseContext,
                        "Authentication failed",
                        Toast.LENGTH_SHORT,
                    ).show()

                }*/
            }

    }

