package com.example.examapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.examapp.R

class LoginIntro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_intro)

        val explicitButton1 = findViewById<Button>(R.id.btnGetStarted)

        explicitButton1.setOnClickListener {
            val explicitIntent = Intent(this, LoginActivity::class.java)
            startActivity(explicitIntent)
            finish()
        }
    }


}