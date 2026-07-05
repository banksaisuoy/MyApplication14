package com.example.myapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testGreetingAndProfileDataIsDisplayed() {
        // Assert Greeting Text contains mock data name
        onView(withId(R.id.tvGreeting)).check(matches(withText("Welcome, Premium User")))
        onView(withId(R.id.tvGreeting)).check(matches(isDisplayed()))

        // Assert Profile Card Data
        onView(withId(R.id.tvProfileName)).check(matches(withText("Premium User")))
        onView(withId(R.id.tvProfileName)).check(matches(isDisplayed()))

        onView(withId(R.id.tvProfileRole)).check(matches(withText("Administrator | Pro Tier")))
        onView(withId(R.id.tvProfileRole)).check(matches(isDisplayed()))
    }

    @Test
    fun testDashboardStatsAreDisplayed() {
        onView(withId(R.id.tvStatTitle)).check(matches(withText("Performance Score")))
        onView(withId(R.id.tvStatTitle)).check(matches(isDisplayed()))

        onView(withId(R.id.tvStatValue)).check(matches(withText("99.9%")))
        onView(withId(R.id.tvStatValue)).check(matches(isDisplayed()))
    }

    @Test
    fun testCardClickInteraction() {
        // Click the profile card to trigger scale animation
        // We verify that it doesn't crash upon interacting
        onView(withId(R.id.cardProfile)).check(matches(isDisplayed())).perform(click())
        onView(withId(R.id.cardStats)).check(matches(isDisplayed())).perform(click())
    }
}
