package com.example.myapplication

object MockDataGenerator {
    fun generateItems(): List<MockItem> {
        return listOf(
            MockItem(
                id = 1,
                title = "Beautiful Landscape",
                description = "A breathtaking view of the mountains at sunset. The sky is painted in hues of orange and pink, creating a serene and peaceful atmosphere. Perfect for a weekend getaway.",
                imageUrl = "https://picsum.photos/id/1015/600/400"
            ),
            MockItem(
                id = 2,
                title = "City Skyline",
                description = "The bustling city skyline at night. The city lights twinkle like stars, reflecting on the calm waters below. A vibrant display of urban life and architectural marvels.",
                imageUrl = "https://picsum.photos/id/1033/600/400"
            ),
            MockItem(
                id = 3,
                title = "Serene Beach",
                description = "A tranquil beach with pristine white sand and crystal-clear turquoise waters. Gentle waves lap at the shore, inviting you to relax and soak up the sun under a clear blue sky.",
                imageUrl = "https://picsum.photos/id/1043/600/400"
            ),
            MockItem(
                id = 4,
                title = "Majestic Forest",
                description = "A dense forest of towering trees with sunlight filtering through the canopy. The air is fresh and earthy, and the sounds of nature create a calming symphony.",
                imageUrl = "https://picsum.photos/id/1018/600/400"
            ),
            MockItem(
                id = 5,
                title = "Desert Dunes",
                description = "Endless golden sand dunes stretching as far as the eye can see under a blazing sun. The winds have sculpted the landscape into beautiful, undulating patterns.",
                imageUrl = "https://picsum.photos/id/1047/600/400"
            ),
            MockItem(
                id = 6,
                title = "Snowy Peaks",
                description = "Snow-capped mountain peaks piercing the clouds. A challenging yet rewarding destination for adventurers seeking pristine slopes and breathtaking panoramas.",
                imageUrl = "https://picsum.photos/id/1036/600/400"
            ),
            MockItem(
                id = 7,
                title = "Quiet Lake",
                description = "A perfectly still lake reflecting the surrounding trees and sky like a mirror. A peaceful spot to pause, reflect, and enjoy the beauty of the natural world.",
                imageUrl = "https://picsum.photos/id/1016/600/400"
            ),
            MockItem(
                id = 8,
                title = "Historic Castle",
                description = "An ancient castle perched on a hill, overlooking the valley below. Its stone walls tell stories of a bygone era, inviting visitors to explore its mysteries.",
                imageUrl = "https://picsum.photos/id/1040/600/400"
            ),
            MockItem(
                id = 9,
                title = "Vibrant Autumn",
                description = "A forest path covered in fallen leaves of vibrant red, orange, and yellow. The crisp autumn air and colorful scenery make for a perfect afternoon stroll.",
                imageUrl = "https://picsum.photos/id/1029/600/400"
            ),
            MockItem(
                id = 10,
                title = "Wild River",
                description = "A rushing river cutting through a deep gorge. The powerful flow of water carves the rocks, creating a dynamic and awe-inspiring natural landscape.",
                imageUrl = "https://picsum.photos/id/1019/600/400"
            )
        )
    }
}
