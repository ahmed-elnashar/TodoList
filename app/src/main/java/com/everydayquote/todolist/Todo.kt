package com.everydayquote.todolist

data class Todo (
    val title: String,
    var isChecked: Boolean = false
)