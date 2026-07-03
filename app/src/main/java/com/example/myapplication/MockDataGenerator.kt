package com.example.myapplication

import java.util.UUID

object MockDataGenerator {
    fun generateData(): String {
        return "Mock Data: ${UUID.randomUUID()}"
    }

    fun getMissingData(providedData: String?): String {
        return providedData ?: "Auto-Mocked-${UUID.randomUUID().toString().substring(0, 8)}"
    }
}
