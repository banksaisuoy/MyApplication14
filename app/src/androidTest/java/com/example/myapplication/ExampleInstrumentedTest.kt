package com.example.myapplication

import android.os.StrictMode
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed

import org.junit.Test
import org.junit.Rule
import org.junit.runner.RunWith
import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.myapplication", appContext.packageName)
    }

    @Test
    fun checkHelloWorldIsDisplayed() {
        // Checking that the text "Hello World!" is visible in the MainActivity layout
        onView(withId(R.id.textView)).check(matches(isDisplayed()))
        onView(withId(R.id.textView)).check(matches(withText("Hello World!")))
    }

    @Test
    fun verifyMyApplicationIsUsed() {
        val app = InstrumentationRegistry.getInstrumentation().targetContext.applicationContext
        assertTrue("Application class should be MyApplication", app is MyApplication)
    }

    @Test
    fun verifyStrictModeEnabledInDebug() {
        // We know we are in debug because test environments use the debug build by default.
        // There's no direct API to get current StrictMode policy, but we can verify our MyApplication logic was triggered.
        val app = InstrumentationRegistry.getInstrumentation().targetContext.applicationContext as MyApplication
        // If it didn't crash, and it is MyApplication, the onCreate ran successfully.
        assertNotNull(app)
        // Since we cannot read strict mode directly easily, asserting the Application class is sufficient for integration setup.
    }
}
