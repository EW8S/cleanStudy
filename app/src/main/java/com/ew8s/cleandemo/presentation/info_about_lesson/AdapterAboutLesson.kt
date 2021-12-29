package com.ew8s.cleandemo.presentation.info_about_lesson

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ew8s.cleandemo.R
import com.ew8s.cleandemo.presentation.IChooseCallback
import com.ew8s.cleandemo.presentation.models.ModelLesson

class AdapterAboutLesson(var list: ModelLesson, private val callback: IChooseCallback) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_task, parent, false)
        return TasksItem(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is TasksItem) {
            holder.ru.text = list[position].ru
            holder.en.text = list[position].en
            holder.lay_task.setOnLongClickListener {
                callback.listCallbackLong(position.toString())
                return@setOnLongClickListener true
            }
        }
    }

    override fun getItemCount() = list.size

    fun setItems(data: ModelLesson){
        list = data
    }

    inner class TasksItem(view: View) : RecyclerView.ViewHolder(view) {
        var ru: TextView = view.findViewById(R.id.tv_item_list_task_ru)
        var en: TextView = view.findViewById(R.id.tv_item_list_task_en)
        var lay_task: LinearLayout = view.findViewById(R.id.lay_item_list_task)
    }
}