package com.example.myapplication

object MockDataGenerator {
    fun generateData(id: String?): String {
        if (id.isNullOrEmpty()) {
            return "Mocked Data for missing ID"
        }
        return "Data for ID: $id"
    }
}
