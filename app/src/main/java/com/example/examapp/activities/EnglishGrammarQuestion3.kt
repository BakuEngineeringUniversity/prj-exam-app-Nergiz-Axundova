package com.example.examapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.examapp.R

class EnglishGrammarQuestion3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english_grammar_question3)

        val explicitButton3 = findViewById<Button>(R.id.backButton3)
        explicitButton3.setOnClickListener {
            val explicitButton3Intent = Intent(this, EnglishGrammarQuestion2::class.java)
            startActivity(explicitButton3Intent)
            finish()
        }
    }
}