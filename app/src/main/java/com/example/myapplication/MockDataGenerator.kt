package com.example.myapplication

data class PremiumFeature(
    val id: Int,
    val title: String,
    val description: String,
    val isActive: Boolean
)

data class UserProfile(
    val id: Int,
    val name: String,
    val role: String,
    val subscriptionLevel: String
)

data class DashboardStat(
    val title: String,
    val value: String,
    val changePercentage: Double
)

object MockDataGenerator {
    fun generatePremiumFeatures(): List<PremiumFeature> {
        return listOf(
            PremiumFeature(1, "Glassmorphism UI", "Experience a sleek, modern, and frosted glass design system.", true),
            PremiumFeature(2, "Micro-Animations", "Smooth, responsive interactions designed to delight users.", true),
            PremiumFeature(3, "Auto-Mocked Data", "Never see an empty state with robust fallback systems.", true),
            PremiumFeature(4, "Zero Defects", "Fully unit-tested and robust infrastructure ensuring zero errors.", true)
        )
    }

    fun generateUserProfile(): UserProfile {
        return UserProfile(1, "Premium User", "Administrator", "Pro Tier")
    }

    fun generateDashboardStats(): List<DashboardStat> {
        return listOf(
            DashboardStat("Performance Score", "99.9%", 1.5),
            DashboardStat("User Satisfaction", "4.9/5", 0.3),
            DashboardStat("Uptime", "100%", 0.0)
        )
    }
}
