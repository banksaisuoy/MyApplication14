package com.example.myapplication

import org.junit.Test
import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun mockDataGenerator_generatesValidData() {
        val data = MockDataGenerator.generateMockData()
        assertNotNull(data)
        assertTrue("Data list should not be empty", data.isNotEmpty())
        assertEquals("Data list should contain 20 items", 20, data.size)

        val firstItem = data[0]
        assertEquals(1, firstItem.id)
        assertEquals("Awesome Title 1", firstItem.title)
        assertTrue(firstItem.description.contains("item number 1"))
    }
}
