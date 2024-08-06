package com.example.rv_withkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter(private val listHero: ArrayList<Hero>): RecyclerView.Adapter<adapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.findViewById(R.id.img_item_photo)
        val name : TextView = itemView.findViewById(R.id.tv_item_name)
        val desc : TextView = itemView.findViewById(R.id.tv_item_description)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row_her,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val(name,description,photo) = listHero[position]
        holder.img.setImageResource(photo)
        holder.name.text= name
        holder.desc.text = description

    }

    override fun getItemCount(): Int = listHero.size


}


