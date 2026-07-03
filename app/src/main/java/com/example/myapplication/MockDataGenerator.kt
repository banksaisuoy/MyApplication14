package com.example.myapplication

object MockDataGenerator {
    fun generateData(): List<String> {
        val list = mutableListOf<String>()
        for (i in 1..20) {
            list.add("Item $i")
        }
        return list
    }
}
