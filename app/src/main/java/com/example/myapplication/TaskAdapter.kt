package com.example.myapplication

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class TaskAdapter(private var tasks: List<Task>) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    class TaskViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle: TextView = view.findViewById(R.id.tvTitle)
        val tvDescription: TextView = view.findViewById(R.id.tvDescription)
        val tvStatus: TextView = view.findViewById(R.id.tvStatus)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_task, parent, false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = tasks[position]
        holder.tvTitle.text = task.title
        holder.tvDescription.text = task.description
        holder.tvStatus.text = task.status.name

        val statusColor = when (task.status) {
            TaskStatus.TODO -> ContextCompat.getColor(holder.itemView.context, R.color.purple_500)
            TaskStatus.IN_PROGRESS -> ContextCompat.getColor(holder.itemView.context, R.color.teal_700)
            TaskStatus.DONE -> ContextCompat.getColor(holder.itemView.context, R.color.teal_200)
        }

        holder.tvStatus.backgroundTintList = ColorStateList.valueOf(statusColor)
    }

    override fun getItemCount() = tasks.size

    fun updateTasks(newTasks: List<Task>) {
        tasks = newTasks
        notifyDataSetChanged()
    }
}
