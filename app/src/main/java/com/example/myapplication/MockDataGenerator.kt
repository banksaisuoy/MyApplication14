package com.example.myapplication

import java.util.UUID

object MockDataGenerator {
    fun generateMockData(input: String? = null): String {
        return input?.takeIf { it.isNotBlank() } ?: "AutoMockedData_${UUID.randomUUID()}"
    }

    fun generateMockList(size: Int): List<String> {
        return if (size <= 0) {
            listOf("AutoMockedData_${UUID.randomUUID()}")
        } else {
            List(size) { "Item_$it" }
        }
    }
}
