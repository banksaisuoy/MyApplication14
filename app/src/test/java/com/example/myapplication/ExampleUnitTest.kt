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
    fun testGenerateItemsReturnsCompleteData() {
        val count = 5
        val items = MockDataGenerator.generateItems(count)

        assertEquals(count, items.size)

        items.forEach { item ->
            assertTrue(item.id.isNotEmpty())
            assertTrue(item.name.isNotEmpty())
            assertTrue(item.description.isNotEmpty())
        }
    }

    @Test
    fun testGenerateItemsZeroCount() {
        val items = MockDataGenerator.generateItems(0)
        assertEquals(0, items.size)
    }
}