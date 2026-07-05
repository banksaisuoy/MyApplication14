package com.example.myapplication

import java.util.UUID

data class MockData(val id: String, val name: String, val value: Int)

object MockDataGenerator {
    fun generateMockData(count: Int = 10): List<MockData> {
        return (1..count).map {
            MockData(
                id = UUID.randomUUID().toString(),
                name = "MockItem $it",
                value = it * 10
            )
        }
    }
}
