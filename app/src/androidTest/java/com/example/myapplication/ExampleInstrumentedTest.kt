package com.example.myapplication

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.core.app.ActivityScenario
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun testMainActivity_loadsAndDisplaysData() {
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            onView(withId(R.id.headerText)).check(matches(isDisplayed()))
            onView(withText("Breathtaking Mock Data UI")).check(matches(isDisplayed()))
            onView(withId(R.id.recyclerView)).check(matches(isDisplayed()))
        }
    }
}
