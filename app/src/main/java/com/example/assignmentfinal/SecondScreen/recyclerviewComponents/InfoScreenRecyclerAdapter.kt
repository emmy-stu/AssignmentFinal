package com.example.assignmentfinal.SecondScreen.recyclerviewComponents

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class InfoScreenRecyclerAdapter(val dataList: List<String>): RecyclerView.Adapter<InfoScreenListItemViewHolder>() {

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): InfoScreenListItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.viewholder_layout, parent, false)

        return InfoScreenListItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: InfoScreenListItemViewHolder, position: Int) {
         holder.firsttext?.text = dataList[position]
    }
}