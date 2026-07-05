package com.example.myapplication

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Test
    fun testMainActivityDisplaysGeneratedItemsCount() {
        ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.textView)).check(matches(withText("Generated 5 items")))
    }
}
