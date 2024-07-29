package com.example.cusrecyclerfaslha.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cusrecyclerfaslha.databinding.ActivitySubjectsBinding

private lateinit var binding: ActivitySubjectsBinding
class SubjectsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubjectsBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

}