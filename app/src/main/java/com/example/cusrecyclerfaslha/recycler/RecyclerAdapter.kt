package com.example.cusrecyclerfaslha.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cusrecyclerfaslha.databinding.ItemRecyclerBinding

class RecyclerAdapter(
    private val num : Int
) : RecyclerView.Adapter<RecyclerAdapter.CustomViewHolder>() {

    inner class CustomViewHolder(
        private val binding: ItemRecyclerBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun setData() {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val binding = ItemRecyclerBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return CustomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.setData()
    }

    override fun getItemCount() = num
}