package com.example.kylejablonski.jetpacksample.ui.main

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.kylejablonski.jetpacksample.R
import kotlinx.android.synthetic.main.main_list_item.view.*

class DataAdapter(
        private val context: Context,
        private val items: List<String> = listOf(),
        private val listener: Listener
        ) : RecyclerView.Adapter<DataAdapter.ViewHolder>() {

    interface Listener {
        fun onClick(item: String)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.main_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = items[position]

        holder.itemView.setOnClickListener {
            listener.onClick(items[position])
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemTitle = view.textViewItemTitle as TextView
    }
}