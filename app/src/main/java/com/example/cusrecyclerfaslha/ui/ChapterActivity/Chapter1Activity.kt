package com.example.cusrecyclerfaslha.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cusrecyclerfaslha.databinding.ActivityChapter1Binding

class Chapter1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityChapter1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChapter1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // دریافت اطلاعات از Intent
        val itemClicked = intent.getStringExtra("ITEM_CLICKED")

        // بر اساس آیتم کلیک شده عمل مناسب را انجام دهید
        when (itemClicked) {
            "Tadris" -> tadrisFasl1()
            "Gam" -> gamFasl1()
            "Namonesoalat" -> NamonesoalatFasl1()
            "Azmon" -> azmonOnlinFasl1()
        }
    }

    private fun tadrisFasl1() {
        // پیاده‌سازی عملیات خاص برای تدریس
        // مثلاً بارگذاری داده‌ها، تنظیم RecyclerView و غیره
    }

    private fun gamFasl1() {
        // پیاده‌سازی عملیات خاص برای گام
    }

    private fun NamonesoalatFasl1() {
        // پیاده‌سازی عملیات خاص برای نمونه سوالات
    }

    private fun azmonOnlinFasl1() {
        // پیاده‌سازی عملیات خاص برای آزمون
    }
}
