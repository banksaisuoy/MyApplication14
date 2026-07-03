package com.example.myapplication

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.contrib.RecyclerViewActions

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.myapplication", appContext.packageName)
    }

    @Test
    fun testRecyclerViewIsDisplayedAndHasItems() {
        ActivityScenario.launch(MainActivity::class.java)

        // Check if RecyclerView is displayed
        onView(withId(R.id.recyclerView)).check(matches(isDisplayed()))

        // Scroll to the 10th item and verify its title
        onView(withId(R.id.recyclerView))
            .perform(RecyclerViewActions.scrollToPosition<MockItemAdapter.MockViewHolder>(9))

        onView(withText("Item Title 10")).check(matches(isDisplayed()))
    }
}
