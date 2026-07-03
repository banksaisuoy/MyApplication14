package com.example.myapplication

/**
 * Generates mock data for the application.
 * Decoupled from the Android Activity lifecycle to facilitate pure JVM unit testing.
 */
object MockDataGenerator {
    fun generateMockData(count: Int): List<String> {
        if (count <= 0) return emptyList()
        return (1..count).map { "Mock Data Item $it" }
    }
}
