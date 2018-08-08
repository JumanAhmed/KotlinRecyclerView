package com.app.plab.kotlin.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.plab.kotlin.R
import kotlinx.android.synthetic.main.animal_list_item.view.*

class AnimalAdapter(val myAndroidOsList: List<String>, val context: Context) : RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {
    override fun getItemCount(): Int {
        return myAndroidOsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.bindItems(myAndroidOsList[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.animal_list_item,
                parent, false)
        return ViewHolder(v)
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(myAndroidOsListName: String) {
            itemView.tv_animal_type.text = myAndroidOsListName
        }
    }
}