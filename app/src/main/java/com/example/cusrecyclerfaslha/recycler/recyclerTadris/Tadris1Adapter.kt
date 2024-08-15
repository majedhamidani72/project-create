package com.example.cusrecyclerfaslha.recycler.recyclerTadris


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cusrecyclerfaslha.databinding.ItemSubjectTadrisBinding

// تعریف کلاس آداپتر
class Tadris1Adapter(
    private val items: List<Pair<Int, String>>, // لیستی از زوج‌های عکس و متن
    private val onItemClick: (Int) -> Unit // کال‌بک برای کلیک روی آیتم‌ها
) : RecyclerView.Adapter<Tadris1Adapter.ViewHolder>() {

    // کلاس ViewHolder که مسئول نمایش هر آیتم است
    inner class ViewHolder(val binding: ItemSubjectTadrisBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            // تنظیم کلیکListener برای آیتم
            binding.root.setOnClickListener {
                onItemClick(adapterPosition)
            }
        }
    }

    // ساخت ViewHolder جدید برای هر آیتم
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemSubjectTadrisBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    // تنظیم داده‌ها برای ViewHolder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val (imageResId, text) = items[position]
        holder.binding.imgPdf.setImageResource(imageResId)
        holder.binding.textPdf.text = text
    }

    // تعداد آیتم‌ها در لیست
    override fun getItemCount(): Int = items.size
}
