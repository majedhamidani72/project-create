package com.example.cusrecyclerfaslha.ui.ChapterActivity.chapter1

import DetailGamChapter1
import android.app.DownloadManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.content.ContextCompat.startActivity
import androidx.core.content.FileProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cusrecyclerfaslha.R
import com.example.cusrecyclerfaslha.databinding.ActivityChapter1Binding
import com.example.cusrecyclerfaslha.recycler.recyclerTadris.Tadris1Adapter
import com.example.cusrecyclerfaslha.ui.PdfAdapter
import java.io.File

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
            val intent = Intent(this, DetailGamChapter1::class.java)
            intent.putExtra("ITEM_POSITION", position)
            startActivity(intent)
        }

        binding.recyclerTadrisFasl1.layoutManager = LinearLayoutManager(this)
        binding.recyclerTadrisFasl1.adapter = adapter
    }

    private fun NamonesoalatFasl1() {
        // فرض کنید این URL‌ها از سرور دریافت شده است
        val pdfItems = listOf(
            Pair("نسخه 1: نمونه سوالات فصل اول همراه با جواب", "https://example.com/pdf1.pdf"),
            Pair("نسخه 2: نمونه سوالات فصل اول همراه با جواب", "https://example.com/pdf2.pdf"),
            Pair("نسخه 3: نمونه سوالات فصل اول همراه با جواب", "https://example.com/pdf3.pdf"),
            Pair("نسخه 4: نمونه سوالات فصل اول همراه با جواب", "https://example.com/pdf3.pdf"),
            Pair("نسخه 4: نمونه سوالات فصل اول همراه با جواب", "https://example.com/pdf3.pdf"),
            Pair("نسخه 5: نمونه سوالات فصل اول همراه با جواب", "https://example.com/pdf3.pdf"),
            Pair("نسخه 6: نمونه سوالات فصل اول همراه با جواب", "https://example.com/pdf3.pdf"),
            Pair("نسخه 7: نمونه سوالات فصل اول همراه با جواب", "https://example.com/pdf3.pdf"),

            )

        val adapter = PdfAdapter(this, pdfItems) { pdfUrl ->
            // دانلود و نمایش PDF
            downloadAndOpenPdf(pdfUrl)
        }

        binding.recyclerTadrisFasl1.layoutManager = LinearLayoutManager(this)
        binding.recyclerTadrisFasl1.adapter = adapter
    }


    private fun azmonOnlinFasl1() {
        // پیاده‌سازی عملیات خاص برای آزمون
    }



    //عملیات مربوط به دانلود نمونه سوالات

    private fun downloadAndOpenPdf(pdfUrl: String) {
        val fileName = Uri.parse(pdfUrl).lastPathSegment ?: "downloaded.pdf"
        val file = File(getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), fileName)

        if (file.exists()) {
            // فایل قبلاً دانلود شده است، بنابراین آن را باز کنید
            openPdf(file)
        } else {
            // فایل موجود نیست، بنابراین دانلود کنید
            val request = DownloadManager.Request(Uri.parse(pdfUrl))
                .setTitle("دانلود PDF")
                .setDescription("در حال دانلود PDF...")
                .setDestinationInExternalFilesDir(this, Environment.DIRECTORY_DOWNLOADS, fileName)
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)

            val downloadManager = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
            downloadManager.enqueue(request)

            Toast.makeText(this, "دانلود آغاز شد.", Toast.LENGTH_SHORT).show()

            // پس از دانلود، فایل را باز کنید
            // این قسمت ممکن است نیاز به استفاده از BroadcastReceiver برای اطلاع از پایان دانلود داشته باشد
            // یا استفاده از DownloadManager.Query برای بررسی وضعیت دانلود
            openPdf(file)
        }
    }

    private fun openPdf(file: File) {
        val uri = FileProvider.getUriForFile(this, "${packageName}.provider", file)
        val intent = Intent(Intent.ACTION_VIEW)
        intent.setDataAndType(uri, "application/pdf")
        intent.flags = Intent.FLAG_GRANT_READ_URI_PERMISSION
        startActivity(intent)
    }


}





