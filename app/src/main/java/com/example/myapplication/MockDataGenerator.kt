package com.example.myapplication

object MockDataGenerator {
    fun getMockData(): List<DashboardItem> {
        return listOf(
            DashboardItem(
                id = "1",
                title = "Exploring the Cosmos",
                description = "Dive deep into the wonders of the universe and learn about distant galaxies, black holes, and the mysteries of space time.",
                imageUrl = "https://images.unsplash.com/photo-1462331940025-496dfbfc7564?q=80&w=600&auto=format&fit=crop"
            ),
            DashboardItem(
                id = "2",
                title = "Minimalist Setup",
                description = "Discover the joy of a clutter-free desk and how a minimalist workspace can boost your daily productivity.",
                imageUrl = "https://images.unsplash.com/photo-1499951360447-b19be8fe80f5?q=80&w=600&auto=format&fit=crop"
            ),
            DashboardItem(
                id = "3",
                title = "Mountain Adventures",
                description = "Pack your bags and prepare for an unforgettable journey through the majestic snow-capped peaks and tranquil valleys.",
                imageUrl = "https://images.unsplash.com/photo-1506905925346-21bda4d32df4?q=80&w=600&auto=format&fit=crop"
            ),
            DashboardItem(
                id = "4",
                title = "Urban Photography",
                description = "Capture the vibrant energy of city life, from towering skyscrapers to the bustling streets below.",
                imageUrl = "https://images.unsplash.com/photo-1449824913935-59a10b8d2000?q=80&w=600&auto=format&fit=crop"
            ),
            DashboardItem(
                id = "5",
                title = "Coffee Culture",
                description = "A deep dive into the world of specialty coffee, exploring different brewing methods and the art of latte.",
                imageUrl = "https://images.unsplash.com/photo-1497935586351-b67a49e012bf?q=80&w=600&auto=format&fit=crop"
            )
        )
    }
}
