package com.example.myapplication

object MathUtils {
    fun factorial(n: Int): Long {
        if (n < 0) throw IllegalArgumentException("n must be non-negative")
        if (n == 0 || n == 1) return 1
        var result = 1L
        for (i in 2..n) {
            result *= i
        }
        return result
    }
}
