package com.example.myapplication

import org.junit.Test
import org.junit.Assert.*

class MockDataGeneratorTest {

    @Test
    fun testGenerateData() {
        val result = MockDataGenerator.generateData()
        assertTrue(result.startsWith("Mock Data: "))
        assertTrue(result.length > "Mock Data: ".length)
    }

    @Test
    fun testGetMissingDataWithNull() {
        val result = MockDataGenerator.getMissingData(null)
        assertTrue(result.startsWith("Auto-Mocked-"))
        assertTrue(result.length > "Auto-Mocked-".length)
    }

    @Test
    fun testGetMissingDataWithProvidedData() {
        val provided = "Actual Data"
        val result = MockDataGenerator.getMissingData(provided)
        assertEquals(provided, result)
    }
}
