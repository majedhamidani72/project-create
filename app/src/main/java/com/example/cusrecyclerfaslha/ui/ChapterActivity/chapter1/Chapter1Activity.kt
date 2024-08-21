package com.example.cusrecyclerfaslha.ui.ChapterActivity.chapter1

import android.app.DownloadManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cusrecyclerfaslha.databinding.ActivityChapter1Binding
import com.example.cusrecyclerfaslha.recycler.recyclerTadris.Tadris1gam1Adapter
import com.example.cusrecyclerfaslha.remoteServer.RetrofitService
import com.example.cusrecyclerfaslha.ui.PdfAdapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
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
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val tadrisList = RetrofitService.apiService.getTadrisList()
                withContext(Dispatchers.Main) {
                    setupRecyclerView(tadrisList)
                }
            } catch (e: Exception) {
                // مدیریت خطا
                e.printStackTrace()
            }
        }
    }

    private fun gamFasl1() {
        // پیاده‌سازی عملیات خاص برای گام
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val gamList = RetrofitService.apiService.getGamList()
                withContext(Dispatchers.Main) {
                    setupRecyclerView(gamList)
                }
            } catch (e: Exception) {
                // مدیریت خطا
                e.printStackTrace()
            }
        }
    }

    private fun setupRecyclerView(items: List<Pair<Int, String>>) {
        val adapter = Tadris1gam1Adapter(items) { position ->
            // حذف انتقال به DetailTadrisChapter1
            // به جای آن، اینجا می‌توانید اطلاعات را نمایش دهید یا عملیات خاصی انجام دهید
            Toast.makeText(this, "Item clicked: ${items[position].second}", Toast.LENGTH_SHORT).show()
        }
        binding.recyclerTadrisFasl1.layoutManager = LinearLayoutManager(this)
        binding.recyclerTadrisFasl1.adapter = adapter
    }


    private fun NamonesoalatFasl1() {
        // دریافت لیست نمونه سوالات از سرور
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val pdfItems = RetrofitService.apiService.getPdfList() // فرض کنید این تابع لیست PDF‌ها را از سرور دریافت می‌کند
                withContext(Dispatchers.Main) {
                    setupPdfRecyclerView(pdfItems)
                }
            } catch (e: Exception) {
                // مدیریت خطا
                e.printStackTrace()
            }
        }
    }

    private fun setupPdfRecyclerView(pdfItems: List<Pair<String, String>>) {
        val adapter = PdfAdapter(this, pdfItems) { pdfUrl ->
            // دانلود و نمایش PDF
            downloadAndOpenPdf(pdfUrl)
        }

        binding.recyclerTadrisFasl1.layoutManager = LinearLayoutManager(this)
        binding.recyclerTadrisFasl1.adapter = adapter
    }
    private fun downloadAndOpenPdf(pdfUrl: String) {
        val fileName = Uri.parse(pdfUrl).lastPathSegment ?: "downloaded.pdf"
        val file = File(getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), fileName)

        if (file.exists()) {
            // فایل قبلاً دانلود شده است، بنابراین آن را باز کنید
            openPdf(file)
        } else {
            val request = DownloadManager.Request(Uri.parse(pdfUrl))
                .setTitle("دانلود PDF")
                .setDescription("در حال دانلود PDF...")
                .setDestinationInExternalFilesDir(this, Environment.DIRECTORY_DOWNLOADS, fileName)
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)

            val downloadManager = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
            val downloadId = downloadManager.enqueue(request)

            // استفاده از BroadcastReceiver برای دریافت اطلاعیه پس از اتمام دانلود
            val onComplete = object : BroadcastReceiver() {
                override fun onReceive(context: Context?, intent: Intent?) {
                    val id = intent?.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID, -1)
                    if (id == downloadId) {
                        openPdf(file) // باز کردن فایل پس از اتمام دانلود
                        unregisterReceiver(this) // لغو ثبت BroadcastReceiver
                    }
                }
            }

            registerReceiver(onComplete, IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE))
        }
    }

    private fun openPdf(file: File) {
        val uri = FileProvider.getUriForFile(this, "${packageName}.provider", file)
        val intent = Intent(Intent.ACTION_VIEW)
        intent.setDataAndType(uri, "application/pdf")
        intent.flags = Intent.FLAG_GRANT_READ_URI_PERMISSION
        startActivity(intent)
    }


    private fun azmonOnlinFasl1() {
        Toast.makeText(this, "این  قسمت به زودی فعال خواهد شد", Toast.LENGTH_SHORT).show()
        // پیاده‌سازی عملیات خاص برای آزمون
    }


    //عملیات مربوط به دانلود نمونه سوالات



}





