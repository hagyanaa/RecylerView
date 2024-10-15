package com.example.recylerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Adapter(private var itemList: List<Item>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    // ViewHolder untuk item layout
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewName: TextView = itemView.findViewById(R.id.textViewName)
    }

    // Inflate layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    // Bind data ke ViewHolder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.textViewName.text = item.name
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    // Update data
    fun updateData(newList: List<Item>) {
        itemList = newList
        notifyDataSetChanged()
    }
}
