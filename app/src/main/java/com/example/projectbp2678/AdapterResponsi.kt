package com.example.projectbp2678

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class AdapterResponsi(private val listSma:List<SmaResponsi>):
        RecyclerView.Adapter<AdapterResponsi.ViewHolder>(){

    class ViewHolder(ItemView: View):RecyclerView.ViewHolder(ItemView){
        val image:ImageView = itemView.findViewById(R.id.imageViewSMA1)
        val title:TextView = itemView.findViewById(R.id.textViewSMA1)
        val desc:TextView = itemView.findViewById(R.id.textViewSMA1_2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterResponsi.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.car_layout_responsi,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterResponsi.ViewHolder, position: Int) {
        val SmaResponsi = listSma[position]

        holder.image.setImageResource(SmaResponsi.image)
        holder.title.text = SmaResponsi.title
        holder.desc.text = SmaResponsi.desc
    }

    override fun getItemCount(): Int {
        return listSma.size
    }

}