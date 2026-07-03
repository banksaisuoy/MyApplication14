package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class MockDataGeneratorTest {

    @Test
    fun generateMockData_withPositiveCount_returnsCorrectList() {
        val result = MockDataGenerator.generateMockData(5)
        assertEquals(5, result.size)
        assertEquals("Mock Data Item 1", result[0])
        assertEquals("Mock Data Item 5", result[4])
    }

    @Test
    fun generateMockData_withZeroCount_returnsEmptyList() {
        val result = MockDataGenerator.generateMockData(0)
        assertTrue(result.isEmpty())
    }

    @Test
    fun generateMockData_withNegativeCount_returnsEmptyList() {
        val result = MockDataGenerator.generateMockData(-5)
        assertTrue(result.isEmpty())
    }
}
