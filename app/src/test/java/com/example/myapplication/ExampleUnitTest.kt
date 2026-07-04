package com.example.myapplication

import org.junit.Test
import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun mockDataGenerator_generatesString() {
        val str = MockDataGenerator.generateString()
        assertTrue(str.startsWith("mock_"))
        assertTrue(str.length > 5)
    }

    @Test
    fun mockDataGenerator_generatesInt() {
        val value = MockDataGenerator.generateInt(10, 20)
        assertTrue(value in 10..20)
    }

    @Test
    fun mockDataGenerator_generatesBoolean() {
        val value = MockDataGenerator.generateBoolean()
        assertTrue(value == true || value == false)
    }

    @Test
    fun mockDataGenerator_mocksMissingData() {
        val result = MockDataGenerator.mockMissingData { "mocked_data" }
        assertEquals("mocked_data", result)
    }
}
