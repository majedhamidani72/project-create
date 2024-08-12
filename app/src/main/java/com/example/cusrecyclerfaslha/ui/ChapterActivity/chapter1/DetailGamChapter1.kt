package com.example.cusrecyclerfaslha.ui.ChapterActivity.chapter1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cusrecyclerfaslha.databinding.ActivityDetailGamChapter1Binding

private lateinit var binding: ActivityDetailGamChapter1Binding

class DetailGamChapter1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailGamChapter1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val position = intent.getIntExtra("ITEM_POSITION", -1)
        // نمایش جزئیات بر اساس position
        // مثلاً استفاده از position برای بارگذاری اطلاعات خاص
    }
}
