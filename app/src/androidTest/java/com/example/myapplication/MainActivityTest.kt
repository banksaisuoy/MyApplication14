package com.example.myapplication

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.CoreMatchers.anything
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.Espresso.onData

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Test
    fun testListViewIsDisplayed() {
        val scenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.mockDataListView)).check(matches(isDisplayed()))
        scenario.close()
    }

    @Test
    fun testListViewShowsMockData() {
        val scenario = ActivityScenario.launch(MainActivity::class.java)
        onData(anything())
            .inAdapterView(withId(R.id.mockDataListView))
            .atPosition(0)
            .check(matches(withText("Mock Data Item 1")))

        onData(anything())
            .inAdapterView(withId(R.id.mockDataListView))
            .atPosition(19)
            .check(matches(withText("Mock Data Item 20")))

        scenario.close()
    }
}
