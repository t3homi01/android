package com.example.koodinjakaminen.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.koodinjakaminen.ui.components.MainTopAppBar

@Composable
fun MainScreen(navController: NavController) {
    Scaffold(
        topBar = { MainTopAppBar("My App", navController) }
    ) { inner ->
        Text("Home Screen", modifier = Modifier.padding(inner))
    }
}
