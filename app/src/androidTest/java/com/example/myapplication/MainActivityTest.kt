package com.example.myapplication

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Test
    fun testMainActivityLaunchesAndDisplaysHelloWorld() {
        // Launch the MainActivity
        ActivityScenario.launch(MainActivity::class.java)

        // Verify that the TextView with id textView is displayed on the screen
        onView(withId(R.id.textView)).check(matches(isDisplayed()))
    }
}
