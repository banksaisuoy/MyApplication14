package com.example.myapplication

import org.junit.Test
import org.junit.Assert.*

class MockDataGeneratorTest {

    @Test
    fun testGenerateData_defaultCount() {
        val data = MockDataGenerator.generateData()
        assertEquals(100, data.size)
    }

    @Test
    fun testGenerateData_customCount() {
        val data = MockDataGenerator.generateData(50)
        assertEquals(50, data.size)
    }

    @Test
    fun testGenerateData_itemProperties() {
        val data = MockDataGenerator.generateData(1)
        val item = data.first()

        assertNotNull(item.id)
        assertTrue(item.title.contains("Item #"))
        assertTrue(item.description.isNotEmpty())
        assertTrue(item.timestamp > 0)
    }
}