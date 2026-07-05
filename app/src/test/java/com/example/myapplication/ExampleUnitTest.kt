package com.example.myapplication

import org.junit.Test
import org.junit.Assert.*

class ExampleUnitTest {

    @Test
    fun testPremiumFeaturesGeneration() {
        val features = MockDataGenerator.generatePremiumFeatures()
        assertNotNull("Features list should not be null", features)
        assertEquals("Should generate exactly 4 features", 4, features.size)

        val firstFeature = features[0]
        assertEquals("First feature ID should be 1", 1, firstFeature.id)
        assertEquals("First feature title mismatch", "Glassmorphism UI", firstFeature.title)
        assertTrue("Feature should be active", firstFeature.isActive)
    }

    @Test
    fun testUserProfileGeneration() {
        val userProfile = MockDataGenerator.generateUserProfile()
        assertNotNull("User profile should not be null", userProfile)
        assertEquals("User ID should be 1", 1, userProfile.id)
        assertEquals("User role should be Administrator", "Administrator", userProfile.role)
        assertEquals("Subscription level should be Pro Tier", "Pro Tier", userProfile.subscriptionLevel)
    }

    @Test
    fun testDashboardStatsGeneration() {
        val stats = MockDataGenerator.generateDashboardStats()
        assertNotNull("Dashboard stats should not be null", stats)
        assertEquals("Should generate exactly 3 stats", 3, stats.size)

        val uptimeStat = stats.find { it.title == "Uptime" }
        assertNotNull("Uptime stat should exist", uptimeStat)
        assertEquals("Uptime value should be 100%", "100%", uptimeStat?.value)
        assertEquals(0.0, uptimeStat?.changePercentage ?: -1.0, 0.0)
    }
}
