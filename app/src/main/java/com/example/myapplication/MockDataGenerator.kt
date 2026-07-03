package com.example.myapplication

object MockDataGenerator {
    fun generateMockData(count: Int): List<String> {
        return (1..count).map { "Mock Data Item $it" }
    }
}
