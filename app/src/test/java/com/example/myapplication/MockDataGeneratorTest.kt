package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Test

class MockDataGeneratorTest {

    @Test
    fun `generateMockData returns correct number of items`() {
        val count = 5
        val result = MockDataGenerator.generateMockData(count)
        assertEquals(count, result.size)
    }

    @Test
    fun `generateMockData returns expected item strings`() {
        val count = 3
        val result = MockDataGenerator.generateMockData(count)
        assertEquals("Mock Data Item 1", result[0])
        assertEquals("Mock Data Item 2", result[1])
        assertEquals("Mock Data Item 3", result[2])
    }

    @Test
    fun `generateMockData returns empty list for 0 count`() {
        val count = 0
        val result = MockDataGenerator.generateMockData(count)
        assertEquals(0, result.size)
    }
}
