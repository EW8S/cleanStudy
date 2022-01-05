package com.ew8s.cleandemo.presentation.choose_task

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ew8s.cleandemo.R
import com.ew8s.cleandemo.presentation.IChooseCallback

class ChooseAdapter(private var list: ArrayList<String>, private val callback: IChooseCallback) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ListItem(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ListItem) {
            holder.item.text = list[position]
            holder.lay_list.setOnClickListener {
                callback.listCallbackShort(list[position])
            }

            holder.lay_list.setOnLongClickListener {
                callback.listCallbackLong(list[position])
                return@setOnLongClickListener true
            }
        }
    }

    override fun getItemCount() = list.size

    fun setItems(items: ArrayList<String>) {
        list = items
    }

    inner class ListItem(view: View) : RecyclerView.ViewHolder(view) {
        var item: TextView = view.findViewById(R.id.tv_list_item)
        var lay_list: LinearLayout = view.findViewById(R.id.lay_list)
    }
}