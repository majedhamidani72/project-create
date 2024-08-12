package com.example.cusrecyclerfaslha.ui.ChapterActivity.chapter1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cusrecyclerfaslha.databinding.ActivityDetailTadrisChapter1Binding

private lateinit var binding: ActivityDetailTadrisChapter1Binding
class DetailTadrisChapter1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailTadrisChapter1Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val position = intent.getIntExtra("ITEM_POSITION", -1)
        // نمایش جزئیات بر اساس position
        // مثلاً استفاده از position برای بارگذاری اطلاعات خاص
    }
}