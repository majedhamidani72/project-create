package com.example.cusrecyclerfaslha.ui.NavDrawing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.cusrecyclerfaslha.databinding.ActivityFeedbackBinding
import com.example.cusrecyclerfaslha.remoteServer.apiRepository.ApiRepository

class FeedbackActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFeedbackBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeedbackBinding.inflate(layoutInflater)
        setContentView(binding.root)



        //ارسال پیام
        binding.sendFeedback.setOnClickListener {
            val txtFeed = binding.etFeedback.text.toString()
            val txtName = binding.etFullname.text.toString()

            if (txtFeed.isNotEmpty() || txtName.isNotEmpty()) {
                ApiRepository.instance.senText("RpEjHCHHrRg59PYgbabuvDw1g92cnn0B76Nnkufd",txtFeed)
                ApiRepository.instance.senText("RpEjHCHHrRg59PYgbabuvDw1g92cnn0B76Nnkufd",txtName)
                Toast.makeText(this, "پیام شما با موفقیت ارسال گردید", Toast.LENGTH_SHORT).show()

            }else{
                Toast.makeText(this, " فیلد های بالا را پر کنید", Toast.LENGTH_SHORT).show()

            }

        }

    }
}