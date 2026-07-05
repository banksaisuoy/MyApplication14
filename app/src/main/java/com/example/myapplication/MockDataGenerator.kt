package com.example.myapplication

import java.util.UUID

data class Item(
    val id: String,
    val name: String,
    val description: String
)

object MockDataGenerator {
    fun generateItems(count: Int): List<Item> {
        return (1..count).map {
            Item(
                id = UUID.randomUUID().toString(),
                name = "Mock Item Name $it",
                description = "Mock Description for item $it with complete data."
            )
        }
    }
}
