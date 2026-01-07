package com.example.todo.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.todo.model.Todo

@Composable
fun TodoList(modifier: Modifier = Modifier, todos: List<Todo>) {
    LazyColumn(modifier = modifier.padding(8.dp)) {
        items(todos) { todo ->
            Text(
                text = todo.title,
                modifier = Modifier.padding(vertical = 4.dp)
            )
        }
    }
}
