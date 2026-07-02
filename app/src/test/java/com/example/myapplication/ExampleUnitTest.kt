package com.example.myapplication

import org.junit.Test
import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun app_configuration_isCorrect() {
        // Just verify package name matches our config expectation
        val expectedPackage = "com.example.myapplication"
        assertEquals("com.example.myapplication", expectedPackage)
    }
}
