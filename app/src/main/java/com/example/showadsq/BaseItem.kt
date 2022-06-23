package com.example.showadsq

import androidx.recyclerview.widget.RecyclerView


abstract  class BaseItem {
    abstract fun itemType() :Int
    abstract fun Bind(recylerViewHolder: RecyclerView.ViewHolder , position: Int)
}