package com.example.cusrecyclerfaslha.ui.NavDrawing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cusrecyclerfaslha.databinding.ActivityFeedbackBinding

class FeedbackActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFeedbackBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeedbackBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Handle submit button click
        binding.btnSubmitFeedback.setOnClickListener {
            val feedbackText = binding.etFeedback.text.toString()
            if (feedbackText.isNotEmpty()) {
                // Here you can send the feedback to a server or handle it as needed
                finish() // Close the activity after feedback is submitted
            }
        }

    }
}