package com.example.myapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
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
    fun recyclerView_isDisplayed() {
        onView(withId(R.id.recyclerView)).check(matches(isDisplayed()))
    }

    @Test
    fun firstItem_isDisplayedCorrectly() {
        // Simple check to ensure that text for the first item is rendered
        onView(withText("Awesome Title 1")).check(matches(isDisplayed()))
        onView(withText("This is a detailed description for item number 1. It showcases our breathtaking UI.")).check(matches(isDisplayed()))
    }
}
