package com.example.examapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.examapp.R

class EnglishGrammarQuestion1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english_grammar_question1)

        val explicitButton = findViewById<Button>(R.id.nextButton)
        explicitButton.setOnClickListener {
            val explicitButtonIntent = Intent(this, EnglishGrammarQuestion2::class.java)
            startActivity(explicitButtonIntent)
            finish()
        }
    }
}