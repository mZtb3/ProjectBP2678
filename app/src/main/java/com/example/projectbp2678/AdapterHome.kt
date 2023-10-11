package com.example.projectbp2678

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class AdapterHome(private val listBuku:List<BukuModel>):
        RecyclerView.Adapter<AdapterHome.ViewHolder>(){
    class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
        val image:ImageView = itemView.findViewById(R.id.imageViewBuku1)
        val title:TextView = itemView.findViewById(R.id.textViewUser)
        val desc:TextView = itemView.findViewById(R.id.textViewInfo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.card_layout_home,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterHome.ViewHolder, position: Int) {
        val modelbuku = listBuku[position]

        holder.image.setImageResource(modelbuku.image)
        holder.title.text = modelbuku.title
        holder.desc.text = modelbuku.desc
    }

    override fun getItemCount(): Int {
        return listBuku.size
    }

}