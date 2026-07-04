package com.example.myapplication

import org.junit.Test
import org.junit.Assert.*

class MockDataGeneratorTest {
    @Test
    fun testGenerateData_defaultCount() {
        val data = MockDataGenerator.generateData()
        assertEquals(20, data.size)

        data.forEach { item ->
            assertNotEquals(0, item.id)
            assertTrue(item.title.isNotBlank())
            assertTrue(item.description.isNotBlank())
        }
    }

    @Test
    fun testGenerateData_customCount() {
        val data = MockDataGenerator.generateData(5)
        assertEquals(5, data.size)
    }
}
