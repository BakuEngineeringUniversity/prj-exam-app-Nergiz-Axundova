package com.example.examapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.examapp.R

class EnglishGrammarQuestion2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english_grammar_question2)

        val explicitButton2 = findViewById<Button>(R.id.nextButton2)
        explicitButton2.setOnClickListener {
            val explicitButton2Intent = Intent(this, EnglishGrammarQuestion3::class.java)
            startActivity(explicitButton2Intent)
            finish()
        }

        val explicitButton3 = findViewById<Button>(R.id.backButton2)
        explicitButton3.setOnClickListener {
            val explicitButton3Intent = Intent(this, EnglishGrammarQuestion1::class.java)
            startActivity(explicitButton3Intent)
            finish()
        }
    }
}