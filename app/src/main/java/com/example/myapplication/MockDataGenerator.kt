package com.example.myapplication

object MockDataGenerator {
    fun generateMockData(count: Int): List<MockItem> {
        return (1..count).map {
            MockItem(it, "Item Title $it", "This is the beautifully crafted description for item number $it, providing auto-mocked data without placeholders.")
        }
    }
}
