package com.example.myapplication

data class MockDataItem(val id: Int, val title: String, val description: String)

object MockDataGenerator {
    fun generateData(count: Int = 20): List<MockDataItem> {
        val list = mutableListOf<MockDataItem>()
        for (i in 1..count) {
            // Auto-mocking data with NO empty placeholders
            list.add(
                MockDataItem(
                    id = i,
                    title = "Mocked Item Title $i",
                    description = "This is a detailed description for mocked item number $i ensuring no placeholders are used."
                )
            )
        }
        return list
    }
}
