package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Test

class MockDataGeneratorTest {

    @Test
    fun `generateData returns correct mock string`() {
        val result = MockDataGenerator.generateData()
        assertEquals("Mocked Data for zero defects!", result)
    }
}
