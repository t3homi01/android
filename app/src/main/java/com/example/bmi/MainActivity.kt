package com.example.painoindeksi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BmiScreen()
        }
    }
}

@Composable
fun BmiScreen(bmiViewModel: BmiViewModel = viewModel()) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        Text(
            text = "Body Mass Index",
            style = MaterialTheme.typography.headlineMedium
        )

        OutlinedTextField(
            value = bmiViewModel.height.value,
            onValueChange = { bmiViewModel.height.value = it },
            label = { Text("Height (m)") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = bmiViewModel.weight.value,
            onValueChange = { bmiViewModel.weight.value = it },
            label = { Text("Weight (kg)") },
            modifier = Modifier.fillMaxWidth()
        )

        if (bmiViewModel.bmi.isNotEmpty()) {
            Text(
                text = "BMI: ${bmiViewModel.bmi}",
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}
