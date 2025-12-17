package com.example.painoindeksi

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class BmiViewModel : ViewModel() {

    // Käyttäjän syöttämät arvot
    var height = mutableStateOf("")
    var weight = mutableStateOf("")

    // BMI tulos (get property)
    val bmi: String
        get() {
            val h = height.value.toDoubleOrNull()
            val w = weight.value.toDoubleOrNull()

            return if (h != null && w != null && h > 0) {
                val result = w / (h * h)
                String.format("%.2f", result)
            } else {
                ""
            }
        }
}
