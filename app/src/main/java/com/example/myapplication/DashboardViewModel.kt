package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {
    private val _dashboardItems = MutableLiveData<List<DashboardItem>>()
    val dashboardItems: LiveData<List<DashboardItem>> = _dashboardItems

    init {
        loadData()
    }

    private fun loadData() {
        _dashboardItems.value = MockDataGenerator.getMockData()
    }
}
