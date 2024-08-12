package com.example.cusrecyclerfaslha.ui.ChapterActivity.chapter1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cusrecyclerfaslha.R
import com.example.cusrecyclerfaslha.databinding.ActivityChapter1Binding
import com.example.cusrecyclerfaslha.recycler.recyclerTadris.Tadris1Adapter

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
        // لیست آیتم‌ها برای نمایش در RecyclerView
        val items = listOf(
            Pair(R.drawable.imgfasl1, "فعالیت صفحه 2و 3"),
            Pair(R.drawable.imgfasl1, "کاردرکلاس صفحه 3و4"),
            Pair(R.drawable.imgfasl1, "فعالیت صفحه 4"),
            Pair(R.drawable.imgfasl1, "کاردرکلاس صفحه 5"),
            Pair(R.drawable.imgfasl1, "تمرین صفحه 5"),
            Pair(R.drawable.imgfasl1, "فعالیت صفحه 6 و 7"),
            Pair(R.drawable.imgfasl1, "کاردرکلاس صفحه 7 و 8"),
            Pair(R.drawable.imgfasl1, "فعالیت صفحه 8"),
            Pair(R.drawable.imgfasl1, "کاردر کلاس صفحه 8"),
            Pair(R.drawable.imgfasl1, "تمرین صفحه 9"),
            Pair(R.drawable.imgfasl1, "فعالیت صفحه 10 و 11"),
            Pair(R.drawable.imgfasl1, "کاردرکلاس صفحه 11"),
            Pair(R.drawable.imgfasl1, "فعالیت صفحه 12"),
            Pair(R.drawable.imgfasl1, "کاردرکلاس صفحه 12"),
            Pair(R.drawable.imgfasl1, "تمرین صفحه 13"),
            Pair(R.drawable.imgfasl1, "فعالیت صفحه 14"),
            Pair(R.drawable.imgfasl1, "اردرکلاس صفحه 15"),
            Pair(R.drawable.imgfasl1, "فعالیت صفحه 16"),
            Pair(R.drawable.imgfasl1, "کاردرکلاس صفحه 16"),
            Pair(R.drawable.imgfasl1, "تمرین صفحه 17"),
            Pair(R.drawable.imgfasl1, "مرور فصل صفحه 18 و 19")
        )

        val adapter = Tadris1Adapter(items) { position ->
            val intent = Intent(this, DetailTadrisChapter1::class.java)
            intent.putExtra("ITEM_POSITION", position)
            startActivity(intent)
        }

        binding.recyclerTadrisFasl1.layoutManager = LinearLayoutManager(this)
        binding.recyclerTadrisFasl1.adapter = adapter
    }

    private fun gamFasl1() {
        // پیاده‌سازی عملیات خاص برای گام
        // لیست آیتم‌ها برای نمایش در RecyclerView
        val items = listOf(
            Pair(R.drawable.imgfasl1, "فعالیت صفحه 2و 3"),
            Pair(R.drawable.imgfasl1, "کاردرکلاس صفحه 3و4"),
            Pair(R.drawable.imgfasl1, "فعالیت صفحه 4"),
            Pair(R.drawable.imgfasl1, "کاردرکلاس صفحه 5"),
            Pair(R.drawable.imgfasl1, "تمرین صفحه 5"),
            Pair(R.drawable.imgfasl1, "فعالیت صفحه 6 و 7"),
            Pair(R.drawable.imgfasl1, "کاردرکلاس صفحه 7 و 8"),
            Pair(R.drawable.imgfasl1, "فعالیت صفحه 8"),
            Pair(R.drawable.imgfasl1, "کاردر کلاس صفحه 8"),
            Pair(R.drawable.imgfasl1, "تمرین صفحه 9"),
            Pair(R.drawable.imgfasl1, "فعالیت صفحه 10 و 11"),
            Pair(R.drawable.imgfasl1, "کاردرکلاس صفحه 11"),
            Pair(R.drawable.imgfasl1, "فعالیت صفحه 12"),
            Pair(R.drawable.imgfasl1, "کاردرکلاس صفحه 12"),
            Pair(R.drawable.imgfasl1, "تمرین صفحه 13"),
            Pair(R.drawable.imgfasl1, "فعالیت صفحه 14"),
            Pair(R.drawable.imgfasl1, "اردرکلاس صفحه 15"),
            Pair(R.drawable.imgfasl1, "فعالیت صفحه 16"),
            Pair(R.drawable.imgfasl1, "کاردرکلاس صفحه 16"),
            Pair(R.drawable.imgfasl1, "تمرین صفحه 17"),
            Pair(R.drawable.imgfasl1, "مرور فصل صفحه 18 و 19")
        )

        val adapter = Tadris1Adapter(items) { position ->
            val intent = Intent(this, DetailTadrisChapter1::class.java)
            intent.putExtra("ITEM_POSITION", position)
            startActivity(intent)
        }

        binding.recyclerTadrisFasl1.layoutManager = LinearLayoutManager(this)
        binding.recyclerTadrisFasl1.adapter = adapter
    }

    private fun NamonesoalatFasl1() {
        // پیاده‌سازی عملیات خاص برای نمونه سوالات
    }

    private fun azmonOnlinFasl1() {
        // پیاده‌سازی عملیات خاص برای آزمون
    }
}
