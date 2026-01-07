package com.example.todo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.todo.model.Todo
import com.example.todo.ui.TodoList
import com.example.todo.ui.theme.TodoTheme
import com.example.todo.viewmodel.TodoViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            TodoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TodoScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun TodoScreen(
    modifier: Modifier = Modifier,
    todoViewModel: TodoViewModel = viewModel()
) {
    TodoList(modifier = modifier, todos = todoViewModel.todos)
}

@Preview(showBackground = true)
@Composable
fun TodoPreview() {
    TodoTheme {
        TodoList(
            todos = listOf(
                Todo(userId = 1, id = 1, title = "Test 1", completed = false),
                Todo(userId = 1, id = 2, title = "Test 2", completed = true),
                Todo(userId = 2, id = 3, title = "Test 3", completed = false),
            )
        )
    }
}
