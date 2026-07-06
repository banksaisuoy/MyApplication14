package com.example.myapplication

import java.io.Serializable

data class MockItem(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String
) : Serializable
