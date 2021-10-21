package com.example.multipleactivities

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multipleactivities.databinding.ItemRowBinding

class rvAdaptar (val list: ArrayList<String>): RecyclerView.Adapter<rvAdaptar.ItemeHolder>(){
    class ItemeHolder (val binding: ItemRowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemeHolder {

        return ItemeHolder(ItemRowBinding.inflate(LayoutInflater.from(
            parent.context),
            parent,
            false)
        )

    }

    override fun onBindViewHolder(holder: ItemeHolder, position: Int) {
        val data = list[position]
        holder.binding.apply {
            txtRV.text = data
        }
    }

    override fun getItemCount()= list.size

}