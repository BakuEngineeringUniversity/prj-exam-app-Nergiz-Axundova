package com.example.examapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.examapp.R

class EnglishGrammarTestType1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english_grammar_test_type1)

        val explicitButton = findViewById<Button>(R.id.startButton)

        explicitButton.setOnClickListener {
            val explicitButtonIntent = Intent(this, EnglishGrammarQuestion1::class.java)
            startActivity(explicitButtonIntent)
            finish()
        }
    }
}