package com.example.cusrecyclerfaslha.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cusrecyclerfaslha.R
import com.example.cusrecyclerfaslha.databinding.ItemSubjectNamonesoalatBinding

class PdfAdapter(
    private val context: Context,
    private val pdfItems: List<Pair<String, String>>, // لیست PDF‌ها شامل نام و URL
    private val onItemClick: (String) -> Unit // تابع برای کلیک روی آیتم
) : RecyclerView.Adapter<PdfAdapter.PdfViewHolder>() {

    inner class PdfViewHolder(private val binding: ItemSubjectNamonesoalatBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val pdfUrl = pdfItems[position].second
                    onItemClick(pdfUrl)
                }
            }
        }

        fun bind(pdfItem: Pair<String, String>) {
            // به‌روزرسانی ویوها با استفاده از View Binding
            binding.textPdf.text = pdfItem.first
            // تنظیم تصویر اگر نیاز است، مثلا برای PDF‌ها ممکن است نیازی به تصویر نباشد
             binding.itemImage.setImageResource(R.drawable.ic_pdf)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PdfViewHolder {
        val binding = ItemSubjectNamonesoalatBinding.inflate(LayoutInflater.from(context), parent, false)
        return PdfViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PdfViewHolder, position: Int) {
        val pdfItem = pdfItems[position]
        holder.bind(pdfItem)
    }

    override fun getItemCount() = pdfItems.size
}
