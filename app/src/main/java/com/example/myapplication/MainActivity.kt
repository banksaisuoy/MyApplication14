package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.widget.Toolbar
import com.google.android.material.appbar.CollapsingToolbarLayout

class MainActivity : AppCompatActivity() {

    private lateinit var taskAdapter: TaskAdapter
    private val taskList = mutableListOf<Task>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupToolbar()
        setupRecyclerView()
        setupFab()
        loadMockData()
    }

    private fun setupToolbar() {
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val collapsingToolbarLayout = findViewById<CollapsingToolbarLayout>(R.id.collapsingToolbarLayout)
        collapsingToolbarLayout?.title = getString(R.string.app_name)
    }

    private fun setupRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        taskAdapter = TaskAdapter(taskList)
        recyclerView.adapter = taskAdapter
    }

    private fun setupFab() {
        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener { view ->
            val newTask = Task(
                id = taskList.size + 1,
                title = "New Task ${taskList.size + 1}",
                description = "Automatically generated description for task ${taskList.size + 1}.",
                status = TaskStatus.values().random()
            )
            taskList.add(0, newTask)
            taskAdapter.notifyItemInserted(0)
            findViewById<RecyclerView>(R.id.recyclerView).scrollToPosition(0)

            Snackbar.make(view, getString(R.string.task_added), Snackbar.LENGTH_LONG).show()
        }
    }

    private fun loadMockData() {
        val mockData = listOf(
            Task(1, "Complete project presentation", "Create slides and finalize talking points for the upcoming client meeting.", TaskStatus.IN_PROGRESS),
            Task(2, "Review PRs", "Go through the open pull requests and leave constructive feedback.", TaskStatus.TODO),
            Task(3, "Update dependencies", "Check for any outdated packages in the project and update them to the latest stable versions.", TaskStatus.DONE),
            Task(4, "Write unit tests", "Increase code coverage by writing unit tests for the core logic modules.", TaskStatus.TODO),
            Task(5, "Refactor UI components", "Enhance the reusability of UI components by extracting common logic.", TaskStatus.IN_PROGRESS),
            Task(6, "Deploy to staging", "Push the latest build to the staging environment for QA testing.", TaskStatus.DONE),
            Task(7, "Analyze user feedback", "Review the latest feedback from beta testers and create a summary report.", TaskStatus.TODO),
            Task(8, "Optimize database queries", "Identify slow-performing database queries and optimize them with indexes.", TaskStatus.IN_PROGRESS),
            Task(9, "Plan next sprint", "Define the goals and scope for the upcoming development sprint.", TaskStatus.TODO),
            Task(10, "Take a break", "Go for a walk and relax for 15 minutes.", TaskStatus.DONE)
        )
        taskList.clear()
        taskList.addAll(mockData)
        taskAdapter.notifyItemRangeInserted(0, mockData.size)
    }
}
