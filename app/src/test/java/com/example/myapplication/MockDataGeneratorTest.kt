package com.example.myapplication

import org.junit.Test
import org.junit.Assert.assertEquals

class MockDataGeneratorTest {
    @Test
    fun generateData_returnsExpectedData() {
        val data = MockDataGenerator.generateData()
        assertEquals("Auto-mocked Production Data", data)
    }
}
