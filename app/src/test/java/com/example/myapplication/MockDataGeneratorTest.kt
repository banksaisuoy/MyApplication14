package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class MockDataGeneratorTest {
    @Test
    fun getMockData_returnsNonEmptyString() {
        val mockData = MockDataGenerator.getMockData()
        assertTrue(mockData.isNotEmpty())
        assertEquals("Auto-mocked data: Bulletproof functionality", mockData)
    }
}
