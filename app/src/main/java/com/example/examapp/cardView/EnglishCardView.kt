package com.example.examapp.cardView

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.examapp.R
import com.example.examapp.activities.EnglishGrammarTests

class EnglishCardView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english_card_view)

        val explicitCardView = findViewById<CardView>(R.id.grammarEng)

        explicitCardView.setOnClickListener {
            val explicitCardViewIntent = Intent(this, EnglishGrammarTests::class.java)
            startActivity(explicitCardViewIntent)
            finish()
        }

    }
}