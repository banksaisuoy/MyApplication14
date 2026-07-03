package com.example.myapplication

import org.junit.Assert.*
import org.junit.Test

class MockDataGeneratorTest {

    @Test
    fun testGenerateMockDataWithValidInput() {
        val input = "ValidData"
        val result = MockDataGenerator.generateMockData(input)
        assertEquals("ValidData", result)
    }

    @Test
    fun testGenerateMockDataWithNullInput() {
        val result = MockDataGenerator.generateMockData(null)
        assertTrue(result.startsWith("AutoMockedData_"))
    }

    @Test
    fun testGenerateMockDataWithBlankInput() {
        val result = MockDataGenerator.generateMockData("   ")
        assertTrue(result.startsWith("AutoMockedData_"))
    }

    @Test
    fun testGenerateMockListWithPositiveSize() {
        val result = MockDataGenerator.generateMockList(3)
        assertEquals(3, result.size)
        assertEquals("Item_0", result[0])
        assertEquals("Item_1", result[1])
        assertEquals("Item_2", result[2])
    }

    @Test
    fun testGenerateMockListWithZeroSize() {
        val result = MockDataGenerator.generateMockList(0)
        assertEquals(1, result.size)
        assertTrue(result[0].startsWith("AutoMockedData_"))
    }

    @Test
    fun testGenerateMockListWithNegativeSize() {
        val result = MockDataGenerator.generateMockList(-5)
        assertEquals(1, result.size)
        assertTrue(result[0].startsWith("AutoMockedData_"))
    }
}
