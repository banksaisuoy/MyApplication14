package com.example.myapplication

data class Task(
    val id: Int,
    val title: String,
    val description: String,
    val status: TaskStatus
)

enum class TaskStatus {
    TODO, IN_PROGRESS, DONE
}
