package com.example.myapplication

data class DataModel(
    val id: Int,
    val title: String,
    val description: String
)

object MockDataGenerator {
    fun generateMockData(): List<DataModel> {
        val mockDataList = mutableListOf<DataModel>()
        for (i in 1..20) {
            mockDataList.add(
                DataModel(
                    id = i,
                    title = "Awesome Title $i",
                    description = "This is a detailed description for item number $i. It showcases our breathtaking UI."
                )
            )
        }
        return mockDataList
    }
}
