package com.example.myapplication

import java.util.UUID

object MockDataGenerator {
    fun generateString(prefix: String = "mock_"): String = prefix + UUID.randomUUID().toString()
    fun generateInt(min: Int = 0, max: Int = 100): Int = (min..max).random()
    fun generateBoolean(): Boolean = listOf(true, false).random()
    fun <T> mockMissingData(factory: () -> T): T {
        return factory()
    }
}
