package com.example.myapplication

import org.junit.Test
import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun testMockDataGeneration() {
        val data = MockDataGenerator.generateData()
        assertNotNull("Generated data should not be null", data)
        assertTrue("Generated data should not be empty", data.isNotEmpty())
        assertEquals("Auto-mocked data: Zero defects functionality!", data)
    }
}
