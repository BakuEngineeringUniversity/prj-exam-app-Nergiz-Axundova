package com.example.examapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.examapp.R

class EnglishGrammarTests : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english_grammar_tests)

        val explicitCardViewEngT1 = findViewById<CardView>(R.id.test1EngGrammar)

        explicitCardViewEngT1.setOnClickListener {
            val explicitCardViewQ1Intent = Intent(this, EnglishGrammarTestType1::class.java)
            startActivity(explicitCardViewQ1Intent)
            finish()
        }
    }
}