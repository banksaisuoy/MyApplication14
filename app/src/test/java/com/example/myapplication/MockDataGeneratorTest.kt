package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class MockDataGeneratorTest {
    @Test
    fun `test getMockData returns valid list`() {
        val data = MockDataGenerator.getMockData()

        assertTrue("Data should not be empty", data.isNotEmpty())
        assertEquals("Data should have 5 items", 5, data.size)

        val firstItem = data[0]
        assertEquals("Exploring the Cosmos", firstItem.title)
        assertTrue(firstItem.imageUrl.isNotEmpty())
    }
}
