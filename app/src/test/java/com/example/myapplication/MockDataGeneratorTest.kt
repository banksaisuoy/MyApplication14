package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Test

class MockDataGeneratorTest {
    @Test
    fun generateData_returnsCorrectNumberOfItems() {
        val data = MockDataGenerator.generateData()
        assertEquals(3, data.size)
    }

    @Test
    fun generateData_returnsExpectedItems() {
        val data = MockDataGenerator.generateData()
        assertEquals("Mock Item 1", data[0])
        assertEquals("Mock Item 2", data[1])
        assertEquals("Mock Item 3", data[2])
    }
}
