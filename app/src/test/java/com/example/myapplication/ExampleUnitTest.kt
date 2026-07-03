package com.example.myapplication

import org.junit.Test
import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun mockDataGeneration_isCorrect() {
        val items = MockDataGenerator.generateMockData(20)

        assertEquals(20, items.size)

        val firstItem = items[0]
        assertEquals(1, firstItem.id)
        assertEquals("Item Title 1", firstItem.title)
        assertTrue(firstItem.description.contains("item number 1"))

        val lastItem = items[19]
        assertEquals(20, lastItem.id)
        assertEquals("Item Title 20", lastItem.title)
    }
}
