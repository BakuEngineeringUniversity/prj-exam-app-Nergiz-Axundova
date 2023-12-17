package com.example.examapp.utils

import com.example.examapp.R

object IconPicker {
    val icons = arrayOf(
       R.drawable.azerbaijan_icon,
       R.drawable.english_icon,
       R.drawable.korean_icon,
       R.drawable.russian_icon,
       R.drawable.math_icon,
       R.drawable.biology_icon
    )
    var currentIcon = 0

    fun getIcon():Int {
        currentIcon = (currentIcon + 1) % icons.size
        return icons[currentIcon]
    }
}
