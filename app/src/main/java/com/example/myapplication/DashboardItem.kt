package com.example.myapplication

import java.io.Serializable

data class DashboardItem(
    val id: String,
    val title: String,
    val description: String,
    val imageUrl: String
) : Serializable
