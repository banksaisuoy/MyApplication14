package com.example.myapplication

object MockDataGenerator {
    fun generateData(forceMock: Boolean = false): List<String> {
        val originalData = getOriginalData()

        if (originalData.isEmpty() || forceMock) {
            return listOf("Mocked Data 1", "Mocked Data 2", "Mocked Data 3")
        }

        return originalData
    }

    private fun getOriginalData(): List<String> {
        // Normally this would fetch data from a repository or database.
        // For demonstration, we return an empty list to trigger the auto-mocking.
        return emptyList()
    }
}
