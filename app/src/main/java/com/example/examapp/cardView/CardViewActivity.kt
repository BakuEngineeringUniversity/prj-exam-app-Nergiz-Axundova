package com.example.examapp.cardView

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.examapp.R

class CardViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_view)

        //Azerbaijani Card View
        val explicitCardViewActivity1 = findViewById<CardView>(R.id.azerbaijani)

        explicitCardViewActivity1.setOnClickListener {
            val cardViewIntent1 = Intent(this, AzerbaijaniCardView::class.java)
            startActivity(cardViewIntent1)
        }

        //Korean Card View
        val explicitCardViewActivity2 = findViewById<CardView>(R.id.korean)

        explicitCardViewActivity2.setOnClickListener {
            val cardViewIntent2 = Intent(this, KoreanCardView::class.java)
            startActivity(cardViewIntent2)
        }

        //Math Card View
        val explicitCardViewActivity3 = findViewById<CardView>(R.id.math)

        explicitCardViewActivity3.setOnClickListener {
            val cardViewIntent3 = Intent(this, MathCardView::class.java)
            startActivity(cardViewIntent3)
        }

        //Biology Card View
        val explicitCardViewActivity4 = findViewById<CardView>(R.id.biology)

        explicitCardViewActivity4.setOnClickListener {
            val cardViewIntent4 = Intent(this, BiologyCardView::class.java)
            startActivity(cardViewIntent4)
        }

        //Russian Card View
        val explicitCardViewActivity5 = findViewById<CardView>(R.id.russian)

        explicitCardViewActivity5.setOnClickListener {
            val cardViewIntent5 = Intent(this, RussianCardView::class.java)
            startActivity(cardViewIntent5)
        }

        //English Card View
        val explicitCardViewActivity6 = findViewById<CardView>(R.id.english)

        explicitCardViewActivity6.setOnClickListener {
            val cardViewIntent6 = Intent(this, EnglishCardView::class.java)
            startActivity(cardViewIntent6)
        }

        //History Card View
        val explicitCardViewActivity7 = findViewById<CardView>(R.id.history)

        explicitCardViewActivity7.setOnClickListener {
            val cardViewIntent7 = Intent(this, HistoryCardView::class.java)
            startActivity(cardViewIntent7)
        }

        //Chemistry Card View
        val explicitCardViewActivity8 = findViewById<CardView>(R.id.chemistry)

        explicitCardViewActivity8.setOnClickListener {
            val cardViewIntent8 = Intent(this, ChemistryCardView::class.java)
            startActivity(cardViewIntent8)
        }
    }
}