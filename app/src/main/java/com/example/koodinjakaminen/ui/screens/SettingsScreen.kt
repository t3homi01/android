package com.example.koodinjakaminen.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.koodinjakaminen.ui.components.ScreenTopBar

@Composable
fun SettingsScreen(navController: NavController) {
    Scaffold(
        topBar = { ScreenTopBar("Settings", navController) }
    ) { inner ->
        Text("Settings Screen", modifier = Modifier.padding(inner))
    }
}
