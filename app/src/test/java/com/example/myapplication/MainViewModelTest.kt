package com.example.myapplication

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var viewModel: MainViewModel

    @Before
    fun setup() {
        viewModel = MainViewModel()
    }

    @Test
    fun loadData_updatesLiveDataWithMockData() {
        // Arrange
        val expectedData = "Hello from MockDataGenerator!"

        // Act
        viewModel.loadData()

        // Assert
        assertEquals(expectedData, viewModel.data.value)
    }
}
