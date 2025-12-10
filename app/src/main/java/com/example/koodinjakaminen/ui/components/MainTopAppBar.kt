package com.example.koodinjakaminen.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.navigation.NavController
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopAppBar(title: String, navController: NavController) {

    var expanded by remember { mutableStateOf(false) }

    TopAppBar(
        title = { Text(title) },

        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(Icons.Filled.Menu, contentDescription = "")
            }
        },

        actions = {
            IconButton(onClick = { expanded = !expanded }) {
                Icon(Icons.Filled.MoreVert, contentDescription = "")
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {

                DropdownMenuItem(
                    text = { Text("Info") },
                    onClick = {
                        expanded = false
                        navController.navigate("info")
                    }
                )

                DropdownMenuItem(
                    text = { Text("Settings") },
                    onClick = {
                        expanded = false
                        navController.navigate("settings")
                    }
                )
            }
        }
    )
}
