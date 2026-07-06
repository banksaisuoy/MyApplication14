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
    fun mockDataGenerator_generatesItems() {
        val items = MockDataGenerator.generateItems()
        assertNotNull(items)
        assertEquals(10, items.size)

        val firstItem = items[0]
        assertEquals(1, firstItem.id)
        assertEquals("Beautiful Landscape", firstItem.title)
        assertTrue(firstItem.imageUrl.isNotEmpty())
    }
}