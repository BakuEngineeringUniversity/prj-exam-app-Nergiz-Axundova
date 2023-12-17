package com.example.examapp.utils

object ColorPicker {
    val colors = arrayOf(
        "#3EB9DF",
        "#EB741A",
        "B32BED",
        "#ED2B68",
        "#87b8ea",
        "#7bcf7d"
    )
    var currentColorIndex = 0

    fun getColor():String {
        currentColorIndex = (currentColorIndex + 1) % colors.size
        return colors[currentColorIndex]
    }
}