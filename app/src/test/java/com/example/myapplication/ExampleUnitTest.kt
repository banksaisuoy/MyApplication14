package com.example.myapplication

import org.junit.Test
import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun mockDataGenerator_generatesData() {
        val data = MockDataGenerator.generateData()
        assertNotNull(data)
        assertEquals(20, data.size)
        assertEquals("Item 1", data[0])
        assertEquals("Item 20", data[19])
    }
}