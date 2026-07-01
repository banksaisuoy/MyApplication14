package com.example.myapplication

import org.junit.Test
import org.junit.Assert.*
import android.os.Bundle

class ExampleUnitTest {
    @Test
    fun applicationName_isCorrect() {
        // Simple test to ensure test environment is sane and we test simple math logic
        assertEquals("Basic math must work", 4, 2 + 2)
    }

    @Test
    fun sanityCheck_StringEquality() {
        val appName = "MyApplication"
        assertEquals("The app name string does not match expected", "MyApplication", appName)
    }
}
