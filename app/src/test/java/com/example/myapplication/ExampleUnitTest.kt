package com.example.myapplication

import org.junit.Test
import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun factorial_zero_returnsOne() {
        assertEquals(1, MathUtils.factorial(0))
    }

    @Test
    fun factorial_one_returnsOne() {
        assertEquals(1, MathUtils.factorial(1))
    }

    @Test
    fun factorial_positiveInteger_isCorrect() {
        assertEquals(120, MathUtils.factorial(5))
        assertEquals(3628800, MathUtils.factorial(10))
    }

    @Test(expected = IllegalArgumentException::class)
    fun factorial_negativeInteger_throwsException() {
        MathUtils.factorial(-1)
    }
}