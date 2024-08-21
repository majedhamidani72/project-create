package com.example.cusrecyclerfaslha.ui.NavDrawing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.cusrecyclerfaslha.databinding.ActivityFeedbackBinding
import com.example.cusrecyclerfaslha.remoteServer.apiRepository.ApiRepository
import kotlinx.coroutines.launch

class FeedbackActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFeedbackBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeedbackBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // ارسال پیام
        binding.sendFeedback.setOnClickListener {
            val txtFeed = binding.etFeedback.text.toString()
            val txtName = binding.etFullname.text.toString()

            if (txtFeed.isNotEmpty() && txtName.isNotEmpty()) {
                // ترکیب نام و نظر در یک پیام
                val combinedMessage = "$txtName\n$txtFeed"
                sendFeedback(combinedMessage)
            } else {
                Toast.makeText(this, "فیلدهای بالا را پر کنید", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun sendFeedback(message: String) {
        // استفاده از coroutine برای اجرای متد suspend
        lifecycleScope.launch {
            try {
                // ارسال پیام ترکیبی
                val response = ApiRepository.instance.sendText("RpEjHCHHrRg59PYgbabuvDw1g92cnn0B76Nnkufd", message)

                // بررسی پاسخ
                if (response.isSuccessful) {
                    Toast.makeText(this@FeedbackActivity, "پیام شما با موفقیت ارسال گردید", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this@FeedbackActivity, "خطا در ارسال پیام", Toast.LENGTH_SHORT).show()
                }

            } catch (e: Exception) {
                // مدیریت خطاهای غیر از HTTP
                Toast.makeText(this@FeedbackActivity, "خطا در ارتباط با سرور", Toast.LENGTH_SHORT).show()
            }
        }
    }
}