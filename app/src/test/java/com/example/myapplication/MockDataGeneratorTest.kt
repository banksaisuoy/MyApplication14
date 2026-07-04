package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class MockDataGeneratorTest {

    @Test
    fun testGenerateDataReturnsMockedDataWhenForced() {
        val data = MockDataGenerator.generateData(forceMock = true)
        assertEquals(3, data.size)
        assertEquals("Mocked Data 1", data[0])
        assertEquals("Mocked Data 2", data[1])
        assertEquals("Mocked Data 3", data[2])
    }

    @Test
    fun testGenerateDataReturnsMockedDataWhenOriginalIsEmpty() {
        val data = MockDataGenerator.generateData(forceMock = false)
        assertTrue(data.isNotEmpty())
        assertEquals(3, data.size)
        assertEquals("Mocked Data 1", data[0])
    }
}
