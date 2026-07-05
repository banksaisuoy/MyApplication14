package com.example.myapplication

import org.junit.Assert.assertTrue
import org.junit.Assert.assertFalse
import org.junit.Test

class MockDataGeneratorTest {

    @Test
    fun generateMockData_returnsNonEmptyString() {
        val mockData = MockDataGenerator.generateMockData()

        // Assert that the data is not empty or blank
        assertFalse("Mock data should not be empty", mockData.isEmpty())
        assertFalse("Mock data should not be blank", mockData.isBlank())

        // Assert that the data contains the expected prefix indicating it was auto-mocked
        assertTrue("Mock data should start with 'Auto-mocked Data:'", mockData.startsWith("Auto-mocked Data:"))
    }
}
