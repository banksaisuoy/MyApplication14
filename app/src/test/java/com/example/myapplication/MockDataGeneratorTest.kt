package com.example.myapplication

import org.junit.Test
import org.junit.Assert.*

class MockDataGeneratorTest {
    @Test
    fun testGenerateMockData_defaultCount() {
        val data = MockDataGenerator.generateMockData()
        assertEquals(10, data.size)
    }

    @Test
    fun testGenerateMockData_customCount() {
        val data = MockDataGenerator.generateMockData(5)
        assertEquals(5, data.size)
    }
}
