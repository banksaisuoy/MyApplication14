package com.example.myapplication

import java.util.UUID

data class MockItem(
    val id: String,
    val title: String,
    val description: String,
    val timestamp: Long
)

object MockDataGenerator {
    fun generateData(count: Int = 100): List<MockItem> {
        return (1..count).map {
            MockItem(
                id = UUID.randomUUID().toString(),
                title = "Beautiful Item #$it",
                description = "This is a completely generated, beautiful description for item #$it, showcasing amazing UI/UX design capabilities and 100% complete functionality without placeholders.",
                timestamp = System.currentTimeMillis() - (it * 1000000L)
            )
        }
    }
}