package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Test

class MockDataGeneratorTest {

    @Test
    fun testGenerateData_withValidId() {
        val result = MockDataGenerator.generateData("test-id")
        assertEquals("Data for ID: test-id", result)
    }

    @Test
    fun testGenerateData_withNullId_returnsMock() {
        val result = MockDataGenerator.generateData(null)
        assertEquals("Mocked Data for missing ID", result)
    }

    @Test
    fun testGenerateData_withEmptyId_returnsMock() {
        val result = MockDataGenerator.generateData("")
        assertEquals("Mocked Data for missing ID", result)
    }
}
